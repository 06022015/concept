package com.concept.java.cabService.model;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/1/17
 * Time: 11:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Payment {
    
    public enum PaymentThrough{
        DC, CC, Internet
    }
    
    private Long id;
    private String transactionId;
    private PaymentThrough paymentThrough;
    private Double amount;
    private Date paymentTime;
    private Booking booking;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public PaymentThrough getPaymentThrough() {
        return paymentThrough;
    }

    public void setPaymentThrough(PaymentThrough paymentThrough) {
        this.paymentThrough = paymentThrough;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
