/* 14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.*/



import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalBill = 0;
        char continueBooking;

        while (true) {

            System.out.println("\n--- Movie Ticket Booking ---");
            System.out.println("1. Action Movie");
            System.out.println("2. Comedy Movie");
            System.out.println("3. Horror Movie");
            System.out.println("Select movie type: ");
            String movieType = sc.next().trim().toLowerCase();

            System.out.println("Choose Seat Type (Gold/Silver): ");
            String seatType = sc.next();

            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next();

            double ticketPrice = 0;
            double snackPrice = 0;

            // switch for movie type
            switch (movieType) {
                case "action":
                    ticketPrice = 200;
                    break;
                case "comedy":
                    ticketPrice = 180;
                    break;
                case "horror":
                    ticketPrice = 150;
                    break;
                default:
                    System.out.println("Invalid movie selection!");
                    continue;
            }

            // if for seat type
            if (seatType.equalsIgnoreCase("Gold")) {
                ticketPrice += 100;
            } else if (seatType.equalsIgnoreCase("Silver")) {
                ticketPrice += 50;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }

            // if for snacks
            if (snacks.equalsIgnoreCase("yes")) {
                snackPrice = 80;
            }
		
	    System.out.print("Enter number of tickets: ");
	    int numOfTicket = sc.nextInt();

            double customerBill = (ticketPrice + snackPrice) * numOfTicket;
            totalBill += customerBill;

            System.out.println("\nTicket Price: " + ticketPrice);
            System.out.println("Snacks Price: " + snackPrice);
	    System.out.println("Enter number of tickets: " + numOfTicket);
            System.out.println("Total Bill for this customer: " + customerBill);

            System.out.print("\nBook ticket for next customer? (y/n): ");
            continueBooking = sc.next().charAt(0);

            if (continueBooking == 'n' || continueBooking == 'N') {
                break;
            }
        }

        System.out.println("\n--- Booking Session Ended ---");
        System.out.println("Total Collection: " + totalBill);

        sc.close();
    }
}
