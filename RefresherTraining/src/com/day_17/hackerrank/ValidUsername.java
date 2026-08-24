package com.day_17.hackerrank;
import java.util.*;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class ValidUsername {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(str.matches(UsernameValidator.regularExpression)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}
}
