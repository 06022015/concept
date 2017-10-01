package com.concept.java.design.robot;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 11:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Customer {
    
    private String name;
    private Double balance = 0.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public boolean charge(Double amount){
        boolean success = false;
        if(amount<= this.balance){
            this.balance = this.balance-amount;
            success = true;
        }
        return success;
    }

    public void refund(Double amount){
        this.balance = this.balance+amount;
    }
}
