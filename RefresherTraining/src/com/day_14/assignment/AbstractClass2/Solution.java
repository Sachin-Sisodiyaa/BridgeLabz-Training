package com.day_14.assignment.AbstractClass2;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String title = scan.nextLine();
        String author = scan.nextLine();
        int price = scan.nextInt();

        Book new_novel = new MyBook(title, author, price);

        new_novel.display();

        scan.close();
    }
}