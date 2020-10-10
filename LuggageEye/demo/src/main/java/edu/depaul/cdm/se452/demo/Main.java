package edu.depaul.cdm.se452.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages={"edu.depaul.cdm.se452.demo"})

@SpringBootApplication
public class Main {
    

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);

    }
}
