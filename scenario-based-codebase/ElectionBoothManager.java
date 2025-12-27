/* 3. Election Booth Manager ️
Design a polling booth system.
● Take age input.
● Use if to check if eligible (>=18).
● Record vote (1, 2, or 3 for candidates).
● Loop for multiple voters, exit on special code.
*/



import java.util.Scanner;

public class ElectionBoothManager {

	public static void main(String[] args) {
	
	//Scanner class object and variable initialization
        Scanner sc = new Scanner(System.in);

        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;

	//Loop and condition to count votes
        while (true) {

        	System.out.print("\nEnter age of voter OR Enter -1 to exit from voting booth: ");
                int age = sc.nextInt();

                if (age == -1) {
                	break;
                }

                if (age >= 18) {
                	System.out.println("Eligible to vote");
                	System.out.println("1 For Candidate A");
                	System.out.println("2 For Candidate B");
                	System.out.println("3 For Candidate C");

                	System.out.print("Enter your vote: ");
                	int vote = sc.nextInt();

                	if (vote == 1) {
                        	candidate1++;
                	} else if (vote == 2) {
                    		candidate2++;
                	} 	
			else if (vote == 3) {
                    		candidate3++;
                	}
		 	else {
                    		System.out.println("Invalid vote!");
                	}

            		} 
			else {
                		System.out.println("Not eligible to vote");
            		}
        	}

	//print results
        System.out.println("\nElection Results");
        System.out.println("Candidate A Votes: " + candidate1);
        System.out.println("Candidate B Votes: " + candidate2);
        System.out.println("Candidate C Votes: " + candidate3);

        sc.close();
    }
}
