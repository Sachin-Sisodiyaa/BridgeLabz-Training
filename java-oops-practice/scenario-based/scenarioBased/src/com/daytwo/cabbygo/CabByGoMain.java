/*6. "CabbyGo – A Ride-Hailing App in the Making"
Story: You’ve joined a startup building CabbyGo, a ride-hailing app. You're tasked with building
the backend logic for managing vehicles, drivers, and ride booking.
Requirements:
● Vehicle (class): fields like vehicleNumber, capacity, type.
● Driver (class): fields like name, licenseNumber, rating.
● Constructors to initialize vehicles and drivers.
● An IRideService interface with methods like bookRide() and endRide().
● Use encapsulation to hide sensitive data like location, fare.
● Implement polymorphism with different vehicle types like Mini, Sedan, SUV (all extend
Vehicle).

● Use operators to calculate fare: baseFare + distance * rate.



● Apply access modifiers carefully: private for rating and fare, public methods to
read data.*/



package com.daytwo.cabbygo;

import java.util.Scanner;

//Main class
public class CabByGoMain {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Taking driver input
     System.out.print("Enter Driver Name: ");
     String name = sc.nextLine();

     System.out.print("Enter License Number: ");
     String license = sc.nextLine();

     System.out.print("Enter Rating: ");
     double rating = sc.nextDouble();
     sc.nextLine(); // clear buffer

     Driver driver = new Driver(name, license, rating);

     // Vehicle selection
     System.out.println("1. Mini  2. Sedan  3. SUV");
     int choice = sc.nextInt();
     sc.nextLine();

     System.out.print("Enter Vehicle Number: ");
     String vehicleNumber = sc.nextLine();

     Vehicle vehicle = null; // Parent reference

     // Polymorphism: object decided at runtime
     switch (choice) {
         case 1: vehicle = new Mini(vehicleNumber); break;
         case 2: vehicle = new Sedan(vehicleNumber); break;
         case 3: vehicle = new SUV(vehicleNumber); break;
         default:
             System.out.println("Invalid choice");
             return;
     }

     // Distance input
     System.out.print("Enter Distance (km): ");
     double distance = sc.nextDouble();

     // Display details
     System.out.println("\n===== Ride Details =====");
     System.out.println("Driver Name: " + driver.getName());
     System.out.println("Driver Rating: " + driver.getRating());

     vehicle.showVehicleDetails();
     vehicle.bookRide(distance);  // Runtime binding
     vehicle.endRide();

     sc.close();
 }
}

