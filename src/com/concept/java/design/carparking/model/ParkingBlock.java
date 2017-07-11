package com.concept.java.design.carparking.model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParkingBlock {
    
    private Long id;
    private String name;
    private ParkingLot parkingLot;
    private List<ParkingFloor> floors;

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

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }
}
