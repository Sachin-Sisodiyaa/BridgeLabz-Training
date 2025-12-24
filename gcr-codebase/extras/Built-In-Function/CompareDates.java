/*4. Problem 4: Date Comparison Write a program that:
➢ Takes two date inputs and compares them to check if the first date is before, after,
or the same as the second date.
Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate*/

import java.time.LocalDate;
import java.util.Scanner;

public class CompareDates {

    //Method to compare two dates
    public static void compareDates(LocalDate d1, LocalDate d2) {
        if (d1.isBefore(d2)) {
            System.out.println("First date is BEFORE second date");
        } else if (d1.isAfter(d2)) {
            System.out.println("First date is AFTER second date");
        } else {
            System.out.println("Both dates are the SAME");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(sc.next());

        System.out.print("Enter second date (yyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(sc.next());

        compareDates(date1, date2);
        sc.close();
    }
}
