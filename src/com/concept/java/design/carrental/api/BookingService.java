package com.concept.java.design.carrental.api;

import com.concept.java.design.carrental.model.Billing;
import com.concept.java.design.carrental.model.Booking;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 9:53 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BookingService {
    
    Booking getBookingId(Long id);
    
    List<Booking>  getBookingByDate(Date date);
    
    void confirmBooking(BookingDTO bookingDTO);

    Billing generateBill(Long bookingId, Long dropPointId);

}
