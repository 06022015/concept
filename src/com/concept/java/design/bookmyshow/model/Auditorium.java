package com.concept.java.design.bookmyshow.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/10/17
 * Time: 10:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class Auditorium{
    
    private Long id;
    private int number;
    private int capacity;
    private Location location;
    private ShowTime showTime;
    private AuditoriumPartition auditoriumPartition;
    /* TODO: Other property like seating arrangement and screen direction*/


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ShowTime getShowTime() {
        return showTime;
    }

    public void setShowTime(ShowTime showTime) {
        this.showTime = showTime;
    }

    public AuditoriumPartition getAuditoriumPartition() {
        return auditoriumPartition;
    }

    public void setAuditoriumPartition(AuditoriumPartition auditoriumPartition) {
        this.auditoriumPartition = auditoriumPartition;
    }
}
