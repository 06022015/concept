package com.concept.java.connectionpool;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/5/17
 * Time: 12:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConnectionException extends RuntimeException{
    
    public ConnectionException(){}
    
    public ConnectionException(String message){
        System.out.print(message);
    }
    
}
