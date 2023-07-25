package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class User implements CompanyInterface{

	@Override
	public void display() {
		System.out.println("User");
	}

}
