/*6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.*/


import java.util.*;

public class ParkingLotGateSystem{
	public static void main(String[] args){
		
		//Variable declaration
		Scanner sc = new Scanner(System.in);
		int area = 20;
		int occupied = 0;
		
		//loop and switch to check condition 
		while(occupied < area){
			System.out.println("What do you want : Park(1) || Exit(2) || Check Occupancy(3) || Quit(4)");
			int option = sc.nextInt();
			
			if(option == 4){
				System.exit(1);	
			}		

			switch(option){
			case 1: if(occupied < area){
					System.out.println("Space is left you can park the vehicle");
					occupied++;
				}
					break; 
			case 2: if(area - occupied > 0){
					System.out.println("You will exit your vehicle");
					occupied--;
				}
					break; 
			case 3: System.out.println("Unoccupied places: " + (area - occupied));
				System.out.println("Occupied places: " + occupied);
				break;  
			}
		}
		System.out.println("No space is left to park");
		
		sc.close();
	}
}