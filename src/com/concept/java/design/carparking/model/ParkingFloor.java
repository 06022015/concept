package com.concept.java.design.carparking.model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParkingFloor {

    private Long id;
    private String floorNumber;
    private ParkingBlock  block;
    private List<ParkingSlot> slots;
    private List<Gate> gates;
    private Integer numOfSlotsFor2;
    private Integer numOfSlotsFor4;
    private Integer availSlotsFor2;
    private Integer availSlotsFor4;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public ParkingBlock getBlock() {
        return block;
    }

    public void setBlock(ParkingBlock block) {
        this.block = block;
    }

    public List<ParkingSlot> getSlots() {
        return slots;
    }

    public void setSlots(List<ParkingSlot> slots) {
        this.slots = slots;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public Integer getNumOfSlotsFor2() {
        return numOfSlotsFor2;
    }

    public void setNumOfSlotsFor2(Integer numOfSlotsFor2) {
        this.numOfSlotsFor2 = numOfSlotsFor2;
    }

    public Integer getNumOfSlotsFor4() {
        return numOfSlotsFor4;
    }

    public void setNumOfSlotsFor4(Integer numOfSlotsFor4) {
        this.numOfSlotsFor4 = numOfSlotsFor4;
    }

    public Integer getAvailSlotsFor2() {
        return availSlotsFor2;
    }

    public void setAvailSlotsFor2(Integer availSlotsFor2) {
        this.availSlotsFor2 = availSlotsFor2;
    }

    public Integer getAvailSlotsFor4() {
        return availSlotsFor4;
    }

    public void setAvailSlotsFor4(Integer availSlotsFor4) {
        this.availSlotsFor4 = availSlotsFor4;
    }
}
