package com.concept.java.vendingMachine;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 3/13/17
 * Time: 9:50 PM
 * To change this template use File | Settings | File Templates.
 */
public interface VendingMachine {

    public long selectItemAndGetPrice(Item item);

    public void insertCoin(Coin coin);

    public List<Coin> refund();

    public Bucket<Item, List<Coin>> collectItemAndChange();

    public void reset();


}
