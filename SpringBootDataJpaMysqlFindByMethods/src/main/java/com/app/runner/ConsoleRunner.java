package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//all finByMethods here and perform op
repo.findByProdCodeAndProdCostLessThan("AA",2.2)
.forEach(System.out::println);
repo.findByProdCodeIs("AA")
.forEach(System.out::println);
	}
	

}
