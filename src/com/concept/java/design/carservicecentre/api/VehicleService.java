package com.concept.java.design.carservicecentre.api;

import com.concept.java.design.carservicecentre.model.JobPartsDetail;
import com.concept.java.design.carservicecentre.model.JobStatus;
import com.concept.java.design.carservicecentre.model.ServiceJob;
import com.concept.java.design.carservicecentre.model.Staff;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 2:04 PM
 * To change this template use File | Settings | File Templates.
 */
public interface VehicleService {
    
    ServiceJob getJobByJobId(String jobId);

    ServiceJob getJobById(Long  id);

    ServiceJob getJobByRegNumber(String vehRegNum);
    
    void assignMechanic(Long serviceJobId, Long staffId);
    
    void updateStatus(Long jobId, JobStatus jobStatus);

    void createJob(ServiceJob serviceJob);

    void addSpareParts(Long jobId, Long partId);

    void addService(Long jobId, Long serviceId);
    
}
