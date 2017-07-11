package com.concept.java.design.carparking.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 11:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Gate {
    
    private Long id;
    private String gateNumber;
    private ParkingFloor floor;
    private GateType gateType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public ParkingFloor getFloor() {
        return floor;
    }

    public void setFloor(ParkingFloor floor) {
        this.floor = floor;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
