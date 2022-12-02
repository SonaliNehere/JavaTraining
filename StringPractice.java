/*
 1. Different ways creating a string
 
Concatenating two strings using + operator
 

Finding the length of the string
 

Extract a string using Substring
 

Searching in strings using indexOf()
 

Matching a String Against a Regular Expression With matches()
 

Comparing strings using the methods equals(),
 

equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
 

Trimming strings with trim()
 

Replacing characters in strings with replace()
 

Splitting strings with split()
 

Converting Numbers to Strings with valueOf()
 

Converting integer objects to Strings
 

Converting to uppercase and lowercase
 */

import java.util.Scanner;
public class StringPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str);
		String s1 = "I am Sonali";
		System.out.println(s1.charAt(5));
		System.out.println(s1.compareTo("I am"));
		System.out.println(s1.concat(" I am an Engineer "));
		System.out.println(s1.contains("aa"));
		System.out.println(s1.endsWith("ali"));
		System.out.println(s1.startsWith("I"));
		System.out.println(s1.indexOf("So"));
		System.out.println(s1.isEmpty());
		System.out.println("".isEmpty());
		System.out.println(String.join("-", "Sonali", "Sopan", "Nehere"));
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.length());
		System.out.println(s1.replace("So", "mo"));
		System.out.println(s1.replaceAll("a", "p"));
		System.out.println(s1.substring(0, 4));
		System.out.println(s1.substring(5));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		char ch[] = s1.toCharArray();
		for(char c : ch) {
			System.out.print(c + "/");
		}
		System.out.println();
		System.out.println(String.valueOf(100) + "78"); //anything into string
		System.out.println(" KGF ".trim() + "23");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}