package com.veena.springCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.veena.springCore.service.Telusko;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container =SpringApplication.run(SpringCoreApplication.class, args);
		Telusko telusko = container.getBean(Telusko.class);
		System.out.println(telusko.getTheCourse());
	}

}
