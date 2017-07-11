package com.concept.java.design.bookmyshow.model;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/9/17
 * Time: 11:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Event{

    private Long id;
    private String name;
    private String description;
    private Date start;
    private Date end;
    private String duration;
    private List<String> genre;
    private List<String> languages;
    private String banner;
    private List<EventCast> eventCasts;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public List<EventCast> getEventCasts() {
        return eventCasts;
    }

    public void setEventCasts(List<EventCast> eventCasts) {
        this.eventCasts = eventCasts;
    }
}
