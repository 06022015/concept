package com.concept.java.design.carparking.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParkingRate {

    private Long id;
    private String hour;
    private Double charges;
    private VehicleType vehicleType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Double getCharges() {
        return charges;
    }

    public void setCharges(Double charges) {
        this.charges = charges;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
