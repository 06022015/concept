package com.concept.java.vendingMachine;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 3/13/17
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class SoldOutException extends RuntimeException {

    private String message;

    public SoldOutException(String string) {
        this.message = string;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
