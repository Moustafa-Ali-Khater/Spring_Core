package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Admin implements PersonInterface{

	@Override
	public void name() {
		System.out.println("Admin");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Connect with DataBase");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Can't Connect with DataBase");
	}

}
