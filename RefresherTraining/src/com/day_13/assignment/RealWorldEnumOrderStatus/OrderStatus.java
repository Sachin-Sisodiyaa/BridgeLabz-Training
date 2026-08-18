package com.day_13.assignment.RealWorldEnumOrderStatus;

public enum OrderStatus {

	PLACED,
	SHIPPED,
	DELIVERED,
	CANCELLED;
	
	public boolean isFinal() {
		if(this == DELIVERED || this == CANCELLED) {
			return true;
		}
		return false;
	}
}
