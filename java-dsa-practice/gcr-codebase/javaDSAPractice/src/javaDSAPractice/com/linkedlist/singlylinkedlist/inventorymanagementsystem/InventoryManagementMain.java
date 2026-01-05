package javaDSAPractice.com.linkedlist.singlylinkedlist.inventorymanagementsystem;

import java.util.Scanner;

//Main class with user interaction
public class InventoryManagementMain {
 public static void main(String[] args) {
	 //Creating linkedlist
     Scanner sc = new Scanner(System.in);
     InventoryLinkedList inventory = new InventoryLinkedList();
     int choice;

     //do-while for choice to do operation and print result
     do {
         System.out.println("\n--- Inventory Management System ---");
         System.out.println("1. Add Item at Beginning");
         System.out.println("2. Add Item at End");
         System.out.println("3. Add Item at Position");
         System.out.println("4. Remove Item by ID");
         System.out.println("5. Update Quantity");
         System.out.println("6. Search by Item ID");
         System.out.println("7. Search by Item Name");
         System.out.println("8. Total Inventory Value");
         System.out.println("9. Sort by Name");
         System.out.println("10. Sort by Price");
         System.out.println("11. Display Inventory");
         System.out.println("12. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
             case 2:
             case 3:
                 System.out.print("Enter Item ID: ");
                 int id = sc.nextInt();
                 System.out.print("Enter Item Name: ");
                 String name = sc.next();
                 System.out.print("Enter Quantity: ");
                 int qty = sc.nextInt();
                 System.out.print("Enter Price: ");
                 double price = sc.nextDouble();

                 Item item = new Item(id, name, qty, price);

                 if (choice == 1)
                     inventory.addAtBeginning(item);
                 else if (choice == 2)
                     inventory.addAtEnd(item);
                 else {
                     System.out.print("Enter Position: ");
                     int pos = sc.nextInt();
                     inventory.addAtPosition(pos, item);
                 }
                 break;

             case 4:
                 inventory.removeByItemId(sc.nextInt());
                 break;

             case 5:
                 inventory.updateQuantity(sc.nextInt(), sc.nextInt());
                 break;

             case 6:
                 inventory.searchById(sc.nextInt());
                 break;

             case 7:
                 inventory.searchByName(sc.next());
                 break;

             case 8:
                 inventory.totalInventoryValue();
                 break;

             case 9:
                 inventory.sortByName(true);
                 break;

             case 10:
                 inventory.sortByPrice(true);
                 break;

             case 11:
                 inventory.display();
                 break;

             case 12:
                 System.out.println("Exiting...");
                 break;

             default:
                 System.out.println("Invalid choice.");
         }
     } while (choice != 12);

     sc.close();
 }
}

