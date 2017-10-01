package com.concept.java.design.robot;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 11:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sandwich extends Item{

    private static final Long ID = 10082L;
    private static final String NAME = "sandwich";
    private static final double PRICE = 110;

    public Sandwich(int quantity){
        setId(ID);
        setName(NAME);
        setPrice(PRICE);
        setQuantity(quantity);
    }

    private void processBread(){

    }

    private void processVegetable(){

    }

    private void processPack(){

    }

    @Override
    protected void prepare() {
        processBread();
        processVegetable();
        processPack();
    }
}
