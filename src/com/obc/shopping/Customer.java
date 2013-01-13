package com.obc.shopping;


public class Customer {

	private Address defaultShipping;
	private PhoneNumber dayPhone;
	private String firstName;
	private String lastName;
	
	public Customer(Address defaultShipping, PhoneNumber dayPhone,
			String firstName, String lastName) throws InvalidInputException {

		if (CustomString.isNullOrEmpty(firstName)) throw new InvalidInputException("firstName shouldn't be empty");
		if (CustomString.isNullOrEmpty(lastName)) throw new InvalidInputException("lastName shouldn't be empty");
		if (defaultShipping == null) throw new InvalidInputException("defaultShipping shouldn't be empty");
		
		this.defaultShipping = defaultShipping;
		this.dayPhone = dayPhone;
		this.firstName = firstName;
		this.lastName = lastName;
	}
		
}
