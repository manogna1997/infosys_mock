package com.Mock.Project.New.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MENU_ITEM_TBL")
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String name;
    @Convert(converter = StringSetConverter.class)
    @NonNull
    private Set<String> ingredients;
    @NotNull
    private double price;


    @JsonIgnore
    @ManyToMany(mappedBy = "menuItems",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<OrderedItem> orders ;
}
