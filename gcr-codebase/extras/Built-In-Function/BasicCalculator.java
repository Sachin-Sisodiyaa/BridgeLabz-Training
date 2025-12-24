/*9. Basic Calculator:
○ Write a program that performs basic mathematical operations (addition,
subtraction, multiplication, division) based on user input.
○ Each operation should be performed in its own function, and the program should
prompt the user to choose which operation to perform.*/



import java.util.Scanner;

public class BasicCalculator {

    public static double add(double a, double b) { 
	return a + b; 
    }
    public static double subtract(double a, double b) { 
	return a - b; 
    }
    public static double multiply(double a, double b) { 
	return a * b; 
    }
    public static double divide(double a, double b) { 
	return a / b; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.print("Choose operation (+ - * /): ");
        char op = sc.next().charAt(0);

        double result;
        switch (op) {
            case '+': result = add(a, b); 
			break;
            case '-': result = subtract(a, b);
			break;
            case '*': result = multiply(a, b); 
			break;
            case '/': result = divide(a, b); 
			break;
            default:
                System.out.println("Invalid operator");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
