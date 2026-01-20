/*4. FlashDealz – Product Sorting by Discount (Quick Sort)
Story: An e-commerce platform runs a flash sale with millions of products, each offering
different discounts. Users want to see the top discounted products instantly. To quickly sort
such large data, the backend uses Quick Sort, known for its fast average-case performance
and efficiency.
Concepts Involved:
● Quick Sort
● Large unsorted data
● Performance optimization*/





package com.dayseven.flashdealz;

public class FlashDealzMain {

    public static void main(String[] args) {

        Product[] products = {
            new Product("P101", "Laptop", 45),
            new Product("P102", "Mobile", 60),
            new Product("P103", "Headphones", 30),
            new Product("P104", "Smart Watch", 55),
            new Product("P105", "TV", 70)
        };

        QuickSort.quickSort(products, 0, products.length - 1);

        System.out.println("Top Discounted Products:");
        for (Product p : products) {
            System.out.println(p.name + " → " + p.discount + "% OFF");
        }
    }
}
