package com.singlepoint.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockApplication implements CommandLineRunner {

	@Autowired
	private ProfitCalculator profitCalculator;

	public static void main(String[] args) {
		SpringApplication.run(StockApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int[] stocks = new int[]{20,40,52,15,30,50,10,20};
		System.out.println(profitCalculator.calculate(stocks));
	}
}
