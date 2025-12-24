/*3. Prime Number Checker:
○ Create a program that checks whether a given number is a prime number. ○
The program should use a separate function to perform the prime check and
return the result.*/



import java.util.Scanner;

public class CheckPrime {

    //Method to check prime number
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println(isPrime(n) ? "Prime Number" : "Not a Prime Number");
        sc.close();
    }
}
