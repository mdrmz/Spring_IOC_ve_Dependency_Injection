package spring01;

public class CustomerDal implements ICustomerDal {

	@Override
	public void add() {
		
		System.out.println("oracle veri tabn� eklendi");
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
