package com.concept.java.design.bookmyshow.model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 7:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class User{

    private Long id;
    private String name;
    private String email;
    private String mobile;
    private List<String> role;
    private Gender gender;
    private String dob;
    private boolean married;
    private boolean altersOnMobile;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public boolean isAltersOnMobile() {
        return altersOnMobile;
    }

    public void setAltersOnMobile(boolean altersOnMobile) {
        this.altersOnMobile = altersOnMobile;
    }
}
