package com.concept.java.design.bookmyshow.api;

import com.concept.java.design.bookmyshow.model.City;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 8:44 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CityService {

    City getCity(String name);

    List<City> getCities();

    void save(City city);
}
