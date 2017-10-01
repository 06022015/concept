package com.concept.java.design.robot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 11:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Order {

    private Long id;
    private Customer customer;
    private List<Item> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        if(null == getItems())
            setItems(new ArrayList<Item>());
        getItems().add(item);
    }

    public void cancelItem(Item item){
        this.items.remove(item);
    }
    
    public Double getTotal(){
        Double total= 0.0;
        for(Item item : this.items){
            total = total+ item.getTotal();
        }
        return total;
    }
}
