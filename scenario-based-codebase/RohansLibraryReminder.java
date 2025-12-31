/*15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.*/




import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int finePerDay = 5;

        System.out.println("Rohan's Library Reminder App");

        // Loop for 5 books
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i);

            // Due Date input
            System.out.print("Enter Due Date (DD MM YYYY): ");
            int dueDay = sc.nextInt();
            int dueMonth = sc.nextInt();
            int dueYear = sc.nextInt();

            // Return Date input
            System.out.print("Enter Return Date (DD MM YYYY): ");
            int returnDay = sc.nextInt();
            int returnMonth = sc.nextInt();
            int returnYear = sc.nextInt();

            // Create LocalDate objects
            LocalDate dueDate = LocalDate.of(dueYear, dueMonth, dueDay);
            LocalDate returnDate = LocalDate.of(returnYear, returnMonth, returnDay);

            // Check late return
            if (returnDate.isAfter(dueDate)) {
                long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);
                long fine = lateDays * finePerDay;

                System.out.println("Returned late by " + lateDays + " days.");
                System.out.println("Fine: " + fine);
            } else {
                System.out.println("Returned on time. No fine");
            }
        }

        sc.close();
        System.out.println("\nThank you for using the Library Reminder App!");
    }
}
