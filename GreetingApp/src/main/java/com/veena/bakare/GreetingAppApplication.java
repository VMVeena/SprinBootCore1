package com.veena.bakare;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.veena.bakare.service.GreetInterface;

@SpringBootApplication
public class GreetingAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(GreetingAppApplication.class, args);
		GreetInterface greetObj=container.getBean(GreetInterface.class);
		System.out.println(greetObj);
		System.out.println(greetObj.generateGreeting("veena bakare"));
		
	}

}
