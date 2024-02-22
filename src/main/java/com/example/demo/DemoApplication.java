package com.example.demo;

import com.example.demo.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("ahuauhu");

		Product prod = new Product("Prato","2000","Prato de louça","19");

		System.out.println(prod.toString());

	}

}
