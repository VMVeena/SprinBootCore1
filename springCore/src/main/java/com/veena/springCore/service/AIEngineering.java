package com.veena.springCore.service;

import org.springframework.stereotype.Service;
@Service
public class AIEngineering implements Icource 
{

	@Override
	public String registerCourse() 
	{
		
		return "Registered to AI Engineering course";
	}

}
