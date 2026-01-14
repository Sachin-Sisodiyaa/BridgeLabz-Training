/*3. AmbulanceRoute – Emergency Patient Navigation (Circular Linked List)
Story: In a hospital, there are multiple buildings connected in a circular fashion:
Emergency → Radiology → Surgery → ICU → Emergency. When an ambulance is bringing in patients, it follows a Circular Linked List to decide the nearest available unit for emergency treatment.
Requirements:
● Each node represents a hospital unit.
● Rotate through units until an available one is found.
● Simulate patient redirection in a circular path.
● Remove a unit if it's under maintenance.*/




package com.dayone.ambulanceroute;

import java.util.Scanner;

public class AmbulanceRouteMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AmbulanceRoute route = new AmbulanceRoute();
        int choice;

        do {
            System.out.println("\n===== Ambulance Route Menu =====");
            System.out.println("1. Add Hospital Unit");
            System.out.println("2. Find Nearest Available Unit");
            System.out.println("3. Remove Unit (Maintenance)");
            System.out.println("4. Show All Units");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Unit Name: ");
                    String name = sc.nextLine();

                    System.out.print("Is unit available? (true/false): ");
                    boolean available = sc.nextBoolean();

                    route.addUnit(name, available);
                    System.out.println("Unit added.");
                    break;

                case 2:
                    route.findAvailableUnit();
                    break;

                case 3:
                    System.out.print("Enter Unit Name to remove: ");
                    route.removeUnit(sc.nextLine());
                    break;

                case 4:
                    route.showUnits();
                    break;

                case 5:
                    System.out.println("Exiting Ambulance Route System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
