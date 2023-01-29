package com.demo02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
			new	  AnnotationConfigApplicationContext( Ioconfing.class);
		
		
ICustomerDal customerservice =context.getBean("database",ICustomerDal.class);		

customerservice.add();

 

		 
		 
			}
	

	
}
