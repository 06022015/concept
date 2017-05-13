package com.concept.java.cabService.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/1/17
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Feedback {
    
    private Long id;
    private String name;
    private String email;
    private String comment;
    private float rating;
    private Car car;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
