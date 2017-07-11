package com.concept.java.design.carparking.model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParkingLot {
    
    private Long id;
    private String name;
    private List<ParkingBlock> blocks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingBlock> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<ParkingBlock> blocks) {
        this.blocks = blocks;
    }
}
