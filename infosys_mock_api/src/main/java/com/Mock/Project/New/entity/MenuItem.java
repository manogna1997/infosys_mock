package com.Mock.Project.New.entity;

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
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    @Convert(converter = StringSetConverter.class)
    @NonNull
    private Set<String> ingredients;
    @NotNull
    private double price;

    @ManyToMany()
    private List<OrderedItem> orders ;
}
