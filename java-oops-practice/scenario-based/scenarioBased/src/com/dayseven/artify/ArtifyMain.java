/*19. "Artify – Digital Art Marketplace"
Story: Artists sell digital art via Artify. Buyers can purchase, license, or subscribe to collections.
Requirements:
● Artwork class: title, artist, price, licenseType.
● User class: name, walletBalance.
● Interface IPurchasable with purchase() and license() methods.
● Encapsulation: licensing terms are protected.
● Use constructors to initialize artworks with or without previews.
● Operators: deduct wallet balance on purchase.
● Inheritance: DigitalArt, PrintArt from Artwork.
● Polymorphism: licensing varies across art types.*/



package com.dayseven.artify;

import java.util.Scanner;

public class ArtifyMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initialize artworks (so "show" always works)
        Artwork digitalArt = new DigitalArt(
                "Loish (Lois van Baarle)",
                "Abhishek Samal",
                5999,
                "Commercial"
        );

        Artwork printArt = new PrintArt(
                "The Great Wave off Kanagawa",
                "Hokusai",
                10000,
                "Business"
        );

        System.out.println("\nWelcome to Artify – Digital Art Marketplace");
        System.out.println("\nChoose an option: buy / show / exit");
        System.out.print("\nYour choice: ");

        String choice = sc.nextLine().trim().toLowerCase();

        switch (choice) {

            case "show":
                System.out.println("\nAvailable Artworks:\n");
                digitalArt.displayDetails();
                System.out.println();
                printArt.displayDetails();
                break;

            case "buy":
                System.out.print("\nEnter your Wallet Balance: ");
                double balance = sc.nextDouble();

                System.out.println("\nChoose Art Type:");
                System.out.println("1. Digital Art");
                System.out.println("2. Print Art");
                System.out.print("Enter choice: ");
                int artChoice = sc.nextInt();

                Artwork selectedArt = (artChoice == 1) ? digitalArt : printArt;

                if (balance >= selectedArt.getPrice()) {
                    System.out.println("\nYou purchased the art successfully!");
                    selectedArt.displayDetails();
                    System.out.println("\nRemaining Balance: " + (balance - selectedArt.getPrice()));
                } else {
                    System.out.println("\nInsufficient balance to purchase this artwork.");
                }
                break;

            case "exit":
                System.out.println("\nThank you for visiting Artify!");
                break;

            default:
                System.out.println("\nInvalid option. Please try again.");
        }

        sc.close();
    }
}
