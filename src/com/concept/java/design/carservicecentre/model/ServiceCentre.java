package com.concept.java.design.carservicecentre.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 1:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ServiceCentre {
    
    private Long id;
    private String name;
    private String address;
    private ServiceCentre parent;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ServiceCentre getParent() {
        return parent;
    }

    public void setParent(ServiceCentre parent) {
        this.parent = parent;
    }
}
