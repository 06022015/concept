package com.concept.java.cabService.model;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/1/17
 * Time: 11:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class User {

    enum Role{
        ADMIN, DRIVER, CUSTOMER
    }
    
    private Long id;
    private String name;
    private String email;
    private String mobile;
    private String password;
    private Role role;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
