package springdemo;

public class CustomerDal implements ICustomerDal {

	@Override
	public void add() {
		
		System.out.println("oracle veri tabný eklendi");
		System.out.println("connectionString :"+this.connectionString);

	}
	String connectionString;

	public String getConnectionString() {
	return connectionString;
}

public void setConnectionString(String connectionString) {
	this.connectionString = connectionString;
}
}
