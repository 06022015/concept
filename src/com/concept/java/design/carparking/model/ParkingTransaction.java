package com.concept.java.design.carparking.model;

import java.security.Timestamp;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 11:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParkingTransaction {
    
    private Long id;
    private String refId;
    private String vehicleNumber;
    private Date date;
    private Timestamp timeIn;
    private Timestamp timeOut;
    private String slipNumber;
    private VehicleType vehicleType;
    private Double charges;
    private ParkingSlot slot;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Timestamp getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Timestamp timeIn) {
        this.timeIn = timeIn;
    }

    public Timestamp getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Timestamp timeOut) {
        this.timeOut = timeOut;
    }

    public String getSlipNumber() {
        return slipNumber;
    }

    public void setSlipNumber(String slipNumber) {
        this.slipNumber = slipNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Double getCharges() {
        return charges;
    }

    public void setCharges(Double charges) {
        this.charges = charges;
    }

    public ParkingSlot getSlot() {
        return slot;
    }

    public void setSlot(ParkingSlot slot) {
        this.slot = slot;
    }
}
