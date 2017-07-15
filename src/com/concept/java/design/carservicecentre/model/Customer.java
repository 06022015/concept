package com.concept.java.design.carservicecentre.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 2:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Customer {
    
    private String name;
    private String mobile;
    private String altrMobile;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAltrMobile() {
        return altrMobile;
    }

    public void setAltrMobile(String altrMobile) {
        this.altrMobile = altrMobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
