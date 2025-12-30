/*9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.*/


import java.util.Scanner;

public class SchoolBusAttendanceSystem{
	public static void main(String[] args){
		//Variable declaration and initialization
		Scanner sc = new Scanner(System.in);
		int totalPresent = 0, totalAbsent = 0;
		String students[] = {"Raj","Rudra","Sachin","Abhiskek","Krishna","Soumya","Rishi","Yogesh","Suraj","Shravan"};
		String p = "present";

		//Foe-each loop to check weather student is present or absent
		for(String student : students){
			System.out.println(student + " is Present or Absent");
			String check = sc.next().trim().toLowerCase();
			if(check.equals(p)){
				totalPresent++;
			}
			else{
				totalAbsent++;
			}
		}
		
		//Display total present and absent student
		System.out.println("Number of present student is: " + totalPresent);
		System.out.println("Number of absent student is: " + totalAbsent);

		sc.close();
	}
}