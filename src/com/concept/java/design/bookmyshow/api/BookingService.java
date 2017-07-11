package com.concept.java.design.bookmyshow.api;

import com.concept.java.design.bookmyshow.model.Booking;
import com.concept.java.design.bookmyshow.model.ChargesType;
import com.concept.java.design.bookmyshow.model.User;

import java.security.Timestamp;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 8:45 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BookingService {

    boolean lockSeat(Long eventId, Long locationId, Long showTimeId, List<String> seats, Timestamp timestamp);

    boolean unlockSeat(Long eventId, Long locationId, Long showTimeId, List<String> seats, Timestamp timestamp);

    void bookTicket(Long eventId, Long locationId, Long showTimeId, List<String> seats, ChargesType chargesType, User user);
    
    List<Booking>  getHistory(User user);
    
    Booking getBooking(Long bookingId);
    
}
