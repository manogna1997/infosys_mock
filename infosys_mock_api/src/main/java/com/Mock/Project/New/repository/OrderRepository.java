package com.Mock.Project.New.repository;

import com.Mock.Project.New.entity.OrderedItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderedItem,Integer> {

}
