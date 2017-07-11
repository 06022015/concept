package com.concept.java.design.bookmyshow.model;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/10/17
 * Time: 12:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class EventLocationShow{

    private Long id;
    private Location location;
    private Event event;
    private Organizer organizer;
    private Set<EventShowTime> eventShowTimes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Set<EventShowTime> getEventShowTimes() {
        return eventShowTimes;
    }

    public void setEventShowTimes(Set<EventShowTime> eventShowTimes) {
        this.eventShowTimes = eventShowTimes;
    }
}
