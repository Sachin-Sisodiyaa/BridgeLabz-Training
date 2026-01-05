package javaDSAPractice.com.linkedlist.singlylinkedlist.inventorymanagementsystem;

//Handles inventory operations using singly linked list
class InventoryLinkedList {
 private Node head;

 // Add item at beginning
 void addAtBeginning(Item item) {
     Node newNode = new Node(item);
     newNode.next = head;
     head = newNode;
     System.out.println("Item added at beginning.");
 }

 // Add item at end
 void addAtEnd(Item item) {
     Node newNode = new Node(item);

     if (head == null) {
         head = newNode;
         return;
     }

     Node temp = head;
     while (temp.next != null) {
         temp = temp.next;
     }
     temp.next = newNode;
     System.out.println("Item added at end.");
 }

 // Add item at specific position
 void addAtPosition(int pos, Item item) {
     if (pos <= 0) {
         System.out.println("Invalid position.");
         return;
     }

     if (pos == 1) {
         addAtBeginning(item);
         return;
     }

     Node newNode = new Node(item);
     Node temp = head;

     for (int i = 1; i < pos - 1 && temp != null; i++) {
         temp = temp.next;
     }

     if (temp == null) {
         System.out.println("Position out of range.");
     } else {
         newNode.next = temp.next;
         temp.next = newNode;
         System.out.println("Item added at position " + pos);
     }
 }

 // Remove item by Item ID
 void removeByItemId(int itemId) {
     if (head == null) {
         System.out.println("Inventory is empty.");
         return;
     }

     if (head.data.itemId == itemId) {
         head = head.next;
         System.out.println("Item removed.");
         return;
     }

     Node temp = head;
     while (temp.next != null && temp.next.data.itemId != itemId) {
         temp = temp.next;
     }

     if (temp.next == null) {
         System.out.println("Item not found.");
     } else {
         temp.next = temp.next.next;
         System.out.println("Item removed.");
     }
 }

 // Update quantity by Item ID
 void updateQuantity(int itemId, int newQty) {
     Node temp = head;

     while (temp != null) {
         if (temp.data.itemId == itemId) {
             temp.data.quantity = newQty;
             System.out.println("Quantity updated.");
             return;
         }
         temp = temp.next;
     }
     System.out.println("Item not found.");
 }

 // Search by Item ID
 void searchById(int itemId) {
     Node temp = head;

     while (temp != null) {
         if (temp.data.itemId == itemId) {
             displayItem(temp.data);
             return;
         }
         temp = temp.next;
     }
     System.out.println("Item not found.");
 }

 // Search by Item Name
 void searchByName(String name) {
     Node temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.data.itemName.equalsIgnoreCase(name)) {
             displayItem(temp.data);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("Item not found.");
 }

 // Calculate total inventory value
 void totalInventoryValue() {
     double total = 0;
     Node temp = head;

     while (temp != null) {
         total += temp.data.price * temp.data.quantity;
         temp = temp.next;
     }

     System.out.println("Total Inventory Value = ₹" + total);
 }

 // Sort by Item Name
 void sortByName(boolean ascending) {
     for (Node i = head; i != null; i = i.next) {
         for (Node j = i.next; j != null; j = j.next) {
             if ((ascending && i.data.itemName.compareToIgnoreCase(j.data.itemName) > 0) ||
                 (!ascending && i.data.itemName.compareToIgnoreCase(j.data.itemName) < 0)) {
                 swap(i, j);
             }
         }
     }
     System.out.println("Inventory sorted by name.");
 }

 // Sort by Price
 void sortByPrice(boolean ascending) {
     for (Node i = head; i != null; i = i.next) {
         for (Node j = i.next; j != null; j = j.next) {
             if ((ascending && i.data.price > j.data.price) ||
                 (!ascending && i.data.price < j.data.price)) {
                 swap(i, j);
             }
         }
     }
     System.out.println("Inventory sorted by price.");
 }

 // Swap item data between nodes
 private void swap(Node a, Node b) {
     Item temp = a.data;
     a.data = b.data;
     b.data = temp;
 }

 // Display all items
 void display() {
     if (head == null) {
         System.out.println("Inventory is empty.");
         return;
     }

     Node temp = head;
     System.out.println("ID  Name  Qty  Price");
     while (temp != null) {
         displayItem(temp.data);
         temp = temp.next;
     }
 }

 // Display single item
 private void displayItem(Item i) {
     System.out.println(i.itemId + "  " + i.itemName + "  " +
                        i.quantity + "  " + i.price);
 }
}

