/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supHouseHold.projet;

import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Guillaume
 */
@Stateless
@ManagedBean(name="UserBean")
@RequestScoped
public class UserBean {
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String postalCode ;
 
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstname) {
        this.firstName = firstname;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastname ) {
        this.lastName = lastname;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName( String username ) {
        this.userName = username;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPosatalCode( String password ) {
        this.password = password;
    }
    
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode( String postalcode ) {
        this.postalCode = postalcode;       
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
