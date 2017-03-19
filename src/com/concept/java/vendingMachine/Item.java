package com.concept.java.vendingMachine;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 3/13/17
 * Time: 9:51 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Item {


    COKE("Coke", 25), PEPSI("Pepsi", 35), SODA("Soda", 45);
    private String name;
    private int price;

    private Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }


}
