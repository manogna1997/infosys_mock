package com.Mock.Project.New.entity;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDER_TBL")
public class OrderedItem {

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    @NonNull
    private double totalprice;
    @OneToMany
    List<MenuItem> menuItems = new ArrayList<>();

    public OrderedItem(String name){
        this.name = name;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }




}
