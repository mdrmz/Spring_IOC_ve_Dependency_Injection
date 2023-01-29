package com.mehmet;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(newConfig.class);
		//context.refresh();
		 ICustomerDal managger  = context.getBean("database",ICustomerDal.class);
		 managger.add();
	}

 
}
