package com.Mock.Project.New.service;


import com.Mock.Project.New.entity.MenuItem;
import com.Mock.Project.New.entity.OrderedItem;
import com.Mock.Project.New.repository.MenuItemRepository;
import com.Mock.Project.New.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {


    @Autowired
    private MenuItemRepository repository;

    @Autowired
    private OrderRepository itemRepository;

    //post
    public MenuItem saveMenuItems(MenuItem menuItem) {

        return repository.save(menuItem);
    }

    public List<MenuItem> saveMenusItems(List<MenuItem> menusItems) {

        return repository.saveAll(menusItems);
    }

    //post ordered
    public OrderedItem saveOrderedItems(OrderedItem orderedItems) {

        return itemRepository.save(orderedItems);
    }


    //get
    public MenuItem getMenuItemsById(int id) {

        return (MenuItem) repository.findById(id).orElse(null);
    }

    public List<MenuItem> getMenuItems() {

        return repository.findAll();
    }

    //get orderedItems

    public OrderedItem getOrderedItemById(int id) {

        return (OrderedItem) itemRepository.findById(id).orElse(null);
    }

    public List<OrderedItem> getOrderedItem() {

        return itemRepository.findAll();
    }



    //delete
    public String deleteMenuItems(int id) {
        repository.deleteById(id);
        return "MenuItems removed !! " + id;
    }

    //put
    public MenuItem updateMenuItems(MenuItem menuItem) {
        MenuItem existingMenuItem = (MenuItem) repository.findById(menuItem.getId()).orElse(null);
        existingMenuItem.setName(menuItem.getName());
        existingMenuItem.setIngredients(menuItem.getIngredients());
        existingMenuItem.setPrice(menuItem.getPrice());
        return (MenuItem) repository.save(existingMenuItem);
    }



}
