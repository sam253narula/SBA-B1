package com.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BseServiceApplication /* implements CommandLineRunner */ {

	/*
	 * @Autowired BSEService bseService;
	 */

	public static void main(String[] args) {
		SpringApplication.run(BseServiceApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * System.out.println(bseService.getStockPrice("Tata Chem"));
	 * 
	 * }
	 */

}
