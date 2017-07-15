package com.concept.java.design.carservicecentre.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 1:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerFeedback {
    
    private Long id;
    private String title;
    private String comment;
    private ServiceJob serviceJob;
    private  Integer rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ServiceJob getServiceJob() {
        return serviceJob;
    }

    public void setServiceJob(ServiceJob serviceJob) {
        this.serviceJob = serviceJob;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
