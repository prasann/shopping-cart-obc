package com.obc.shopping;

import java.util.Date;

public class CreditCardDetails {
	private int cardNumber;
	private CardType cardType;
	private Date expiresOn;
	
	public CreditCardDetails(int cardNumber, CardType cardType, Date expiresOn) {
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.expiresOn = expiresOn;
	}
	
	

}
