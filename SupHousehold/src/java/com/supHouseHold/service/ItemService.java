/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supHouseHold.service;

import com.supHouseHold.entity.Item;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Thibault
 */
@Remote
public interface ItemService {
    
    public Item addItem(Item item);
    public List<Item> listAll();
    public List<Item> findUserItems(Item item);
    
}
