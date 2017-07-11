package com.concept.java.design.carparking.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParkingSlot {
    
    private Long id;
    private String slotId;
    private VehicleType vehicleType;
    private ParkingFloor floor;
    private ParkingBlock block;
    private SlotStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingFloor getFloor() {
        return floor;
    }

    public void setFloor(ParkingFloor floor) {
        this.floor = floor;
    }

    public ParkingBlock getBlock() {
        return block;
    }

    public void setBlock(ParkingBlock block) {
        this.block = block;
    }

    public SlotStatus getStatus() {
        return status;
    }

    public void setStatus(SlotStatus status) {
        this.status = status;
    }
}
