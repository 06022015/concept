package com.concept.java.design.carparking.api;

import com.concept.java.design.carparking.model.*;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/12/17
 * Time: 12:06 AM
 * To change this template use File | Settings | File Templates.
 */
public interface ParkingLotService {

    void save(ParkingLot parkingLot);

    void save(ParkingBlock parkingBlock);

    void save(ParkingFloor floor);

    void save(ParkingSlot slot);

    void save(Gate gate, ParkingFloor floor);

    void save(ParkingRate parkingRate);

    void save(ParkingGateSlotMatrix matrix);

}
