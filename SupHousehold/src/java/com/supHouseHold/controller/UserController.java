/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supHouseHold.controller;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import com.supHouseHold.entity.User;
import java.io.IOException;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import com.supHouseHold.service.UserService;

/**
 * User managed Bean
 *
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

    /**
     * Function qui ajoute un utilisateur à lq base de données puis redirige vers l'espace personel de l'utilisateur.
     * @return String
     * @throws IOException
     */
    public String addUser() throws IOException {
        userService.addUser(user);
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getSessionMap().put("user", user);
        context.getExternalContext().redirect("connect/home.xhtml");
        return "add";
    }

    /**
     * Function qui permet à un utilisateur de se connecter puis redirige vers son espace personel.
     * @throws IOException
     */
    public void login() throws IOException{

        user = userService.findUser(username, password);
        FacesContext context = FacesContext.getCurrentInstance();

        if(user == null)
        {
            context.addMessage(null, new FacesMessage("Bad password or login."));
        }
        else{
            context.getExternalContext().getSessionMap().put("user", user);
            context.getExternalContext().redirect("connect/home.xhtml");
        }
    }

    /**
     * Function qui permet de se déconnecter.
     * @throws IOException
     */
    public void logout() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().invalidateSession();
        context.getExternalContext().redirect("index.xhtml");
    }

    /**
     * Function qui permet de modifier le profil utilisateur.
     */
    public void editUser() {
        userService.editUser(user);
    }

} 
