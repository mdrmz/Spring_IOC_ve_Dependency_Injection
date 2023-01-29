package com.demo02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.demo02")
@PropertySource("class:values.properties")


public class Ioconfing {
@Bean	
public ICustomerDal database() {

	return new mySQl();
			
			
}

}
