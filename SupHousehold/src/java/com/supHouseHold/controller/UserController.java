/* 
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
 */ 
package com.supHouseHold.controller; 
 
import com.supHouseHold.entity.User; 
import com.supHouseHold.service.UserService; 
import java.io.Serializable; 
import javax.ejb.EJB; 
import javax.faces.bean.ManagedBean; 
import javax.faces.bean.SessionScoped;
 
/** 
 * 
 * @author Romain 
 */ 
@ManagedBean 
@SessionScoped 
public class UserController implements Serializable { 
     
    @EJB 
    private UserService userService; 
     
    public User user = new User(); 
     
    private String username; 
    private String password; 
 
    public String getUsername() { 
        return username; 
    } 
 
    public void setUsername(String username) { 
        this.username = username; 
    } 
 
    public String getPassword() { 
        return password; 
    } 
 
    public void setPassword(String password) { 
        this.password = password; 
    } 
 
    public User getUser() { 
        return user; 
    } 
 
    public void setUser(User user) { 
        this.user = user; 
    } 
     
    public String addUser() { 
        userService.addUser(user); 
        return "ok";  
    }     
     
        public String login(){ 
         
        String retour = "login"; 
         
        User user = null; 
        
             
         
        user = userService.findUser(username, password); 
        
         
       
         
        return "logs"; 
    } 
     
} 
