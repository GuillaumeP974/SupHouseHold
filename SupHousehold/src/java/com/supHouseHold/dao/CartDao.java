/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supHouseHold.dao;

import com.supHouseHold.entity.Item;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thibault
 */
@Stateless
public class CartDao {
    
    @PersistenceContext
    private EntityManager em;
    
    //list of items in cart to code
    public List<Item> itemInCart (Item item){
        return null;
    }
    
}
