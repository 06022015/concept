package com.concept.java.vendingMachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 3/13/17
 * Time: 9:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomVendingMachine implements VendingMachine {

    private Inventory<Coin> cashInventory = new Inventory<Coin>();
    private Inventory<Item> itemInventory = new Inventory<Item>();
    private long totalSales;
    private Item currentItem;
    private long currentBalance;

    public CustomVendingMachine() {
        initialize();
    }

    private void initialize() {
        for (Coin c : Coin.values()) {
            cashInventory.put(c, 5);
        }
        for (Item i : Item.values()) {
            itemInventory.put(i, 5);
        }
    }

    @Override
    public long selectItemAndGetPrice(Item item) {
        if (itemInventory.hasItem(item)) {
            currentItem = item;
            return currentItem.getPrice();
        }
        throw new SoldOutException("Sold Out, Please buy another item");
    }

    @Override
    public void insertCoin(Coin coin) {
        currentBalance = currentBalance + coin.getDenomination();
        cashInventory.add(coin);
    }

    @Override
    public Bucket<Item, List<Coin>> collectItemAndChange() {
        Item item = collectItem();
        totalSales = totalSales + currentItem.getPrice();
        List<Coin> change = collectChange();
        return new Bucket<Item, List<Coin>>(item, change);
    }

    private Item collectItem() throws NotSufficientChangeException, NotFullPaidException {
        if (isFullPaid()) {
            if (hasSufficientChange()) {
                itemInventory.deduct(currentItem);
                return currentItem;
            }
            throw new NotSufficientChangeException("Not Sufficient change in Inventory");
        }
        long remainingBalance = currentItem.getPrice() - currentBalance;
        throw new NotFullPaidException("Price not full paid, remaining : ", remainingBalance);
    }

    private List<Coin> collectChange() {
        long changeAmount = currentBalance - currentItem.getPrice();
        List<Coin> change = getChange(changeAmount);
        updateCashInventory(change);
        currentBalance = 0;
        currentItem = null;
        return change;
    }

    @Override
    public List<Coin> refund() {
        List<Coin> refund = getChange(currentBalance);
        updateCashInventory(refund);
        currentBalance = 0;
        currentItem = null;
        return refund;
    }

    private boolean isFullPaid() {
        if (currentBalance >= currentItem.getPrice()) {
            return true;
        }
        return false;
    }

    private List<Coin> getChange(long amount) throws NotSufficientChangeException{
        List<Coin> changes = Collections.EMPTY_LIST;

        if(amount > 0){
            changes = new ArrayList<Coin>();
            long balance = amount;
            while(balance > 0){
                if(balance >= Coin.RUPEE_100.getDenomination()
                        && cashInventory.hasItem(Coin.RUPEE_100)){
                    changes.add(Coin.RUPEE_100);
                    balance = balance - Coin.RUPEE_100.getDenomination();
                    continue;

                }else if(balance >= Coin.RUPEE_50.getDenomination()
                        && cashInventory.hasItem(Coin.RUPEE_50)) {
                    changes.add(Coin.RUPEE_50);
                    balance = balance - Coin.RUPEE_50.getDenomination();
                    continue;

                }else if(balance >= Coin.RUPEE_20.getDenomination()
                        && cashInventory.hasItem(Coin.RUPEE_20)) {
                    changes.add(Coin.RUPEE_20);
                    balance = balance - Coin.RUPEE_20.getDenomination();
                    continue;

                }else if(balance >= Coin.RUPEE_10.getDenomination()
                        && cashInventory.hasItem(Coin.RUPEE_10)) {
                    changes.add(Coin.RUPEE_10);
                    balance = balance - Coin.RUPEE_10.getDenomination();
                    continue;

                }else{
                    throw new NotSufficientChangeException("NotSufficientChange, Please try another product");
                }
            }
        }

        return changes;
    }

    @Override
    public void reset(){
        cashInventory.clear();
        itemInventory.clear();
        totalSales = 0;
        currentItem = null;
        currentBalance = 0;
    }

    public void printStats(){
        System.out.println("Total Sales : " + totalSales);
        System.out.println("Current Item Inventory : " + itemInventory);
        System.out.println("Current Cash Inventory : " + cashInventory);
    }


    private boolean hasSufficientChange(){
        return hasSufficientChangeForAmount(currentBalance - currentItem.getPrice());
    }

    private boolean hasSufficientChangeForAmount(long amount){
        boolean hasChange = true;
        try{
            getChange(amount);
        }catch(NotSufficientChangeException nsce){
            return hasChange = false;
        }

        return hasChange;
    }

    private void updateCashInventory(List<Coin> change) {
        for(Coin c : change){
            cashInventory.deduct(c);
        }
    }

    public long getTotalSales(){
        return totalSales;
    }

}
