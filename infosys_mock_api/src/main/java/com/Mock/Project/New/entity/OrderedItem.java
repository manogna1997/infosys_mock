package com.Mock.Project.New.entity;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
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
    @ManyToMany
//            (
//            cascade = {
//            CascadeType.MERGE
//    })
//    @JoinTable(
//            name = "ORDER_TBL_MENU_ITEM_TBL",
//            joinColumns = { @JoinColumn(name = "or_id") },
//            inverseJoinColumns = { @JoinColumn(name = "menu_id") }
//    )
    private Collection<MenuItem> menuItems = new ArrayList<>();



}
