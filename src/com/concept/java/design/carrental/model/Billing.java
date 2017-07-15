package com.concept.java.design.carrental.model;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 8:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Billing {
    
    private Booking booking;
    private PickUpPoint dropPoint;
    private Date billingDate;
    private DiscountOffer discountOffer;
    private Double totalAmount;
    private String billStatus;
}
