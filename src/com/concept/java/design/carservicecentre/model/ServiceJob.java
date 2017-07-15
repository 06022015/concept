package com.concept.java.design.carservicecentre.model;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 1:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class ServiceJob {
    
    private Long id;
    private ServiceCentre serviceCentre;
    private String jobid;
    private List<JobServiceDetails> serviceDetails;
    private List<JobPartsDetail> sparePartsDetails;
    private Staff supervisor;
    private Staff mechanic;
    private ServiceType serviceType;
    private String complaints;
    private List<String> issues;
    private JobStatus status;
    private Date submitTime;
    private Date deliverTime;
    private Customer customer;
    private Vehicle vehicle;
    private String mechanicComments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ServiceCentre getServiceCentre() {
        return serviceCentre;
    }

    public void setServiceCentre(ServiceCentre serviceCentre) {
        this.serviceCentre = serviceCentre;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public List<JobServiceDetails> getServiceDetails() {
        return serviceDetails;
    }

    public void setServiceDetails(List<JobServiceDetails> serviceDetails) {
        this.serviceDetails = serviceDetails;
    }

    public List<JobPartsDetail> getSparePartsDetails() {
        return sparePartsDetails;
    }

    public void setSparePartsDetails(List<JobPartsDetail> sparePartsDetails) {
        this.sparePartsDetails = sparePartsDetails;
    }

    public Staff getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Staff supervisor) {
        this.supervisor = supervisor;
    }

    public Staff getMechanic() {
        return mechanic;
    }

    public void setMechanic(Staff mechanic) {
        this.mechanic = mechanic;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }

    public List<String> getIssues() {
        return issues;
    }

    public void setIssues(List<String> issues) {
        this.issues = issues;
    }

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getMechanicComments() {
        return mechanicComments;
    }

    public void setMechanicComments(String mechanicComments) {
        this.mechanicComments = mechanicComments;
    }
}
