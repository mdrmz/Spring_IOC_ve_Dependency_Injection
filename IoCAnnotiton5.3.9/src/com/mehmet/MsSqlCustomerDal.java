package com.mehmet;

import org.springframework.stereotype.Component;



public class MsSqlCustomerDal  implements ICustomerDal{
	String connectionString;
	public String getConnectionString() {
	return connectionString;
}
public void setConnectionString(String connectionString) {
	this.connectionString = connectionString;
}
	@Override
	public void add() {
		System.out.println(connectionString);
		System.out.println("Ms sql veri Tabaný na eklendi");
		
	}
	

}
