package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class TennisSport implements SportInterface{

	@Override
	public void mysport() {
		System.out.println("Tennis");
	}
		
}
