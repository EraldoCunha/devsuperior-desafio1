package com.devsuperior.desafio1;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio1.entities.Order;
import com.devsuperior.desafio1.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner{

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Order order1 = new Order(1034, 150.00, 20.0);
		Order order2 = new Order(2282, 800.00, 10.0);
		Order order3 = new Order(1309, 95.90, 0.0);
		
		System.out.printf("\nPedido código %d%nValor total: R$ %.2f%n", order1.getCode(), orderService.total(order1));
		System.out.printf("\nPedido código %d%nValor total: R$ %.2f%n", order2.getCode(), orderService.total(order2));
		System.out.printf("\nPedido código %d%nValor total: R$ %.2f%n", order3.getCode(), orderService.total(order3));
		
		sc.close();
	}

}
