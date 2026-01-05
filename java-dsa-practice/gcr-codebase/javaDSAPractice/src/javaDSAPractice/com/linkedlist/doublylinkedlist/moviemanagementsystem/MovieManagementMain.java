package javaDSAPractice.com.linkedlist.doublylinkedlist.moviemanagementsystem;

import java.util.Scanner;

public class MovieManagementMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        int choice;

        do {
        	System.out.println("Enter your choice");
            System.out.println("\n1.Add Begin  2.Add End  3.Remove  4.Display  5.Reverse  0.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                    System.out.print("Title: ");
                    String t = sc.nextLine();
                    System.out.print("Director: ");
                    String d = sc.nextLine();
                    System.out.print("Year: ");
                    int y = sc.nextInt();
                    System.out.print("Rating: ");
                    double r = sc.nextDouble();

                    if (choice == 1)
                        list.addAtBeginning(t, d, y, r);
                    else
                        list.addAtEnd(t, d, y, r);
                    break;

                case 3:
                    System.out.print("Enter title to remove: ");
                    list.removeByTitle(sc.nextLine());
                    break;

                case 4:
                    list.displayForward();
                    break;

                case 5:
                    list.displayReverse();
                    break;

                case 0:
                    System.out.println("Exit");
            }

        } while (choice != 0);

        sc.close();
    }
}

