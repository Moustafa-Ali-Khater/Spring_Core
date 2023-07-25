package com.spring.withoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.withoutXML")
@PropertySource("data.properties")
public class SpringConfigue {

	/*@Bean
	public MasterInterface mymaster() {
		return new Master();
	}*/
}
