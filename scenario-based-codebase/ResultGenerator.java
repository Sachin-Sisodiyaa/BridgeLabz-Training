import java.util.Scanner;

public class ResultGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        // Taking input using for-loop
        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double avg = total / 5.0;

        System.out.println("Average: " + avg);

        // Switch based on avg 
        switch ((int) avg / 10) {
            case 10:
            case 9:
            case 8:
                System.out.println("Grade A");
                break;

            case 7:
                System.out.println("Grade B");
                break;

            case 6:
                System.out.println("Grade C");
                break;

            case 5:
                System.out.println("Grade D");
                break;

            case 4:
                System.out.println("Grade E");
                break;

            default:
                System.out.println("Fail");
        }

        sc.close();
    }
}
	