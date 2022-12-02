import java.io.*;

import java.lang.reflect.*;

/*import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;*/

import java.util.*;
//import org.testing.annotations.Test;
class Demo1{
	 void fun1() throws ArithmeticException{
		System.out.println("conn2 est");
		try {
			System.out.println(5/0);
		}
		finally {
			System.out.println("conn2 ter");
			
		}  
	 
	}
	 
	 final void print() {
		 System.out.println(" parent ");
	 }
	 
	 //3
	 void excp() throws IndexOutOfBoundsException{
		System.out.println("throws exception ");
		 //throw IndexOutOfBoundsException ;
	 }
	 
	 //5
	 void excp1() throws Exception{
		 try {
			int ar[] = new int[4]; 
			ar[-1] = 8;
		 }
		 catch(Exception e) {
			 System.out.println("Throw exception by your own " + e);
			throw e;
			
		 }
		 finally {
			 System.out.println("termination ");
		 }
	 }
}


class CreateException extends Exception{
	void getMsg() {
		System.out.println("You are exceeding weight ");
		
	}
}
class Airline{
	int weight;
	void check() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight ");
		weight = sc.nextInt();
		if(weight<=15) {
			System.out.println("Perfect");
		}
		else {
			CreateException c = new CreateException();
			c.getMsg();
			throw c;
		}
		
	}
}

public class ExceptionHandling extends Demo1{
	final int sum = 0;
	/* final void print() {
		System.out.println(" child ");
	} */
	
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("conn1 est");
		try {
			Demo1 d1 = new Demo1();
			d1.fun1();
			
			}
		catch(ArithmeticException e) {
			System.out.println("solve by main ");
		}
		System.out.println("conn1 ter"); 
		System.out.println();
		
		try {
			int arr[] = new int[5];
			arr[7] = 90;
		}
		catch(Exception e) {
			System.out.println("exception is : " + e);
		}
		finally {
			System.out.println("finally executed ");
		}
		System.out.println();
		
		ExceptionHandling e = new ExceptionHandling();
		System.out.println(e.sum);
		//e.sum = 90;
		System.out.println();
		
	/*
1. Write a program to generate Arithmetic Exception without exception handling 	 */
// int d =10/0;
 //System.out.println(d);

/*2. Handle the Arithmetic exception using try-catch block	 */
 try {
	 int a=10, b=0;
	 int c = a/b;
	 System.out.println(c);
 }
catch(ArithmeticException ae) {
	System.out.println("arithmetic exception handled ");
}
 System.out.println();
 
/*3. Write a method which throws exception, Call that method in main class without try block	 */
 Demo1 d2 = new Demo1();
	d2.excp();
	System.out.println();

/*4. Write a program with multiple catch blocks	 */
 try {
	int a[] = new int[8];
	a[9] = 12;
 }
catch(ArithmeticException ae) {
	System.out.println("ArithmeticException is handled ");
}
 catch(ArrayIndexOutOfBoundsException ie) {
	 System.out.println("ArrayIndexOutOfBoundsException is handled ");
 }
 catch(NullPointerException ne) {
	 System.out.println("NullPointerException is handled ");
 }
 catch(Exception ee) {
	 System.out.println("Exception is handled ");
 }
 System.out.println();
 
/*5. Write a program to throw exception with your own message	 */
 try {
	 Demo1 d3 = new Demo1();
		d3.excp1();
		System.out.println(); 
 }catch(Exception e1) {
	 System.out.println("Throw exception by your own " + e1);
 }
 
	System.out.println();

/*6. Write a program to create your own exception	 */
try {
	char[] c = new char[5];
	c[7] = 5;
	System.out.println(c[0]);
}
catch(Exception eee) {
	System.out.println("Array index exceed exception " );
}
System.out.println();
		 

/*1. Write a program with finally block  	 */
try {
	
}
catch(Exception e2) {
	
}
finally {
	System.out.println("With finally block ");
}
System.out.println();

/*2.Write a program to generate Arithmetic Exception	*/
try {
	 int a=10, b=0;
	 int c = a/b;
	 System.out.println(c);
}
catch(ArithmeticException ae) {
	System.out.println("arithmetic exception generated ");
}
System.out.println();
/*3.Write a program to generate ArrayIndexOutOfBoundException 	 */
try {
	 int a[] = new int[9];
	 a[10] = 200;
}
catch(ArrayIndexOutOfBoundsException ae) {
	System.out.println("array index out of bound  exception generated  ");
}
System.out.println();

/*4.Write a program to generate ClassNotFoundException 	 */
try {
	//Demand dd= new Demand();
	Class.forName("Demand");
}
catch(ClassNotFoundException ce) {
	System.out.println("class not found exception generated : " + ce);
}
System.out.println();

/*5.Write a program to generate FileNotFoundException 	 */
try {
	FileReader f = new FileReader("Test.txt");
	
}
catch(FileNotFoundException fe) {
	System.out.println("file not found exception generated : " + fe);
}
System.out.println();
/*6.Write a program to generate IOException	 */
try {
	FileReader f1 = new FileReader("Test.txt");
}
catch(IOException ie) {
	System.out.println("IO exception generated : " + ie);
}
System.out.println();

/*
1. Write a program to generate NoSuchFieldException  */
	try {
		
		String obj = new String();
		Class cls = obj.getClass();
		Field f = cls.getField("name");
	}
	catch(NoSuchFieldException ne) {
		System.out.println("no such field exception generated : " + ne);
	}
 System.out.println();



/*3.Write a program to generate NullPointerException */
	
 try {
	 Object ref = null;
	 ref.toString();
	
 }
 catch(NullPointerException ne){
	 System.out.println("null pointer exception generated " + ne);
 }
 System.out.println();

/*4.Write a program to generate NumberFormatException */
 try {
		
		 String str = null;
		 int i = Integer.valueOf(str);
	 }
	 catch(NumberFormatException ne){
		 System.out.println("number format exception generated " + ne);
	 }
 System.out.println();

/*5.Write a program to generate StringIndexOutOfBoundsException */
try {
		String s = new String("Sonali");
		System.out.println(s.charAt(30));
	}
	catch(StringIndexOutOfBoundsException se) {
		System.out.println("String Index Out Of Bounds Exception  generated : " + se);
	}
 System.out.println();

/*6.Write a program to generate SQLException */
/*  try {
	 DriverManager.registerDriver(new OracleDriver());
	 System.out.println("Driver loaded successfully ");
 }
 catch(SQLException e) {
	 e.printStackTrace();
 } */
	System.out.println();
	
 /*2.Write a program to generate NoSuchMethodException */
 try {
		Class c = Class.forName("java.lang.String");
		Class par[] = new Class[1];
		Method m = c.getDeclaredMethod("sampleMethod", par);
	}
	catch(NoSuchMethodException ne) {
 		System.out.println("no such method exception generated : " + ne);
 	}
	catch(ClassNotFoundException ce) {
		System.out.println("class not found exception generated : " + ce);
	}
  System.out.println();
	
  /*
   let’s say, you are working with an airline company
You are in the luggage check-in department and as per rules, you can allow 15kg per customer.
So now more than 15kg of weight is an abnormal condition for us or in other words its an exception
   */
	 try {
		 Airline ar = new Airline();
		 ar.check();
	 }
	 catch(Exception e4) {
		 System.out.println("exception occur " + e4);
		 System.exit(0);
	 }
	}

}
