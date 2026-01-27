package com.collections.scenario.shopingcart;

public class ShoppingCartMain {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 55000);
        cart.addProduct("Headphones", 2500);
        cart.addProduct("Keyboard", 1800);
        cart.addProduct("Mouse", 900);

        cart.displayCart();

        cart.displaySortedByPrice();
    }
}
