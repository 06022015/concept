package com.concept.java.design.carrental.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 8:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class City {
    
    private Long id;
    private String name;
    private String state;
    private String country;

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
