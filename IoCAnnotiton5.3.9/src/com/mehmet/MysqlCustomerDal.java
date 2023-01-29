package com.mehmet;

import org.springframework.stereotype.Component;

@Component("database")
public class MysqlCustomerDal  implements ICustomerDal{
	String connectionString;
	public String getConnectionString() {
	return connectionString;
}
public void setConnectionString(String connectionString) {
	this.connectionString = connectionString;
}
	@Override
	public void add() {
		System.out.println("Mysql Veri Tabanưna Eklendi");
		
	}
 
}
