package com.concept.java.design.carrental.api;

import com.concept.java.design.carrental.model.Vehicle;
import com.concept.java.design.carrental.model.VehicleType;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 9:54 PM
 * To change this template use File | Settings | File Templates.
 */
public interface VehicleService {
    
    List<Vehicle> getAllVehicle();
    
    List<Vehicle> getVehicle(Map<String,String> filterParam);

    Vehicle getVehicleById(Long id);

    boolean checkVehicleStatus(Long id, Date pickupDate,Date dropDate, String pickupTime, String dropTime);
    
    List<Vehicle> getAvailableVehicle(VehicleType vehicleType, Date pickupDate,Date dropDate, String pickupTime, String dropTime);
    
    void pickVehicle(Long bookingId, Long vehicleId, Long pickPointId);

    void dropVehicle(Long bookingId, Long vehicleId, Long dropPointId);
    
    
}
