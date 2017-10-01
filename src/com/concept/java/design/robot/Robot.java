package com.concept.java.design.robot;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 11:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Robot {

    private static Long ROBOT_ID = 123456L;
    
    private Long id;
    private List<Order> orders;

    public Robot(){
        this.id = ROBOT_ID;
    }

    public Long getId() {
        return id;
    }

    public List<Order> getOrders() {
        return orders;
    }


    public boolean takeOrder(Order order){
        boolean success = order.getCustomer().charge(order.getTotal());
        if(success){
            orders.add(order);
        }
        return success;
    }

    private void prepare(){
        for(Order order: orders){
            for(Item item : order.getItems())
                item.prepare();
        }
    }
    
    public void cancelOrder(Order order){
        int index = this.orders.indexOf(order);
        orders.remove(index);
        order.getCustomer().refund(order.getTotal());
    }
}
