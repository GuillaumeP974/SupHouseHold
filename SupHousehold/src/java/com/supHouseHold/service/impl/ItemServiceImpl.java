/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supHouseHold.service.impl;

import com.supHouseHold.dao.ItemDao;
import com.supHouseHold.entity.Item;
import com.supHouseHold.service.ItemService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Thibault
 */
@Stateless
public class ItemServiceImpl implements ItemService {
    
    @EJB
    private ItemDao itemDao;

    @Override
    public Item addItem(Item item) {
        return itemDao.addItem(item);
    }

    @Override
    public List<Item> listAll() {
        return itemDao.listAll();
    }

    @Override
    public List<Item> findUserItems(Item item) {
        return itemDao.findUserItems(item);
    }
    
}
