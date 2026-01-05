package javaDSAPractice.com.linkedlist.singlylinkedlist.studentrecordmanagement;

//Manages linked list operations
class StudentLinkedList {
 private Node head;  

 // Add student at beginning
 void addAtBeginning(Student s) {
     Node newNode = new Node(s);
     newNode.next = head;
     head = newNode;
     System.out.println("Student added at beginning.");
 }

 // Add student at end
 void addAtEnd(Student s) {
     Node newNode = new Node(s);

     if (head == null) {
         head = newNode;
         return;
     }

     Node temp = head;
     while (temp.next != null) {
         temp = temp.next;
     }
     temp.next = newNode;
     System.out.println("Student added at end.");
 }

 // Add student at specific position
 void addAtPosition(int pos, Student s) {
     if (pos <= 0) {
         System.out.println("Invalid position.");
         return;
     }

     if (pos == 1) {
         addAtBeginning(s);
         return;
     }

     Node newNode = new Node(s);
     Node temp = head;

     // Traverse to (pos-1)
     for (int i = 1; i < pos - 1 && temp != null; i++) {
         temp = temp.next;
     }

     if (temp == null) {
         System.out.println("Position out of range.");
     } else {
         newNode.next = temp.next;
         temp.next = newNode;
         System.out.println("Student added at position " + pos);
     }
 }

 // Delete student by roll number
 void deleteByRollNo(int rollNo) {
     if (head == null) {
         System.out.println("List is empty.");
         return;
     }

     // If first node is to be deleted
     if (head.data.rollNo == rollNo) {
         head = head.next;
         System.out.println("Student deleted.");
         return;
     }

     Node temp = head;
     while (temp.next != null && temp.next.data.rollNo != rollNo) {
         temp = temp.next;
     }

     if (temp.next == null) {
         System.out.println("Student not found.");
     } else {
         temp.next = temp.next.next;
         System.out.println("Student deleted.");
     }
 }

 // Search student by roll number
 void searchByRollNo(int rollNo) {
     Node temp = head;

     while (temp != null) {
         if (temp.data.rollNo == rollNo) {
             System.out.println("Student Found:");
             System.out.println(temp.data.rollNo + " "
                     + temp.data.name + " "
                     + temp.data.age + " "
                     + temp.data.grade);
             return;
         }
         temp = temp.next;
     }
     System.out.println("Student not found.");
 }

 // Update grade of a student
 void updateGrade(int rollNo, char newGrade) {
     Node temp = head;

     while (temp != null) {
         if (temp.data.rollNo == rollNo) {
             temp.data.grade = newGrade;
             System.out.println("Grade updated successfully.");
             return;
         }
         temp = temp.next;
     }
     System.out.println("Student not found.");
 }

 // Display all student records
 void display() {
     if (head == null) {
         System.out.println("No student records available.");
         return;
     }

     Node temp = head;
     System.out.println("RollNo  Name  Age  Grade");
     while (temp != null) {
         System.out.println(temp.data.rollNo + "   "
                 + temp.data.name + "   "
                 + temp.data.age + "   "
                 + temp.data.grade);
         temp = temp.next;
     }
 }
}

