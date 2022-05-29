package com.kayky.storejava.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.kayky.storejava.entities.Category;
import com.kayky.storejava.entities.Order;
import com.kayky.storejava.entities.User;
import com.kayky.storejava.entities.enums.OrderStatus;
import com.kayky.storejava.repositories.CategoryRepository;
import com.kayky.storejava.repositories.OrderRepository;
import com.kayky.storejava.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		Category ct1 = new Category(null, "Eletronics");
		Category ct2 = new Category(null, "Books");
		Category ct3 = new Category(null, "Machines");
		categoryRepository.saveAll(Arrays.asList(ct1, ct2, ct3));

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.DELIVERED, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, u1);
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}

}
