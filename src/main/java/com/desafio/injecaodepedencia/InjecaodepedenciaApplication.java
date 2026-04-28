package com.desafio.injecaodepedencia;

import com.desafio.injecaodepedencia.entities.Order;
import com.desafio.injecaodepedencia.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public abstract class InjecaodepedenciaApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(InjecaodepedenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Order o1 = new Order(1034, 150.0, 20.0);
		System.out.println("Pedido código: " + o1.getCode());
		System.out.println("Valor total: R$ " + orderService.total(o1));
		Order o2 = new Order(2282, 800.0, 10.0);
		System.out.println("Pedido código: " + o2.getCode());
		System.out.println("Valor total: R$ " + orderService.total(o2));
		Order o3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código: " + o3.getCode());
		System.out.println("Valor total: R$ " + orderService.total(o3));
	}

}
