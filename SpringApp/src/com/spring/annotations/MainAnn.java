package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*MasterInterface mas = context.getBean("master", MasterInterface.class);
		mas.name();
        //SportInterface te = context.getBean("tennisSport", SportInterface.class);
        //te.mysport();
		//mas.callmysport();*/
		
		/*CompanyInterface co = context.getBean("user", CompanyInterface.class);
		co.display();*/
		context.close();

	}

}
