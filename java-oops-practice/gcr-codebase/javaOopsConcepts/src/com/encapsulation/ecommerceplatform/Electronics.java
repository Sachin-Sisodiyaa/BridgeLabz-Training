package com.encapsulation.ecommerceplatform;

public class Electronics extends Product implements Taxable {

	public Electronics(int productId, String name, float price) {
		super(productId, name, price);
	}

	@Override
	public double calculateTax() {
		return getPrice() * 0.05;
	}

	@Override
    public String getTaxDetails() {
        return "GST @ 5%";
    }

	@Override
	double calculateDiscount() {	
		return getPrice() * 0.20;
	}
}
