package com.obc.payment;

import com.obc.shopping.CreditCardDetails;

public class HdbcPaymentGateway implements PaymentGateway {

	public boolean processPayment(double amount,
			CreditCardDetails creditCardDetails)
			throws PaymentGatewayDownException {
		throw new ServiceNotFoundException("Service cannot be reached");
	}

}
