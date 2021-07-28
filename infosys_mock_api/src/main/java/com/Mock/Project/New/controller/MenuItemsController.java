package com.Mock.Project.New.controller;


import com.Mock.Project.New.entity.MenuItem;
import com.Mock.Project.New.entity.OrderedItem;
import com.Mock.Project.New.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class MenuItemsController {

    @Autowired
    private OrderService service;


    /**
     * <p>add a new order to order item list</p>
     * @param orderedItems
     * @return
     */
    @CrossOrigin
    @PostMapping("/addordereditem")
    public OrderedItem addOrderedItems(@RequestBody OrderedItem orderedItems) {
        return service.saveOrderedItems(orderedItems);
    }

    /**
     * <p>get a new order to order item by id</p>
     * @param id
     * @return
     */
    @GetMapping("/getordereditem/{id}")
    public OrderedItem findOrderedItemById(@PathVariable int id){

        return service.getOrderedItemById(id);
    }

    /**
     * <p>get a all orders to order item list</p>
     * @return
     */

    @CrossOrigin
    @GetMapping("/getallordereditems")
    public List<OrderedItem> findAllOrderedItems() {
        log.info("getallordereditems -> is called ");
        return service.getOrderedItem();
    }

    /**
     * <p>get a new menu item to menu item by id</p>
     * @param id
     * @return
     */

    @GetMapping("/getmenuitem/{id}")
    public MenuItem findMenuById(@PathVariable int id){
        log.info("getmenuitem/{} -> is called ",id);
        return service.getMenuItemsById(id);
    }

    /**
     * <p>get all new menu item to menu item list</p>
     * @return
     */

    @CrossOrigin
    @GetMapping("/getmenuitems")
    public List<MenuItem> findAllMenuItems() {
        log.info("getmenuitems -> is called ");
        return service.getMenuItems();
    }


}
