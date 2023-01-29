package spring01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		
ICustomerManager customerservice =context.getBean("service",ICustomerManager.class);		
customerservice.add();
customerservice.customadd();
 

		 
		 
			}
	

	
}
