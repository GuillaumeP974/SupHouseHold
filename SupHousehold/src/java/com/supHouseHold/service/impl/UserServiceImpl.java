/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supHouseHold.service.impl;

import com.supHouseHold.dao.UserDao;
import com.supHouseHold.entity.User;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import com.supHouseHold.service.UserService;

@Stateless
public class UserServiceImpl implements UserService {

    @EJB
    private UserDao userDao;

    @Override
    public User addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public User findUser(String username, String password) {
        return userDao.findUser(username, password);
    }

    @Override
    public User editUser(User editUser) {
        return userDao.editUser(editUser);
    }

}