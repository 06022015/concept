package com.concept.java.design.carservicecentre.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 2:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Vehicle {
    
    private String regNumber;
    private String chesisNumber;
    private String model;
    private String companyName;

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getChesisNumber() {
        return chesisNumber;
    }

    public void setChesisNumber(String chesisNumber) {
        this.chesisNumber = chesisNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
