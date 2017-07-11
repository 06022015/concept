package com.concept.java.design.bookmyshow.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/9/17
 * Time: 11:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class ShowTime{

    private Long id;
    private String startTime;
    private String endTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
