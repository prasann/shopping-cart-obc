package com.obc.shopping;
public class Address {

	private String street1;
	private String street2;
	private String state;
	private String city;
	private int zipCode;

	public Address(String street1, String street2, String state, String city,
			int zipCode) throws InvalidInputException {
		if (zipCode < 10000 || zipCode > 99999) throw new InvalidInputException("ZipCode is incorrect");
		if (CustomString.isNullOrEmpty(street1)) throw new InvalidInputException("Street1 is empty");
		if (CustomString.isNullOrEmpty(street2)) throw new InvalidInputException("Street2 is empty");
		if (CustomString.isNullOrEmpty(state)) throw new InvalidInputException("State is empty");
		if (CustomString.isNullOrEmpty(city)) throw new InvalidInputException("City is empty");
		
		this.street1 = street1;
		this.street2 = street2;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
	}
}
