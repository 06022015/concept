package com.concept.java.design.carparking.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 11:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParkingGateSlotMatrix {
    
    private Long id;
    private Gate gate;
    private ParkingSlot slots;
    private String cost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public ParkingSlot getSlots() {
        return slots;
    }

    public void setSlots(ParkingSlot slots) {
        this.slots = slots;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
