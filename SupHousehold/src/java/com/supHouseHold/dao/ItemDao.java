/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supHouseHold.dao;
import com.supHouseHold.entity.Item;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

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
    
    //Criteria for bought items per user to code
     public List<Item> findUserItems(Item item){
        return null;
    }
    
 
    
}
