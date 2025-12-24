/*4. Remove Duplicates from a String
Problem:
Write a Java program to remove all duplicate characters from a given string and return
the modified string.*/



import java.util.Scanner;

public class RemoveDuplicate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter String : ");
		String str = sc.nextLine();
		String modified = "";
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			boolean duplicate = false;
			for(int j=0; j<modified.length(); j++){
				if(ch == modified.charAt(j)){
					duplicate = true;
					break;
				}
			}
			if(!duplicate){
				modified += ch;
			}		
		}
		System.out.print(" String : " + str + "\n" + " Modified String : " + modified);
		
		sc.close();
	}
}
