package com.concept.java.design.bookmyshow.api;


import com.concept.java.design.bookmyshow.model.User;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 8:44 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {

    User login(String username, String password);
    
    void save(User user);

    void changePassword(String username, String oldPassword, String newPassword);



}
