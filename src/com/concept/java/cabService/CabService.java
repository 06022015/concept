package com.concept.java.cabService;

import com.concept.java.cabService.model.Booking;
import com.concept.java.cabService.model.Car;
import com.concept.java.cabService.model.Payment;

import java.awt.dnd.DropTargetEvent;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 12:12 AM
 * To change this template use File | Settings | File Templates.
 */
public interface CabService {
    
    
    List<Car> searchCar();
    
    Car get(Long carId);
    
    Boolean checkAvailability(Long carId, Date pickUpDate, Date dropOffDate);
    
    Booking doBooking(Long userId, Long carId, Date pickUpDate, Date dropOffDate, String pickAddress, String dropOffAddress);
    
    Booking cancelBooking(Long bookingId);
    
    Payment payment(Long bookingId, Double amount, Payment.PaymentThrough paymentThrough);
}
