package edu.depaul.cdm.se452.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import edu.depaul.cdm.se452.demo.passenger.Passenger;

@SpringBootApplication
 @EntityScan("edu.depaul.cdm.se452.demo.luggage")
// @ComponentScan(basePackages = "edu.depaul.cdm.se452.demo")
public class DemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}
	

	

}
