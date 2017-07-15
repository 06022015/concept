package com.concept.java.design.carservicecentre.api;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 2:02 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ServiceCentre {
    
    ServiceCentre getServiceCentre(Long id);

    List<ServiceCentre> getAllServiceCentre();

    void save(ServiceCentre serviceCentre);

}
