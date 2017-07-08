package com.concept.java.connectionpool;

import java.util.Vector;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/4/17
 * Time: 11:45 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class ConnectionPool<T> {

    private static final Integer MAX_CONNECTION = 10;
    private static final Integer INITIAL_CONNECTION = 5;
    private static final Boolean WAIT_IF_BUSY = true;

    private int initialConnection;
    private int maxConnection;
    private Vector<T> availableConnection;
    private Vector<T> busyConnection;
    private boolean pendingConnection = false;
    private boolean waitIfBusy;


    public ConnectionPool() {
        init(INITIAL_CONNECTION, MAX_CONNECTION, WAIT_IF_BUSY);
    }

    public ConnectionPool(int initialConnection, int maxConnection, boolean waitIfBusy) {
        init(initialConnection, maxConnection, waitIfBusy);
    }

    private void init(int initialConnection, int maxConnection, boolean waitIfBusy) {
        this.initialConnection = initialConnection;
        this.maxConnection = maxConnection;
        this.waitIfBusy = waitIfBusy;
        this.availableConnection = new Vector<T>(this.initialConnection);
        this.busyConnection = new Vector<T>(0);
        initialize();
    }

    public abstract T createObject()throws Exception;

    public T borrow() throws ConnectionException {
        if (!this.availableConnection.isEmpty()) {
            T object = this.availableConnection.lastElement();
            int lastEleIndex = this.availableConnection.size() - 1;
            this.availableConnection.removeElementAt(lastEleIndex);
            if (isClosed(object)) {
                notifyAll();
                object = borrow();
            } else {
                this.busyConnection.add(object);
            }
            return object;
        } else {
            if (this.busyConnection.size() < this.maxConnection && !this.pendingConnection) {
                this.pendingConnection = true;
                T object = null;
                try {
                    object = createObject();
                } catch (Exception e) {
                    throw new ConnectionException(e.getMessage());
                }
                this.busyConnection.add(object);
                return object;
            } else {
                if (!waitIfBusy)
                    throw new ConnectionException("Pool limit reached max");
                else {
                    try {
                        wait(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return borrow();
            }
        }
    }

    public void returnObject(T object) {
        if (null == object)
            return;
        this.availableConnection.add(object);
        this.busyConnection.remove(object);
    }

    private void initialize() throws ConnectionException{
        for (int i = 0; i < this.initialConnection; i++) {
            try {
                this.availableConnection.add(createObject());
            } catch (Exception e) {
                throw new ConnectionException(e.getMessage());
            }
        }
    }

    public void close() {
        for (T object : this.availableConnection) {
            closeConnection(object);
        }
        for (T object : this.busyConnection) {
            closeConnection(object);
        }
        this.availableConnection = new Vector<T>(0);
        this.busyConnection = new Vector<T>(0);
    }

    public abstract void close(T object);

    public abstract boolean isClosed(T object);

    private void closeConnection(T object) {
        this.busyConnection.remove(object);
        close(object);
    }


}
