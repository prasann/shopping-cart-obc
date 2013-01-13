package com.obc.shopping;

public class Item {

	private String name;
	private double unitPrice;
	private double discountRate;

	public Item(String name, double unitPrice) throws InvalidInputException {
		this(name, unitPrice, 0);
	}

	public Item(String name, double unitPrice, double discount)
			throws InvalidInputException {
		if (CustomString.isNullOrEmpty(name))
			throw new InvalidInputException("name shouldn't be empty");
		if (unitPrice <= 0)
			throw new InvalidInputException("price should be more than 0");

		if (discount < 0 || discount >= 1)
			throw new InvalidInputException(
					"discount should be non-negative and less than 1");

		this.name = name;
		this.unitPrice = unitPrice;
		this.discountRate = discount;
	}

	public double salePriceFor(int quantity) {
		return unitPrice * quantity * (1 - discountRate);
	}

	public double stickerPriceFor(int quantity) {
		return unitPrice * quantity;
	}

}
