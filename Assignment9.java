import java.util.Scanner;
class Complex{
	int r1, r2;
	int i1,i2;
	int sum1, sum2, product1, product2, sub1, sub2;
	Scanner sc = new Scanner(System.in);
	void real() {
		System.out.println("Enter real part of number 1");
		r1 = sc.nextInt();
		System.out.println("Enter real part of number 2");
		r2 = sc.nextInt();
		
	}
	void imaginary() {
		System.out.println("Enter imaginary part of number 1");
		i1 = sc.nextInt();
		System.out.println("Enter imaginary part of number 2");
		i2 = sc.nextInt();
	}
	void sum() {
		sum1 = r1 + r2;
		sum2 = i1 + i2;
		System.out.println("Sum of two complex number is " + sum1 + " + " +  (sum2 + "i"));
	}
	
	void sub() {
		sub1 = r1 - r2;
		sub2 = i1 - i2;
		System.out.println("Substraction of two complex number is " + sub1 + " + " +  (sub2 + "i"));
	}
	
	void product() {
		product1 = r1 * r2;
		product2 = i1 * i2;
		System.out.println("Multiplication of two complex number is " + product1 + " + " +  (product2 + "i"));
	}
}
class Employe{
	void print(String name, int joiningYear, int salary , String address) {
		System.out.println(name + "\t" + joiningYear + "\t\t" + salary + "\t" + address );
	}
}

class AddDistance{
	int i1=0, i2;
	int f1,f2;
	int sum1, sum2;
	Scanner sc = new Scanner(System.in);
	void inch() {
		System.out.println("Enter inch part of number ");
		i2 = sc.nextInt();
		i1 += i2;
		
	}
	void feet() {
		System.out.println("Enter feet part of number ");
		f2 = sc.nextInt();
		f1 += f2;
	
	}
	void sum() {
		sum1 = f1 ;
		sum2 = i1 ;
		System.out.println("Sum of two distance  is " + sum1 + " feet " +  (sum2 + " inch "));
	}
}
public class Assignment9 {

	public static void main(String[] args) {
		/*
		9.Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods 
		for each operation whose real and imaginary parts are entered by user. */
		Complex c = new Complex();
		c.real();
		c.imaginary();
		c.sum();
		c.sub();
		c.product();
		System.out.println();
		

	/*	10.Write a program that would print the information 
		(name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as
		 follows:

		Name        Year of joining        Address

		Robert            1994                64C- WallsStreat

		Sam                2000                68D- WallsStreat

		John                1999                26B- WallsStreat 
		*/
		System.out.println("Name \t" + "Joining Year \t" + "Salary \t" + "Address ");
		System.out.println();
		Employe e1 = new Employe();
		e1.print("Sonali", 2022, 25000, "bhandup west");
		System.out.println();
		e1.print("Rajedra", 2022, 20000, "kurla east");
		System.out.println();
		e1.print("Satyam", 2022, 22000, "thane west");
		System.out.println();
		
		

		/* 11.Add two distances in inch-feet by creating a class named 'AddDistance'.

		*/
		AddDistance a = new AddDistance();
		a.feet();
		a.inch();
		a.feet();
		a.inch();
		a.sum();
		System.out.println();
		


	}

}
