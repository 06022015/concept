package com.concept.java.design.bookmyshow.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 6:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class EventPrice {

    private Long id;
    private String category;
    private Double price;
    private EventShowTime eventShowTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public EventShowTime getEventShowTime() {
        return eventShowTime;
    }

    public void setEventShowTime(EventShowTime eventShowTime) {
        this.eventShowTime = eventShowTime;
    }
}
