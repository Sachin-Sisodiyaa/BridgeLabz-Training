/* 17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.*/



import java.util.Scanner;

public class OnlineQuizApplication {
	public static void main(String[] args) {
		
		//Taking inputs
		Scanner sc = new Scanner(System.in);
		String questions[] = {"Who discovered penicillin", "What is the capital of Japan", "What is the hardest natural substance on Earth", "In which year did the Titanic sink", "What is the currency of the United States?"};

		int answers[] = {2, 3, 3, 1, 2};

		int score = 0;

		System.out.println("Welcome to online quiz app");

		//loop to display question and option one by one
		for(int i=0; i<5; i++){
			System.out.println(questions[i]);
			if(i == 0){
				System.out.println("1. Marine Curie");
				System.out.println("2. Alexander Fleming");
				System.out.println("3. Isaac Newton");
			}

			if(i == 1){
				System.out.println("1. Seoul");
				System.out.println("2. Beijing");
				System.out.println("3. Tokyo");
			}
			
			if(i == 2){
				System.out.println("1. Quartz");
				System.out.println("2. Steel");
				System.out.println("3. Diamond");
			}

			if(i == 3){
				System.out.println("1. 1912");
				System.out.println("2. 1920");
				System.out.println("3. 1905");
			}
	
			if(i == 4){
				System.out.println("1. Euro");
				System.out.println("2. Dollar");
				System.out.println("3. Pound");
			}
 
			System.out.print("Choose the correct option: ");
			int ans = sc.nextInt();
			
			//switch to check answer and update score
			switch(ans){
				case 0:{
					if(ans == answers[i]){
						score++;
					}
					break;
				       }
				case 1:{
					if(ans == answers[i]){
						score++;
					}
					break;
				       }
				case 2:{
					if(ans == answers[i]){
						score++;
					}
					break;
				       }
				case 3:{
					if(ans == answers[i]){
						score++;
					}
					break;
				       }
				case 4:{
					if(ans == answers[i]){
						score++;
					}
					break;
				       }
			}
		}
		
		//Printing score
		System.out.println("Your score is: " + score);

		sc.close();
	}
}
				
		