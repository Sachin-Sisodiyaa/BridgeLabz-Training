package com.encapsulation.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {

	public NonVegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}

	@Override
    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "5%  Discount";
    }
}
