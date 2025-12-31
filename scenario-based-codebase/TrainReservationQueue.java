/*12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).*/



import java.util.Scanner;

public class TrainReservationQueue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Train Ticket Reservation System");

        int firstAc = 2;
        int secondAc = 4;
        int thirdAc = 5;
        int sleeper = 10;

	//While loop for multiple sear reservation
        while (true) {

            int totalSeats = firstAc + secondAc + thirdAc + sleeper;
            if (totalSeats == 0) {
                System.out.println("All seats are booked. Booking closed.");
                break;
            }

            System.out.println("Available Seats:");
            System.out.println("1AC: " + firstAc + " | 2AC: " + secondAc +
                               " | 3AC: " + thirdAc + " | Sleeper: " + sleeper);

            System.out.println("Choose Seat Type:");
            System.out.println("1AC || 2AC || 3AC || Sleeper");

            //Taking inputs
            String option = sc.next().trim().toLowerCase();

	//switch for booking the seat of own choice while checking the availablility
            switch (option) {

                case "1ac":
                    if (firstAc > 0) {
                        System.out.println("Pay 1200 for 1AC");
                        sc.nextInt();
                        firstAc--;
                        System.out.println("Successfully Reserved 1AC seat");
                    } else {
                        System.out.println("Seats of 1AC are full");
                    }
                    break;

                case "2ac":
                    if (secondAc > 0) {
                        System.out.println("Pay 800 for 2AC");
                        sc.nextInt();
                        secondAc--;
                        System.out.println("Successfully Reserved 2AC seat");
                    } else {
                        System.out.println("Seats of 2AC are full");
                    }
                    break;

                case "3ac":
                    if (thirdAc > 0) {
                        System.out.println("Pay 500 for 3AC");
                        sc.nextInt();
                        thirdAc--;
                        System.out.println("Successfully Reserved 3AC seat");
                    } else {
                        System.out.println("Seats of 3AC are full");
                    }
                    break;

                case "sleeper":
                    if (sleeper > 0) {
                        System.out.println("Pay 300 for Sleeper");
                        sc.nextInt();
                        sleeper--;
                        System.out.println("Successfully Reserved Sleeper seat");
                    } else {
                        System.out.println("Seats of Sleeper are full");
                    }
                    break;

                default:
                    System.out.println("Invalid seat option");
            }
        }

        sc.close();
    }
}
