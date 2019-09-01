package br.com.devdojo.awesome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration
//@ComponentScan
//@Configuration
// A anotação @SpringBootApplication representa as tres de cima...

@SpringBootApplication // @EnableAutoConfiguration @ComponentScan @Configuration
public class ApplicationStart {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationStart.class, args);
	}
}
