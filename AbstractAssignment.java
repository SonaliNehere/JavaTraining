abstract class Bankk{
	abstract void getBalance();
}
class BankA extends Bankk{
	int i = 100;
	void getBalance() {
		System.out.println("Balance in Bank A is " + i + " dollars ");
	}
}
class BankB extends Bankk{
	int i = 150;
	void getBalance() {
		System.out.println("Balance in Bank A is " + i + " dollars ");
	}
}
class BankC extends Bankk {
	int i = 200;
	void getBalance() {
		System.out.println("Balance in Bank A is " + i + " dollars ");
	}
}
class Office{
	void permit(Bankk ref) {
		ref.getBalance();
	}
}

abstract class Marks{
	abstract void getPercentage();
}
class StudentA extends Marks{
	double a1, b1, c1, sum, percentage ;
	StudentA(double a, double b, double c){
		a1 = a;
		b1 = b;
		c1 = c;
	}
	void getPercentage() {
		sum = a1 + b1 + c1;
		percentage  = (sum*100)/300;
		System.out.println("Percentage of the student A is  " + percentage  );
	}
}
class StudentB extends Marks{
	double a1, b1, c1, d1, sum ,  percentage ;
	StudentB(double a, double b, double c, double d){
		a1 = a;
		b1 = b;
		c1 = c;
		d1 = d;
	}
	void getPercentage() {
		sum = a1 + b1 + c1 + d1;
		percentage  = (sum*100)/400;
		System.out.println("Percentage of the student B is  " + percentage  );
	}
}
class Marksheet{
	void permit(Marks ref) {
		ref.getPercentage();
	}
}

abstract class AbstractClass{
	abstract void a_method();
	
	void normal() {
		System.out.println("This is the normal method of the abstract class ");
	}
	AbstractClass(){
		System.out.println("This is the constructor of the abstract class ");
	}
}
class Subclass extends AbstractClass{
	void a_method() {
		System.out.println("This is the abstract method of the abstract class ");
	}
}

abstract class AnimalForest{
	abstract void cats();
	abstract void dogs();
}
class Catt extends AnimalForest{
	void cats() {
		System.out.println("Cat meow ");
	}
	void dogs() {
		
	}
}
class Dogg extends AnimalForest{
	void dogs() {
		System.out.println("Dogs barks ");
	}
	void cats() {
		
	}
}

abstract class Shaped{
	abstract void reactangleArea(int l, int b);
	abstract void squareArea(int s);
	abstract void circleArea(int r);
	double area;
	
}
class Areaa extends Shaped{
	
	void reactangleArea(int l, int b) {
		area = l*b;
		System.out.println("Area of the reactangle is " + area );
	}
	void squareArea(int s) {
		area = s*s;
		System.out.println("Area of the square is " + area );
	}
	void circleArea(int r) {
		area = 3.14 * r * r;
		System.out.println("Area of the circle is " + area );
	}
	
}
class Geometry1{
	void permit(Shaped ref) {
		ref.reactangleArea(20,30);
		ref.squareArea(45);
		ref.circleArea(25);
	}
	void permit1(Shaped ref) {
		ref.reactangleArea(9, 10);
		ref.squareArea(4);
		ref.circleArea(2);
		ref.reactangleArea(2, 3);
		ref.squareArea(6);
		ref.circleArea(10);
		ref.reactangleArea(11, 12);
		ref.squareArea(14);
		ref.circleArea(12);
		ref.reactangleArea(99, 10);
		ref.squareArea(40);
		ref.circleArea(22);
		ref.circleArea(100);
	}
}

abstract class ClassAbstract{
	abstract void a_method();
	void n_method() {
		System.out.println("This is the normal method of an abstract class ");
	}
}
class ClassSub extends ClassAbstract{
	void a_method() {
		System.out.println("This is an abstract method of an abstract class ");
	}
	
	//2. 
	// ClassAbstract c = new ClassAbstract();
	// c.n_method();
	
	//3. 
	// ClassSub cl = new ClassSub();
// 	c1.a_method();
	
	//4. 
	// ClassSub c2 = new ClassSub();
  //   c2.n_method();
}
public class AbstractAssignment extends ClassAbstract{
	
	void a_method() {
		System.out.println("This is an abstract method of an abstract class ");
	}
	
	//2. 
	//ClassAbstract c = new ClassAbstract();
	// c.n_method(); 
	
	//3. 
	void abc() {
		AbstractAssignment a1 = new AbstractAssignment();
		 a1.a_method();
	}
	 
	
	//4. 
	void abc1() {
		AbstractAssignment a2 = new AbstractAssignment();
		a2.n_method();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	2. Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B 
	and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. 
	Call this method by creating an object of each of the three classes.
	*/
		Office o = new Office();
		BankA b1 = new BankA();
		BankB b2 = new BankB();
		BankC b3 = new BankC();
		o.permit(b1);
		o.permit(b2);
		o.permit(b3);
		System.out.println();
		
		/* 3.
We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects
 (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by
  two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students.
   The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as 
   its parameters for student B. Create an object for each of the two classes and print the percentage of marks for both the
    students.
*/
		StudentA s1 = new StudentA(80, 80, 80 );
		StudentB s2 = new StudentB(70, 70, 70, 70 );
		Marksheet m = new Marksheet();
		m.permit(s1);
		m.permit(s2);
		System.out.println();
		
		/* 4.
An abstract class has a construtor which prints "This is constructor of abstract class", an abstract method named 'a_method'
 and a non-abstract method which prints "This is a normal method of abstract class". A class 'SubClass' inherits the abstract
  class and has a method named 'a_method' which prints "This is abstract method". Now create an object of 'SubClass' and call 
  the abstract method and the non-abstract method. (Analyse the result)
*/
		Subclass s = new Subclass();
		s.a_method();
		s.normal();
		System.out.println();
		
		
		/*5.
Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a class 'Cats' with a method 'cats'
 which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'.
  Now create an object for each of the subclasses and call their respective methods.
 */
		Catt c = new Catt();
		Dogg d = new Dogg();
		c.cats();
		d.dogs();
		System.out.println();
		
/*6. We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract
   methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
   parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its
    radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea'
    for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the 
    three methods.  */    
		Areaa ar = new Areaa();
		/* ar.reactangleArea(5, 9);
		ar.squareArea(8);
		ar.circleArea(6); */
		Geometry1 g = new Geometry1();
		g.permit(ar);
		System.out.println();
					
		
 /*    7.Repeat the above question for 4 rectangles, 4 squares and 5 circles.  */
		Geometry1 g1 = new Geometry1();
		g1.permit1(ar);
		System.out.println();
		
	/* 
1. Create an abstract class with abstract and non-abstract methods.  */
		// done
		
 /* 2. Create a sub class for an abstract class. Create an object in the child class for the abstract class and access the
 non-abstract methods  */
		//error
		
/*  3. Create an instance for the child class in child class and call abstract methods  */
		// error
		
		AbstractAssignment aa1 = new AbstractAssignment();
		aa1.abc();
		
		
		 ClassSub cs = new ClassSub();
		 	cs.a_method();
		 	System.out.println();
			
			
			
		
 /* 4. Create an instance for the child class in child class and call non-abstract methods  */
		
		 	
		 	AbstractAssignment aa2 = new AbstractAssignment();
			aa2.abc1();
			
		 	ClassSub c2 = new ClassSub();
		    c2.n_method();
		    System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
					
	}

}
