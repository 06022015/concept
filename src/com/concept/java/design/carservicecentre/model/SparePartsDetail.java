package com.concept.java.design.carservicecentre.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 1:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class SparePartsDetail {
    
    private Long id;
    private Long code;
    private String name;
    private Double rate;
    private ServiceCentre serviceCentre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public ServiceCentre getServiceCentre() {
        return serviceCentre;
    }

    public void setServiceCentre(ServiceCentre serviceCentre) {
        this.serviceCentre = serviceCentre;
    }
}
