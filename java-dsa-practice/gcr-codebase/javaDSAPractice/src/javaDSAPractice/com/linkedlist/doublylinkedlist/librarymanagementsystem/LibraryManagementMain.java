package javaDSAPractice.com.linkedlist.doublylinkedlist.librarymanagementsystem;

import java.util.Scanner;

public class LibraryManagementMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryDLL lib = new LibraryDLL();
        int choice;

        do {
        	System.out.println("Enter your choice");
            System.out.println("\n1.Add Begin  2.Add End  3.Remove  4.Search");
            System.out.println("5.Update Status  6.Display  7.Reverse  8.Count  0.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                    System.out.print("Book ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Title: ");
                    String t = sc.nextLine();
                    System.out.print("Author: ");
                    String a = sc.nextLine();
                    System.out.print("Genre: ");
                    String g = sc.nextLine();
                    System.out.print("Available (true/false): ");
                    boolean av = sc.nextBoolean();

                    if (choice == 1)
                        lib.addAtBeginning(id, t, a, g, av);
                    else
                        lib.addAtEnd(id, t, a, g, av);
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    lib.removeById(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Title or Author: ");
                    lib.search(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Book ID: ");
                    int bid = sc.nextInt();
                    System.out.print("New Status (true/false): ");
                    lib.updateAvailability(bid, sc.nextBoolean());
                    break;

                case 6:
                    lib.displayForward();
                    break;

                case 7:
                    lib.displayReverse();
                    break;

                case 8:
                    lib.countBooks();
                    break;

                case 0:
                    System.out.println("Exit");
            }

        } while (choice != 0);

        sc.close();
    }
}
