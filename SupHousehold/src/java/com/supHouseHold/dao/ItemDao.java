/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supHouseHold.dao;
import com.supHouseHold.entity.Item;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thibault
 */
@Stateless
public class ItemDao {
    
    @PersistenceContext
    private EntityManager em;
    
    public Item addItem(Item item){
    em.persist(item);
    return item;
    }
    
}
