package com.example.args;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArgsApplication {

	public static void main(String[] args) {
		System.out.println("com.sun.jndi.ldap.object.disableEndpointIdentification ==  " + System.getProperty("com.sun.jndi.ldap.object.disableEndpointIdentification"));

		SpringApplication.run(ArgsApplication.class, args);
	}
}
