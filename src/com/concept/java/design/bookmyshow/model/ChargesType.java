package com.concept.java.design.bookmyshow.model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 9:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChargesType {

    private List<String>  names;
    private List<Double> charges;


    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<Double> getCharges() {
        return charges;
    }

    public void setCharges(List<Double> charges) {
        this.charges = charges;
    }
}
