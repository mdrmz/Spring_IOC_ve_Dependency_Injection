package spring01;


public class mySQl  implements ICustomerDal{
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
