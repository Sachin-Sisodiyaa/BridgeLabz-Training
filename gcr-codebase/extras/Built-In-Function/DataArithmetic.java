/*2. Problem 2: Date Arithmetic Create a program that:
➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
➢ Then subtracts 3 weeks from the result.
Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and
minusWeeks() methods.*/



import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static LocalDate modifyDate(LocalDate date) {
        // Add 7 days, 1 month, 2 years
        LocalDate result = date.plusDays(7)
                               .plusMonths(1)
                               .plusYears(2);

        // Subtract 3 weeks
        return result.minusWeeks(3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-mm-dd): ");
        LocalDate inputDate = LocalDate.parse(sc.next());

        LocalDate finalDate = modifyDate(inputDate);

        System.out.println("Final Date after calculations: " + finalDate);
        sc.close();
    }
}
