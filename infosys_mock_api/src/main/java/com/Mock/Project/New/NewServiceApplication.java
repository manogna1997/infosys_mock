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
			new MenuItem(0,"Taco", Arrays.asList("chicken","totias").stream().collect(Collectors.toSet()), 3.5,null),
				new MenuItem(1,"Taco2", Arrays.asList("chicken","totias").stream().collect(Collectors.toSet()), 3.5,null),
				new MenuItem(2,"Taco3", Arrays.asList("chicken","totias").stream().collect(Collectors.toSet()), 3.5, null),
				new MenuItem(3,"Taco4", Arrays.asList("chicken","totias").stream().collect(Collectors.toSet()), 3.5,null),
				new MenuItem(5,"Taco5", Arrays.asList("chicken","totias").stream().collect(Collectors.toSet()), 3.5,null)
		));
	}
}
