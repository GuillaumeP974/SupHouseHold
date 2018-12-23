/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supHouseHold.service;

import com.supHouseHold.entity.User;
import javax.ejb.Remote;

/**
 *
 * @author Romain
 */
@Remote
public interface UserService {
    
    public User addUser(User user);
    
    public User findUser(String username, String password);
    
}
