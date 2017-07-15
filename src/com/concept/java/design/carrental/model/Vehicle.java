package com.concept.java.design.carrental.model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 8:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Vehicle {
    
    private Long id;
    private String name;
    private String model;
    private String regNumber;
    private String metreReading;
    private FuelType fuelType;
    private int  seatingCapacity;
    private String color;
    private VehicleType vehicleType;
    private List<VehicleFeature> vehicleFeatures;
    private City city;
    private PickUpPoint pickUpPoint;
    private User owner;
    private String insuranceNumber;
    
}
