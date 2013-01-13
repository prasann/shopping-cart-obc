package com.obc.shopping;

import java.util.ArrayList;

public class LineItems extends ArrayList<LineItem> {

	public double totalSalePrice() {
		double answer = 0;
		for (LineItem lineItem : this) {
			answer += lineItem.salePrice();
		}
		return answer;		
	}
	
	public double totalStickerPrice() {
		double answer = 0;
		for (LineItem lineItem : this) {
			answer += lineItem.stickerPrice();
		}
		return answer;		
	}

	
}
