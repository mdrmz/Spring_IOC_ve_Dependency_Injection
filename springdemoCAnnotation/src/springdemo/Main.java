package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		
ICustomerDal customerservice =context.getBean("database",ICustomerDal.class);		

customerservice.add();

 

		 
		 
			}
	

	
}
