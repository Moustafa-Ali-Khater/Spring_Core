package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class Student implements CompanyInterface{

	@Override
	public void display() {
		System.out.println("Student");
	}

}
