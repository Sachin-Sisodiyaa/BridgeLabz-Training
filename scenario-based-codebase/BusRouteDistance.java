/*19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.*/


import java.util.Scanner;

public class BusRouteDistance {

    public static void main(String[] args) {
	//Variable declaration
        Scanner sc = new Scanner(System.in);
        double totalDistance = 0;
        int stopNumber = 1;
        int choice;

        while (true) {

            // Generate distance for this stop
            int distance = (int) (Math.random() * 20) + 1;
            totalDistance += distance;

            System.out.println("\nBus arrived at Stop " + stopNumber);
            System.out.println("Distance covered till this stop: " + distance + " km");

            System.out.print("Do you want to get off at this stop? [1 = Yes, 0 = No]: ");
            choice = sc.nextInt();

            if (choice == 1) {
                break;
            }

            stopNumber++;
        }

	//printing total distance covered
        System.out.println("\nPassenger got off the bus.");
        System.out.println("Total Distance Travelled: " + totalDistance + " km");

        sc.close();
    }
}
		