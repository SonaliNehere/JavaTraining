

import java.util.Scanner;

public class Assignment6 {
	int pallindrome(String s) {
		int flag = 1;
		char ch[] = s.toCharArray();
		for(int i=0, j=ch.length-1; i<j; i++, j--) {
			if(ch[i]!=ch[j]) {
				flag = 0;
				break;
			}
		}
		if(flag==1)
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Assignment6 as = new Assignment6();
		System.out.println(as.pallindrome("mad"));
		
		/* 1.Write a program to check if a given string is a Palindrome.
		A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc. */
	/*	System.out.println("Enter a string ");
		String s1 = sc.nextLine();
		char ch[] = s1.toCharArray();
		int flag=0;
		for(int i=0,j=s1.length()-1; i<j; i++,j--) {
			if(ch[i] != ch[j]) {
				flag = 1;
				break;
			}
		}
		if(flag==0)
			System.out.println("String is pallindrome");
		else
			System.out.println("String is not pallindrome");
			*/
		
		
	/*	 2.Write a program to find out the largest and smallest word in the string "This is an umbrella". */
		/*String str =  "This is an umbrella";
		String ch[] = str.split("\\s");
		
		//String temp = new String();
		String min = new String(ch[0]);
		String max = new String(ch[0]);
		
		for(int i=0; i<=ch.length-2;i++) {
			for(int j=i+1; j<=ch.length-1; j++) {
				String a = ch[i];
				String b = ch[j];
				if(a.compareTo(max) > 0 ) {
					max = a;
					
				}
				if(a.compareTo(min) < 0 ) {
					min = b;
					
				}
			}
		} 
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		int large = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE;
		String minString = new String();
		String maxString = new String();
		for(int i=0; i<=ch.length-1;i++) {
			if(ch[i].length() > large) {
				large = ch[i].length();
				maxString = ch[i];
				
			}
			if(ch[i].length() < small) {
				small = ch[i].length();
				minString = ch[i];
				
			}
		} 
		System.out.println("max length = " + maxString);
		System.out.println("min length = " + minString);
		*/
		
		
	/*	3.Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order. */
		/*String ch[] = new String[10];
		for(int i=0; i<10; i++) {
			System.out.println("Enter element");
			ch[i] =  sc.nextLine();
		}
		String temp = new String();
		for(int i=0; i<9;i++) {
			for(int j=i+1; j<10; j++) {
				String a = ch[i];
				String b = ch[j];
				if(a.compareTo(b) > 0 ) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		} 
		System.out.println("Sorted strings are :");
		for(int i=0; i<10; i++) {
			System.out.println(ch[i]);
			
		} */
		
		
	/*	4.Write a program to check if the two strings entered by user are anagrams or not. Two words are said to be anagrams if the
		 letters of one word can be rearranged to form the other word. For example, jaxa and ajax are anagrams of each other. */
		/* not work for all
		 System.out.println("Enter string ");
		String str1 = sc.nextLine();
		System.out.println("Enter string ");
		String str2 = sc.nextLine();
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		int flag=0;
		
		for(int i=0; i<=ch1.length-1; i++) {
			flag = 0;
			for(int j=0; j<=ch2.length-1; j++) {
				if(ch1[i] == ch2[j]) {
					flag = 1;
					break;
					
				}
			}
			if(flag == 0) {
				System.out.println("Not anangram");
				break;
			}
					
			
		}
		if(flag ==1 ) {
			System.out.println("anangram");
		} */
		
		/*System.out.println("Enter string");
		String perry = sc.nextLine();
		
		char arr[] = perry.toCharArray();
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//int length = 10;
		char visit[] = new char[arr.length];
		int count[] = new int[arr.length];
		int flag=0;
		int b;
		int c=0;
		int index=0 ;
		
		for(int i=0; i<=arr.length-1;i++) {
			c=0;
			for(b=0;b<=visit.length-1;b++) {
				if(arr[i] == visit[b]) {
					flag = 1;
				}
				
			}
			if(flag == 0) {
				visit[index] = arr[i];
				System.out.println("visit " + "[" + index + "]" + visit[index]);
				//index = index+1;
			
				for(int j=i; j<=arr.length-1; j++) {
				
					if(arr[i] == arr[j]) {
						c += 1;
					}
				}
				count[index] = c;
				System.out.println(arr[i] + " : " + c);
				
			}
			index = index+1;
			flag=0;
			
		}
		
		
		System.out.println("Enter string");
		String perry1 = sc.nextLine();
		
		char arr1[] = perry1.toCharArray();
		for(int i=0; i<arr1.length-1;i++) {
			for(int j=i+1; j<arr1.length; j++) {
				if(arr1[i]>arr1[j]) {
					char temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		//int length = 10;
		char visit1[] = new char[arr1.length];
		int count1[] = new int[arr1.length];
		int flag1=0;
		int b1;
		int c1=0;
		int index1=0 ;
		
		for(int i=0; i<=arr1.length-1;i++) {
			c1=0;
			for(b1=0;b1<=visit1.length-1;b1++) {
				if(arr1[i] == visit1[b1]) {
					flag1 = 1;
				}
				
			}
			if(flag1 == 0) {
				visit1[index1] = arr1[i];
				System.out.println("visit1 " + "[" + index1 + "]" + visit1[index1]);
				//index = index+1;
			
				for(int j=i; j<=arr1.length-1; j++) {
				
					if(arr1[i] == arr1[j]) {
						c1 += 1;
					}
				}
				count1[index1] = c1;
				System.out.println(arr1[i] + " : " + c1);
				
			}
			index1 = index1+1;
			flag1=0;
			
		}
		int f=0;
		for(int i=0; i<=count.length-1; i++) {
			if(count[i] != count1[i]) {
				System.out.println("Not anagram");
				f=1;
				break;
			}
			
			
		}
		if(f==0) {
			System.out.println("Anagram");
		}
		*/
		
	/*5.Input a string which contains some palindrome substrings. Find out the position of palindrome substrings if exist and replace
		  it by *. (For example if input string is “bob has a radar plane” then it should convert in “*** has a ***** plane”. */
		System.out.println("Enter string ");
		String str = sc.nextLine();
		char c[] = str.toCharArray();
		/*for(int i=0; i<=c.length-2; i++) {
			for(int j=i+1; j<=c.length; j++) {
				String s1 = new String();
				s1 = s1.substring(i, j+1);
				int k = as.pallindrome(s1);
				if(k==1) {
					System.out.println(s1);
				}
			}
		} */
		int p;
		String sub = new String();
		for(int i=0; i<=c.length-2; i++) {
			//String s1 = new String();
				p = i+1;
				while(p<=c.length) {
					sub = str.substring(i, p+1);
					int k = as.pallindrome(sub);
					if(k==1) {
						System.out.println(sub);
					}
					p++;
					
				}
		}
		
		
		
		
	/*	  6.Write a program to replace a given substring in a sentence with another string. For example, in the sentence, 
	 ”  A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”. */
		/*System.out.println("Enter string ");
		String str = sc.nextLine();
		System.out.println("Enter substring which will replace");
		String s2 = sc.nextLine();
		System.out.println("Enter substring will replace by ");
		String s3  = sc.nextLine();
		System.out.println( str.replaceAll(s2, s3)); */
		
	/*	   7.Write a program to reverse individual words in a string, where each word may be delimited by a dot, comma, space or
	   tab, like www.google.com should become www.elgoog.moc. */
	/*	System.out.println("Enter a string ");
		String s = sc.nextLine();
		String ch[] = s.split("\\.");
		for(String sr : ch) {
			System.out.println(sr);
		}
		String ans[] = new String[3];
		String result = new String();
	for(String si : ch) {
		int p=0;
			char c[] = si.toCharArray();
			for(int i=0,j=c.length-1; i<j; i++, j--) {
				char temp = c[i];
				c[i] = c[j];
				c[j] = temp;
			}
			ans[p] = String.valueOf(c);
			if(p==ch.length-1)
				result +=  ans[p];
			else if(p>=0 && p<=ch.length-2)
				result = result + ans[p] + ".";
			//System.out.println(ans[p]);
			p++;
		}
	System.out.println(result); */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
