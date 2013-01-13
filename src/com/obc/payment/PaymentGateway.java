package com.obc.payment;

import com.obc.shopping.CreditCardDetails;

public interface PaymentGateway {

	public boolean processPayment(double amount,
			CreditCardDetails creditCardDetails)
			throws PaymentGatewayDownException;

}
