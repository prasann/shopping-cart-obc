package com.obc.shopping;

import com.obc.payment.PaymentGateway;

public class Order {
	
	private static final int UNPROCESSED = 1;
	private static final int PROCESSED = 2;
	
	private Customer person;
	private LineItems lineItems;
	private CreditCardDetails payedUsing;
	private Address shippingAddress;
	private int status = UNPROCESSED;
	
	public Order(Customer customer, LineItems lineItems,
			CreditCardDetails payedUsing, Address shippingAddress) throws InvalidInputException {
		if(customer == null) throw new InvalidInputException("Customer cannot be null");
		if(lineItems == null) throw new InvalidInputException("LineItems cannot be null");
		if(payedUsing == null) throw new InvalidInputException("CreditCard cannot be null");
		if(shippingAddress == null) throw new InvalidInputException("Shipping Address cannot be null");
		
		if(lineItems.size() == 0) throw new InvalidInputException("LineItems cannot be empty");
		
		this.person = customer;
		this.lineItems = lineItems;
		this.payedUsing = payedUsing;
		this.shippingAddress = shippingAddress;
	}
	
	// only here for demo!
	public Order() {
		
	}
	
	public double totalCost(){
		return lineItems.totalSalePrice();
	}
	
	public void process(PaymentGateway paymentGateway){		
		try {
			paymentGateway.processPayment(0, null);
		} catch (Exception e) {
		}
	}
	
	public boolean isProcessed(){
		return status == PROCESSED;
	}
	
}
