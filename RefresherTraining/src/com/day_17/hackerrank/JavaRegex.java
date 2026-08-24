package com.day_17.hackerrank;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		String regex = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(ip);
		
		if(matcher.find()) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
