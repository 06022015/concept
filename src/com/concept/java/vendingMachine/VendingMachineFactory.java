package com.concept.java.vendingMachine;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 3/13/17
 * Time: 9:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class VendingMachineFactory {

    public static VendingMachine createVendingMachine() {
        return new CustomVendingMachine();
    }

}
