package javaDSAPractice.com.linkedlist.circularlinkedlist.taskscheduler;

import java.util.Scanner;

public class TaskSchedulerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaskScheduler ts = new TaskScheduler();
        int choice;

        do {
            System.out.println("\n1.Add Task  2.Remove Task  3.View Next");
            System.out.println("4.Display All  5.Search by Priority  0.Exit");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Priority: ");
                    int p = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Due Date: ");
                    String d = sc.nextLine();

                    ts.addAtEnd(id, name, p, d);
                    break;

                case 2:
                    System.out.print("Enter Task ID: ");
                    ts.removeById(sc.nextInt());
                    break;

                case 3:
                    ts.viewAndMoveNext();
                    break;

                case 4:
                    ts.displayAll();
                    break;

                case 5:
                    System.out.print("Enter Priority: ");
                    ts.searchByPriority(sc.nextInt());
                    break;

                case 0:
                    System.out.println("Exit");
            }

        } while (choice != 0);

        sc.close();
    }
}
