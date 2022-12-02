import java.util.*;
import java.lang.Math;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//check square or not
		System.out.println("enter length and breadth");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==b)
			System.out.println("Its a square");
		else
			System.out.println("Its not a square");
		System.out.println(); 
		
		//print grater value
		System.out.println("Enter two values");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x>=y)
			System.out.println("Greater no. is " + x);
		else
			System.out.println("Greater no. is " + y);
		System.out.println(); 
		
		//find value from discount
		System.out.println("Enter quantity");
		int r = sc.nextInt();
		if(r>=1000)
			System.out.println("total cost is " + (r - (10*r/100)));
		else
			System.out.println("total cost is " + r);
		System.out.println(); 
		
		// find bonus from salary
		System.out.println("Enter salary");
		int sal = sc.nextInt();
		System.out.println("Enter year of service");
		int yr = sc.nextInt();
		if(yr > 5)
			System.out.println("net bonus is " + (5*sal/100));
		else
			System.out.println("No bonus");
		System.out.println(); 
		
		//print grade from marks
		System.out.println("Enter marks ");
		int marks = sc.nextInt();
		if(marks < 25) {
			System.out.println("Grade F");
		}
		else if(marks >=25 && marks<45){
			System.out.println("Grade E");
		}
		else if(marks >=45 && marks<50){
			System.out.println("Grade D");
		}
		else if(marks >=50 && marks<60){
			System.out.println("Grade C");
		}
		else if(marks >=60 && marks<80){
			System.out.println("Grade B");
		}
		else if(marks >=80 ){
			System.out.println("Grade A");
		}
		System.out.println(); 
		
		//find greatest age from 3 people
		System.out.println("Enter age of three people");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=1; i<=3;i++){
			int A = sc.nextInt();
			if(A>max)
				max = A;
				
			if(A<min)
				min = A;
				
				
		}
		System.out.println("oldest age is " + max);
		System.out.println("youngest age is " + min);
		System.out.println(); 
		
		//find absolute value
		System.out.println("Enter value");
		int num = sc.nextInt();
		System.out.println("Absolute value of " + num + " is " + Math.abs(num));
		System.out.println(); 
		
		//find allowance for exam from attendence
		System.out.println("Enter classes held");
		int ch1 = sc.nextInt();
		System.out.println("Enter classes attended");
		int ch2 = sc.nextInt();
		if((ch2*100/ch1) >= 75)
			System.out.println("Allow for exam");
		else
			System.out.println("Not allow for exam");
		System.out.println(); 
		
		//allow if  medical cause
		System.out.println("Do you have medical cause");
		char ch = sc.next().charAt(0);
		if(ch == 'Y' || ch == 'y') {
			System.out.println("Allow");
		}
		else
			System.out.println("Not allow");
		System.out.println(); 
		
		//find values of expression 
		int X = 2;
		int Y = 5;
		int Z = 0;
		System.out.println(X==2);
		System.out.println(X!=5);
		System.out.println(X!=5 && Y>=5);
		System.out.println(Z!=0 || X==2);
		System.out.println(!(Y<10));
		
		//find lowercase or uppercase
		System.out.println("Enter character");
		char u = sc.next().charAt(0);
		int ui = (int)u;
		if(ui>=65 && ui<=90)
			System.out.println("Uppercase");
		else
			if(ui>=97 && ui<=122)
				System.out.println("Lowercase");
		else
			System.out.println("Wrong input");
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
