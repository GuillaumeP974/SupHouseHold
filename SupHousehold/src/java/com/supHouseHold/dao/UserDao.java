/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supHouseHold.dao;

import com.supHouseHold.entity.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cgi
 */
@Stateless
public class UserDao {
    
    
    @PersistenceContext
    private EntityManager em;
    
    public User addUser(User user){
        em.persist(user);
        return user;
    }
}
