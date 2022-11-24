package org.sid.coustomer_service;

import org.sid.coustomer_service.enteties.Customer;
import org.sid.coustomer_service.repositoriy.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args ->{
			customerRepository.save(new Customer(null,"taha","taha.semmaa@gmail.com"));
			customerRepository.save(new Customer(null,"Imane","Imane.Rouia@gmail.com"));
			customerRepository.save(new Customer(null,"Zouhair","Zouhair.mitre@gmail.com"));
			customerRepository.findAll().forEach(c->{
				System.out.println(c.toString());
			});

		};
	}

}
