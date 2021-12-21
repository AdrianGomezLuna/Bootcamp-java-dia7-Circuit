package com.nttdata.circuitBreaker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.circuitBreaker.model.Circuit;

@SpringBootApplication
public class CircuitBreakerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
		Circuit circuito = new Circuit(5D, 8D, 10D);		
		System.out.println(circuito.getEstado());
		
		Circuit circuito2 = new Circuit(15D, 1D, 10D);		
		System.out.println(circuito2.getEstado());
		
		Circuit circuito3 = new Circuit(1D, 15D, 10D);		
		System.out.println(circuito3.getEstado());
		
	}

}
