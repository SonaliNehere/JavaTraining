import java.util.Scanner;
import java.lang.Math;
class Area{
	int l,b;
	void setDim() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length ");
		l = sc.nextInt();
		System.out.println("Enter breadth ");
		b = sc.nextInt();
		getArea();
	}
	void getArea() {
		System.out.println("area of reactangle is " + (l*b));
	}
	
	
}

class Student1{
	String name;
	int rollno;
	long phoneno;
	String address;
	Student1(String sName, int sRollno){
		name = sName;
		rollno = sRollno;
		System.out.println("name is " + name + " roll no. is " + rollno);
	}
	
	Student1(int sRollno, long sPhoneno, String sAddress){
		rollno = sRollno;
		phoneno = sPhoneno;
		address = sAddress;
		System.out.println("roll no is " + rollno + " phone no is " + phoneno + " address is " + address );
	}
}

class Triangle{
	int a = 3;
	int b = 4;
	int c = 5;
	Triangle(){
		double s =( a+b+c)/2;
		double area = s*(s-a)*(s-b)*(s-c);
		area = Math.sqrt(area);
		System.out.println("Area of triangle is " + area);
		System.out.println("Perimeter of triangle is " + (a+b+c));
	}
	
	Triangle(int a, int b, int c){
		double s =( a+b+c)/2;
		double area = s*(s-a)*(s-b)*(s-c);
		area = Math.sqrt(area);
		System.out.println("Area of triangle is " + area);
		System.out.println("Perimeter of triangle is " + (a+b+c));
	}
}

class Reactangle{
	int l, b;
	Reactangle(int length, int breadth){
		l = length;
		b = breadth;
		area();
	}
	void area() {
		System.out.println("Area of reactangle is " + (l*b));
		System.out.println("Perimeter of reactangle is " + (l+b));
	}
}

class AreaReactangle{
	int l, b;
	
	AreaReactangle(int length, int breadth){
		l = length;
		b = breadth;
		returnArea();
	}
	void returnArea() {
		System.out.println("Area of reactangle is " + (l*b));
	}
}

class Average{
	void print(int a, int b, int c){
		System.out.println("Average is " + (a+b+c)/3);
		
	}
}
public class Assignment8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* 1.Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method 
		  named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns
		 the area of the rectangle. Length and breadth of rectangle are entered through keyboard. */
		Area a = new Area();
		a.setDim();
		System.out.println();
		
		/* 2.Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of
		  roll_no as '2' and that of name as "John" by creating an object of the class Student. */
		Student1 s = new Student1("John", 2);
		System.out.println();
		
		/* 3.Assign and print the roll number, phone number and address of two students having names "Sam" and "John"
   respectively by creating two objects of class 'Student'. */
		Student1 s1 = new Student1(67, 1104623000, "bhandup west ");
		Student1 s2 = new Student1(70, 1234567890, "Palghar");
		System.out.println();
		
		/* 4.Write a program to print the area and perimeter of a triangle
    having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor. */
		Triangle t = new Triangle();
		System.out.println();
		
		/*   5.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a
		   class named 'Triangle' with constructor having the three sides as its parameters. */
		Triangle t1 = new Triangle(3,4,5);
		System.out.println();
		
		/*   6.Write a program to print the area 
		   of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method 
		   named 'Area' which returns the area and length and breadth passed as parameters to its constructor.
 			star 1  */
		Reactangle r = new Reactangle(4, 5);
		Reactangle r1 = new Reactangle(5, 8);
		//r.area();
	//	r1.area();
		System.out.println();
		
		/* 7.Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its
		 length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area 
		 of the rectangle. Length and breadth of rectangle are entered through keyboard. */
		
		System.out.println("Enter length ");
		int length = sc.nextInt();
		System.out.println("Enter breadth ");
		int breadth = sc.nextInt();
		AreaReactangle are = new AreaReactangle(length , breadth);
		System.out.println();
		
		
		
		
		/*  8.Print the average of three numbers entered by user by creating a class named 'Average' having a method to 
		calculate and print the average. */
		Average ar = new Average();
		ar.print(5, 5, 5);

		 

	}

}
