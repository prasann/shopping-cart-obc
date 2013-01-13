package com.obc.payment;

public class PaymentGatewayDownException extends Exception {

	public PaymentGatewayDownException(String message){
		super(message);
	}
}
