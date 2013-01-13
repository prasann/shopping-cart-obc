package com.obc.shopping;

public class PhoneNumber {
	private int number;

	public PhoneNumber(int number) throws InvalidInputException {
		if (String.valueOf(number).length() != 10) 
			throw new InvalidInputException("PhoneNumber should be 10 digits long"); 
		this.number = number;
	}
	
	
}
