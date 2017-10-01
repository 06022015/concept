package com.concept.java.design.robot;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 11:26 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Item {
    
    private Long id;
    private String name;
    private Double price;
    private int quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    protected abstract void prepare();

    public Double getTotal(){
        return this.price*this.quantity;
    }
}
