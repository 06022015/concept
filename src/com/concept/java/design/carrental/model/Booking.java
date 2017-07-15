package com.concept.java.design.carrental.model;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 8:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Booking {

    private Long id;
    private User customer;
    private Vehicle vehicle;
    private BookingStatus status;
    private Date bookingTime;
    private Date pickUpDate;
    private Date dropDateDate;
    private String pickupTime;
    private String dropTime;
    private PickUpPoint pickUpPoint;
    private PickUpPoint dropPoint;
    private Double depositAmount;
    private DiscountOffer discountOffer;
    private VehicleType vehicleType;


}
