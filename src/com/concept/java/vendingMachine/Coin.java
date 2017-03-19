package com.concept.java.vendingMachine;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 3/13/17
 * Time: 9:55 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Coin {

    RUPEE_10(10), RUPEE_20(20), RUPEE_50(50), RUPEE_100(100);
    private int denomination;

    private Coin(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }


}
