package com.manash.target;

import org.springframework.stereotype.Component;

@Component("target")
public class ShoppingStore {
	public float shoppingBillAmount(String[] items,float[] prices) {
		float billAmt=0.0f;
		for(int i=0;i<prices.length;i++) {
			billAmt=billAmt+prices[i];
		}
		return billAmt;
	}
}