package javaDSAPractice.com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

import java.util.Scanner;

public class TicketReservationMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TicketReservation tr = new TicketReservation();
        int choice;

        do {
        	System.out.println("\nEnter choice: ");
            System.out.println("\n1.Book Ticket  2.Cancel Ticket  3.Display");
            System.out.println("4.Search Ticket  5.Count Tickets  0.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Ticket ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Customer Name: ");
                    String c = sc.nextLine();
                    System.out.print("Movie Name: ");
                    String m = sc.nextLine();
                    System.out.print("Seat Number: ");
                    String s = sc.nextLine();
                    System.out.print("Booking Time: ");
                    String t = sc.nextLine();

                    tr.addTicket(id, c, m, s, t);
                    break;

                case 2:
                    System.out.print("Enter Ticket ID: ");
                    tr.removeTicket(sc.nextInt());
                    break;

                case 3:
                    tr.displayTickets();
                    break;

                case 4:
                    System.out.print("Enter Customer or Movie Name: ");
                    tr.search(sc.nextLine());
                    break;

                case 5:
                    tr.countTickets();
                    break;

                case 0:
                    System.out.println("Exit");
            }

        } while (choice != 0);

        sc.close();
    }
}
