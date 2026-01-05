package javaDSAPractice.com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;
import java.util.Scanner;

public class RoundRobinMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RoundRobinScheduler rr = new RoundRobinScheduler();
        int choice;

        do {
            System.out.println("\n1.Add Process  2.Execute  3.Display  0.Exit");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Process ID: ");
                    int id = sc.nextInt();
                    System.out.print("Burst Time: ");
                    int bt = sc.nextInt();
                    System.out.print("Priority: ");
                    int p = sc.nextInt();

                    rr.addProcess(id, bt, p);
                    break;

                case 2:
                    System.out.print("Time Quantum: ");
                    rr.execute(sc.nextInt());
                    break;

                case 3:
                    rr.display();
                    break;

                case 0:
                    System.out.println("Exit");
            }

        } while (choice != 0);

        sc.close();
    }
}
