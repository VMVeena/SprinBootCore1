package com.veena.springCore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Telusko 
{
	@Autowired
	@Qualifier("java")
	private Icource course;
	
	public String getTheCourse()
	{
		return course.registerCourse();
	}

}
