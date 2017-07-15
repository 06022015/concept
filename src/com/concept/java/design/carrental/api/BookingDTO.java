package com.concept.java.design.carrental.api;

import com.concept.java.design.carrental.model.DiscountOffer;
import com.concept.java.design.carrental.model.VehicleType;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookingDTO {
    
    private Long userId;
    private Date pickUpDate;
    private Date dropUpDate;
    private String pickTime;
    private String dropTime;
    private VehicleType vehicleType;
    private Double depositAmount;
    private DiscountOffer discountOffer;

}
