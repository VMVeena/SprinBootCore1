package com.veena.bakare.configuration;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {

	@Bean
	public LocalDateTime getTime()
	{
		return LocalDateTime.now();
	
	}
}
