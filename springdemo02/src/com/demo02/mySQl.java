package com.demo02;

import org.springframework.beans.factory.annotation.Value;

public class mySQl  implements ICustomerDal{
	@Value("${local.email}")
String connectionString;

	public String getConnectionString() {
	return connectionString;
}

public void setConnectionString(String connectionString) {
	this.connectionString = connectionString;
}

	@Override
	public void add() {
		
		System.out.println("connectionString :"+this.connectionString);
        System.out.println("my sql veri tabaný yazýldý");		

	}
	

}
