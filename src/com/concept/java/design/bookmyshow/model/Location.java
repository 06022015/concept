package com.concept.java.design.bookmyshow.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/9/17
 * Time: 11:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Location{

    private Long id;
    private String name;
    private String description;
    private City city;
    private int capacity;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
