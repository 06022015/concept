package com.concept.java.design.bookmyshow.model;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/10/17
 * Time: 10:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class Payment{

    private Long id;
    private User user;
    private Booking booking;
    private Double ticketCharges;
    private ChargesType charges;
    private Double amount;
    private String transactionId;
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Double getTicketCharges() {
        return ticketCharges;
    }

    public void setTicketCharges(Double ticketCharges) {
        this.ticketCharges = ticketCharges;
    }

    public ChargesType getCharges() {
        return charges;
    }

    public void setCharges(ChargesType charges) {
        this.charges = charges;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
