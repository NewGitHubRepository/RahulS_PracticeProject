package org.IBM.oops;

public class EncapsulationExampleICICIBank {
	private String customerName;
	private int customerBalance;
	private String customerID;
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	public int getCustomerBalance() {
		return customerBalance;
	}
	public void setCustomerBalance(int customerBalance) {
		this.customerBalance = customerBalance;
	}
	
	
	public void setCustomerName(String customerName)
	{
		this.customerName =customerName ;
	}
	public String getCustomerName() {
		return customerName;
	}
}
