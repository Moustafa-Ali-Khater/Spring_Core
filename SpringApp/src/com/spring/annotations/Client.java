package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class Client implements CompanyInterface{

	@Override
	public void display() {
		System.out.println("Client");
	}

}
