/*16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements*/



public class DigitalWatchSimulation {
	public static void main(String[] args) {
	
		//Loop for hours
		for(int i=0; i<24; i++){
			for(int j=0; j<60; j++){
				if(i == 13 && j == 00){
					System.out.printf("%02d : %02d %s%n", i, j, "simulate power cut");
					System.exit(1);
				}
				else{
					System.out.printf("%02d : %02d%n", i, j);
				}
			}
		}
	}
}