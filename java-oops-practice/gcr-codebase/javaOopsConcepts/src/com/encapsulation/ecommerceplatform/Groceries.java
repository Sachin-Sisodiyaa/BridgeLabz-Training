package com.encapsulation.ecommerceplatform;

public class Groceries extends Product implements Taxable{

	public Groceries(int productId, String name, float price) {
		super(productId, name, price);
	
	}

	@Override
	public double calculateTax() {
		return getPrice() * 0.02;
	}

	@Override
    public String getTaxDetails() {
        return "GST @ 2%";
    }

	@Override
	double calculateDiscount() {	
		return getPrice() * 0.20;
	}
}
