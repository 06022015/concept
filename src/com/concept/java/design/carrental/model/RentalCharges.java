package com.concept.java.design.carrental.model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 8:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class RentalCharges {

    private Long id;
    private String name;
    private City city;
    private Double minimumCharges;
    private ChargesUnit minimumChargeUnit;
    private Integer quantity;
    private VehicleType vehicleType;
    private List<ChargesDetail> chargesDetails;

}
