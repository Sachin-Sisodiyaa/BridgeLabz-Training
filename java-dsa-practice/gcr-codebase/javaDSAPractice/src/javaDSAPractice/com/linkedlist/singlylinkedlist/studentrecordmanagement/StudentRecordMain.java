package javaDSAPractice.com.linkedlist.singlylinkedlist.studentrecordmanagement;

import java.util.Scanner;

//Main class
public class StudentRecordMain {
 public static void main(String[] args) {
	 //Creating linkedlist
     Scanner sc = new Scanner(System.in);
     StudentLinkedList list = new StudentLinkedList();
     int choice;

     //do-while loop for operation choices and printing result accordingly
     do {
         System.out.println("\n--- Student Record Management ---");
         System.out.println("1. Add at Beginning");
         System.out.println("2. Add at End");
         System.out.println("3. Add at Position");
         System.out.println("4. Delete by Roll No");
         System.out.println("5. Search by Roll No");
         System.out.println("6. Update Grade");
         System.out.println("7. Display All");
         System.out.println("8. Exit");
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
             case 2:
             case 3:
                 System.out.print("Enter Roll No: ");
                 int roll = sc.nextInt();
                 System.out.print("Enter Name: ");
                 String name = sc.next();
                 System.out.print("Enter Age: ");
                 int age = sc.nextInt();
                 System.out.print("Enter Grade: ");
                 char grade = sc.next().charAt(0);

                 Student s = new Student(roll, name, age, grade);

                 if (choice == 1)
                     list.addAtBeginning(s);
                 else if (choice == 2)
                     list.addAtEnd(s);
                 else {
                     System.out.print("Enter Position: ");
                     int pos = sc.nextInt();
                     list.addAtPosition(pos, s);
                 }
                 break;

             case 4:
                 System.out.print("Enter Roll No to delete: ");
                 list.deleteByRollNo(sc.nextInt());
                 break;

             case 5:
                 System.out.print("Enter Roll No to search: ");
                 list.searchByRollNo(sc.nextInt());
                 break;

             case 6:
                 System.out.print("Enter Roll No: ");
                 int r = sc.nextInt();
                 System.out.print("Enter New Grade: ");
                 char g = sc.next().charAt(0);
                 list.updateGrade(r, g);
                 break;

             case 7:
                 list.display();
                 break;

             case 8:
                 System.out.println("Exiting program...");
                 break;

             default:
                 System.out.println("Invalid choice.");
         }
     } while (choice != 8);

     sc.close();
 }
}

