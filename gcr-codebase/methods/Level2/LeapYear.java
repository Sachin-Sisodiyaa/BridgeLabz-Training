/*Write a program that takes a year as input and outputs the Year is a Leap Year or not 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
*/


import java.util.Scanner;

public class LeapYear {

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

	//Input for year
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Validate year
        if (year < 1582) {
            System.out.println("Leap year check is valid only for year >= 1582.");
        } else {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        sc.close();
    }
}
