package MCA2;
import MCA.*;
import employee.*;

class Emppay{
	Emppay(){
		Emp e = new Emp();
		e.print();
	}
	
}

class CathcExercise{
	void print() {
		try {
			int arr[] = new int[5];
			arr[5] = 30/5;
		}
		catch(ArithmeticException a){
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException a1){
			System.out.println(a1);
		}
	}
	
}



public class PackagePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Write a Package MCA which has one class Student. Accept student detail through parameterized constructor. Write display ()
		  method to display details. Create a main class which will use package and calculate total marks and percentage.
		 */
		Student s = new Student("Sonali", 93, 90, 67, 86);
		s.display();
		System.out.println();
	/*
Write a Java program to perform employee payroll processing using packages. In the java file, Emp.java creates a package employee
 and creates a class Emp. Declare the variables name,empid, category, bpay, hra, da, npay, pf, grosspay, incometax, and allowance.
  Calculate the values in methods. Create another java file Emppay.java. Create an object e to call the methods to perform and print
   values.Test Data:Pass name as ANU, id as 23, category as Female and bpay as 12000.
	 */
		Emppay ep = new Emppay();
		System.out.println();
		
		/*
Write a java program using multiple catch blocks. Create a class CatchExercise inside the try block declare an array a[] and 
initialize with value a[5] =30/5; . In each catch block show Arithmetic exception and ArrayIndexOutOfBoundsException.

Test Data:

a[5] =30/5;

Expected Output :

ArrayIndexOutOfBoundsException occursRest of the code
		 */
		
		CathcExercise c = new CathcExercise();
		c.print();
		System.out.println();
		

	}

}
