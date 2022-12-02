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
public class StringAssignments {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//different ways of creating string
		String st = "Reliance";
		String sy = new String(" Jio");
		System.out.println(st);
		System.out.println(sy);
		
		
		String s1 = "I am Sonali";
		//1. concatenate 
		String str = "Sonali" + " Nehere";
		System.out.println("Contenation using + is  = " + str);
		
		//2. length
		System.out.println("length of str is " + str.length());
		
		//3. extract substring
		String sub = str.substring(7, 12);
		System.out.println("Substring of str is " + sub);
		
		//4. search using indexOf methond
		System.out.println("Index of am in s1 is " + s1.indexOf("am"));
		
		//5. matching a  string againt regular expression with matches
		System.out.println("match againt regular expression " + s1.matches("(.*)am(.*)"));
		
		//6. compare using equals
		System.out.println("s1 and rani are equal is " + s1.equals("rani"));
		
		//7. equalsIgnore case , startsWith , endsWith, compareTo
		String s2 = "i am sonali";
		System.out.println("s1 and s2 are equals with ignoring case is " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 starts with 'I ' is " +  s1.startsWith("I "));
		System.out.println("s1 ends with 'a' is " +  s1.endsWith("a"));
		System.out.println("Difference in both string is " + "sonali".compareTo("sOnali"));
		
		//8.trim method
		String s3 = " Hey Buddy ";
		System.out.println("s3 after trim is " + s3.trim());
		
		//9. replace method
		System.out.println("Replace e with o in str is " + str.replace("e", "o"));
		
		//10. split string using split
		System.out.println("Split s1 using split method");
		String words[] = s1.split("\\s");
		for(String s : words) {
			System.out.println(s);
		}
		
		String s4 = "Javatpointt";
		System.out.println("Split s using split method"); 
		String words1[] = s4.split("t");
		for(String s : words1) {
			System.out.println(s);
		}
				
		
		
		//11. numbers into string
		int i = 10;
		System.out.println("Convert number into string " + String.valueOf(i));
		
		//12. interger object into string
		System.out.println("Integer object into string is " + Integer.toString(123));
		
		//13. uppercase lowercase
		System.out.println("s1 into uppercase " + s1.toUpperCase());
		System.out.println("s1 into lowercase " + s1.toLowerCase());
		
		System.out.println("*****************************************************************************************");
//1. Write a program to print a string entered by user.
		/*System.out.println("Enter string");
		String sw = sc.nextLine();
		System.out.println(sw); */

//2. Write a program to input and display the sentence I love candies.
		/*System.out.println("Enter string");
		String sing = sc.nextLine();
		System.out.println(sing); */
		
		
//3. Write a program to find the length of the string "refrigerator".
	/*	String si = "refrigerator";
		System.out.println("Length of refrigerator is " + si.length()); */
		
//4. Write a program to check if the letter 'e' is present in the word 'Umbrella'.
		/*System.out.println("e contains in Umbrella is " + "Umbrella".contains("e")); */
		
//5. Write a program to check if the word 'orange' is present in the "This is orange juice".
		/*System.out.println("This is orange juice contains orange is " + "This is orange juice".contains("orange")); */
		
//6.Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".
		/*System.out.println("first occurence of o in string is " + "Hello, World".indexOf("o"));
		System.out.println("last occurence of o in string is " + "Hello, World".lastIndexOf("o"));
		System.out.println("first occurence of , in string is " + "Hello, World".indexOf(","));
		System.out.println("last occurence of , in string is " + "Hello, World".lastIndexOf(",")); */

//7.Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is. For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.
		/*String name = new String("Sonali Sopan Nehere");
		String ans = new String();
		name = " " + name;
		int spacecount = 0;
		for(int j = 0; j<name.length(); j++) {
			char p = name.charAt(j);
			if(Character.isSpace(name.charAt(j))) {
				spacecount += 1;
				if(spacecount <=2) {
					ans = ans + (name.charAt((j+1))+".") ;
				}
				else {
					ans = ans + name.substring(j);
				}
				
			}
			else {
				continue;
			}
			
			
		}
		System.out.println(ans); */
		
//8.Write a program to find the number of vowels, consonents, digits and white space characters in a string.
	/*	int v = 0, c = 0, d = 0, space = 0;
		char ch[] = s1.toUpperCase().toCharArray();
		for(char k  : ch) {
			if(k == 'A' || k =='E' || k=='I' || k=='O' || k=='U') {
				v+=1;
			}
			else if(Character.isDigit(k)) {
				d+=1;
			}
			else if(Character.isSpace(k)) {
				space+=1;
			}
			else {
				c+=1;
			}
		}
		System.out.println("vovels = " + v);
		System.out.println("consonants = " + c);
		System.out.println("digits = " + d);
		System.out.println("spaces = " + space);  */
//9.Write a program to delete all consonents from the string "Hello, have a good day".
		/*String abc = "Hello, have a good day".toUpperCase();
		String sd = new String(abc);
		String result = new String();
		for(int j = 0; j<sd.length(); j++) {
			char p = sd.charAt(j);
			if((Character.isDigit(p) || Character.isSpace(p) || p == 'A' || p =='E' || p=='I' || p=='O' || p=='U') == false) {
				result = result + p;
			}
			
		}
		System.out.println("After removing consonants " + result); */
		
//10. Input a string of alphabets. Find out the number of occurrence of all alphabets in that string. Find out the alphabet with maximum occurrence.
		System.out.println("Enter string");
		String perry = sc.nextLine();
		
		char arr[] = perry.toCharArray();
		int length = 10;
		char visit[] = new char[length];
		int flag=0;
		int b;
		int c=0;
		int index=0 ;
		for(i=0; i<=arr.length-1;i++) {
			c=0;
			for(b=0;b<=visit.length-1;b++) {
				if(arr[i] == visit[b]) {
					flag = 1;
				}
				
			}
			if(flag == 0) {
				visit[index] = arr[i];
				System.out.println("visit " + "[" + index + "]" + visit[index]);
				index = index+1;
			
				for(int j=i; j<=arr.length-1; j++) {
				
					if(arr[i] == arr[j]) {
						c += 1;
					}
				}
				System.out.println(arr[i] + " : " + c);
				
			}
			flag=0;
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}