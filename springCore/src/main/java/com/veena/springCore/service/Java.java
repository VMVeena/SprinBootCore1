package com.veena.springCore.service;

import org.springframework.stereotype.Service;

@Service
public class Java implements Icource
{

	@Override
	public String registerCourse()
	{
		
		return "Registered to Java/SpringBoot course";

	}

}
