package com.obc.shopping;

public class LineItem {

	private Item item;
	private int quantity;

	public LineItem(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	
	public double salePrice() {
		return item.salePriceFor(quantity);
	}

	public double stickerPrice() {
		return item.stickerPriceFor(quantity);
	}
}
