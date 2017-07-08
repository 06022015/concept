package com.concept.java.connectionpool;

import java.sql.*;
import java.sql.Connection;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/5/17
 * Time: 12:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class SqlConnectionPool extends ConnectionPool<Connection>{

    private String url;
    private String username;
    private String password;

    public SqlConnectionPool(){
        super();
    }

    public SqlConnectionPool(int initialConnection, int maxConnection, boolean waitIfBusy){
        super(initialConnection, maxConnection, waitIfBusy);
    }


    
    @Override
    public Connection createObject() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(getUrl(), getUsername(), getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void close(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(null != connection && !connection.isClosed())
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean isClosed(Connection connection) {
        try {
           return connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
