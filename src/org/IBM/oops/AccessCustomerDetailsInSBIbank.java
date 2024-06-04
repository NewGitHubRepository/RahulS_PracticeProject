package org.IBM.oops;

public class AccessCustomerDetailsInSBIbank {

	public static void main(String[] args) {
		 EncapsulationExampleICICIBank	 b = new  EncapsulationExampleICICIBank();
		b.setCustomerID("abc101");
		String id = b.getCustomerID();
		System.out.println("Customer ID :: "+ id);
		b.setCustomerName("Rahul Gupta");
		System.out.println("Customer Name :: "+ b.getCustomerName());
		b.setCustomerBalance(10000);
		System.out.println("Customer Balance :: "+ b.getCustomerBalance());
	}

}
