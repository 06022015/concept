package com.concept.java.design.bookmyshow.model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/10/17
 * Time: 12:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class EventShowTime{

    private Long id;
    private EventLocationShow eventLocationShow;
    private ShowTime showTime;
    private List<EventPrice> prices;
    private Auditorium auditorium;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EventLocationShow getEventLocationShow() {
        return eventLocationShow;
    }

    public void setEventLocationShow(EventLocationShow eventLocationShow) {
        this.eventLocationShow = eventLocationShow;
    }

    public ShowTime getShowTime() {
        return showTime;
    }

    public void setShowTime(ShowTime showTime) {
        this.showTime = showTime;
    }

    public List<EventPrice> getPrices() {
        return prices;
    }

    public void setPrices(List<EventPrice> prices) {
        this.prices = prices;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }
}
