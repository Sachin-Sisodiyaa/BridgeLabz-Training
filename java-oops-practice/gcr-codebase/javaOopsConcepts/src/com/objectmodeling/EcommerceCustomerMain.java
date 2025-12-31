package com.objectmodeling;

public class EcommerceCustomerMain {
	public static void main(String[] args) {

        // Products
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Mouse", 800);
        Product p3 = new Product("Keyboard", 1500);

        // Customer
        EcommerceCustomer customer = new EcommerceCustomer("Sachin");

        // Order
        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(102);
        order2.addProduct(p3);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        System.out.println();
        customer.showOrders();
    }
}
