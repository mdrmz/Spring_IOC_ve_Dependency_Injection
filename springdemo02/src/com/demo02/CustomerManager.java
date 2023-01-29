package com.demo02;

public class CustomerManager  implements ICustomerManager{
	private ICustomerDal manger;
	private ICustomerDal customerManager;
	
	
	
	
	// setter injection
//	 public void setCustomerManager(ICustomerDal customerMan@ager) {
//		this.customerManager = customerManager;
//	}




		// setter injection
	public void setManger(ICustomerDal manger) {
		this.manger = manger;
	}


	
	 
	 
	 // constructor injection
	 
	/*public CustomerManager(ICustomerDal manger) {
		
		this.manger = manger;
	}*/
	 
	 
 public void add() {
	 manger.add();
 }
// public void customadd() {
//	 customerManager.add();
// }
	
		
	

}
