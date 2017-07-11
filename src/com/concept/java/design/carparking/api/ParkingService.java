package com.concept.java.design.carparking.api;

import com.concept.java.design.carparking.model.*;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 11:53 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ParkingService {

    Integer getTotalAvailableSlots(Long floorId, Long blockId);

    void updateParkingFloorStatus(Long floorId, Long blockId, VehicleType vehicleType, Operation operation);
    
    void updateSlotStatus(Long slotId, Long floorId, Long blockId, SlotStatus status);
    
    ParkingSlot getNearestSlot(Gate gate, Long floorId, Long blockId);
    
    ParkingTransaction onVehicleEntry(String vehicleNumber, String vehicleType, String refId);

    ParkingTransaction onVehicleExit(String slipId);

    ParkingTransaction getTransactionByVehicleNumber(String vehicleNumber);

    ParkingTransaction getTransactionByRefId(String refId);
}
