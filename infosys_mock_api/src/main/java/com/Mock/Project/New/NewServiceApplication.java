package com.Mock.Project.New;

import com.Mock.Project.New.entity.MenuItem;
import com.Mock.Project.New.repository.MenuItemRepository;
import com.Mock.Project.New.service.OrderService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootApplication
public class NewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewServiceApplication.class, args);
	}

	@Bean
	public ApplicationRunner initializer(OrderService service) {
		return args -> service.saveMenusItems(Arrays.asList(
			new MenuItem(1,"Taco", Arrays.asList("chicken","Tortilla","onion","pickle").stream().collect(Collectors.toSet()), 3.5,null),
				new MenuItem(2,"Cheese sandwich", Arrays.asList("cheese","bread","tomatoes","lettuce","mayo","sauce").stream().collect(Collectors.toSet()), 3.5,null),
				new MenuItem(3,"Chicken burger", Arrays.asList("chicken","Burger buns","lettuce","tomatoes","hot sauce").stream().collect(Collectors.toSet()), 3.5, null),
				new MenuItem(4,"Pasta", Arrays.asList("spinach","pasta","chicken","basil paste","parmesan").stream().collect(Collectors.toSet()), 3.5,null),
				new MenuItem(5,"Pizza", Arrays.asList("jalapenos","chicken","cheese","marinara").stream().collect(Collectors.toSet()), 3.5,null)
		));
	}
}
