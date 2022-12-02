class Parent{
	void print1() {
		System.out.println("This is parent class ");
	}
}
class Child extends Parent{
	void print() {
		System.out.println("This is child class ");
	}
}

class Member{
	String name;
	int age;
	long phoneNo;
	String address;
	int salary;
	
}
class Employeee extends Member{
	String specialization;
	void printName(String nm) {
		name = nm;
		System.out.println("Name of an employee is " + name);
	}
	void printAge(int a) {
		age = a;
		System.out.println("Age of an employee is " + age);
	}
	void printPhoneNo(long no) {
		phoneNo = no;
		System.out.println("Phone number of an employee is " + phoneNo);
	}
	void printAddress(String adr) {
		address = adr;
		System.out.println("Address of an employee is " + address);
	}
	void printSalary(int sal){
		salary = sal;
		System.out.println("Salary of an employee is "+ salary );
	}
	void printSpecialization(String spe) {
		specialization = spe;
		System.out.println("Specialization of an employee is "+ specialization );
	}
}
class Manager extends Member{
	String department;
	void printName(String nm) {
		name = nm;
		System.out.println("Name of the manager is " + name);
	}
	void printAge(int a) {
		age = a;
		System.out.println("Age of the manager is " + age);
	}
	void printPhoneNo(long no) {
		phoneNo = no;
		System.out.println("Phone number of the manager  is " + phoneNo);
	}
	void printAddress(String adr) {
		address = adr;
		System.out.println("Address of the manager " + address);
	}
	void printSalary(int sal){
		salary = sal;
		System.out.println("Salary of the manager  is "+ salary );
	}
	void printDepartment(String dep) {
		department = dep;
		System.out.println("Department of the manager is "+ department );
	}
}

class Reactangl{
	int length;
	int breadth;
	Reactangl(int l, int b){
		length =l;
		breadth = b;
		area(length, breadth);
		perimeter(length, breadth);
	}
	void area(int l, int b) {
		if(l == b)
			System.out.println("Area of square is " + (l*b));
		else 
			System.out.println("Area of reactangle is " + (l*b));
	}
	void perimeter(int l, int b) {
		if(l == b)
			System.out.println("Perimeter of square is " + (l+b+l+b));
		else
			System.out.println("Perimeter of reactangle is " + (l+b+l+b));
	}
}
class Squar extends Reactangl{
	
	Squar(int a){
		this(a, a);
	}
	Squar(int s1, int s2){
		super(s1, s2);
	}
}

class Shape{
	void print() {
		System.out.println("This is a shape ");
	}
}
class Circle extends Shape{
	void cPrint() {
		System.out.println("This is circular shape ");
	}
}
class Rect extends Shape{
	void rPrint() {
		System.out.println("This is reactangular shape ");
	}
}
class Squr extends Rect{
	void sPrint() {
		System.out.println("Square is a reactangle ");
	}
}

class AA{
	void print() {
		System.out.println("I am in class A ");
	}
}
class BB{
	void print() {
		System.out.println("I am in class B ");
	}
}
class CC{
	void print() {
		System.out.println("I am in class C ");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child 
class". Now, create an object for each of the class and call

1 - method of parent class by object of parent class

2 - method of child class by object of child class

3 - method of parent class by object of child class  */
		
		Parent p = new Parent();
		p.print1();
		Child c = new Child();
		c.print();
		c.print1();
		System.out.println();

/* 2.In the above example, declare the method of the parent class as private and then repeat the first two operations  */
		
		//this will give error as methods are private 
		
/* 
Create a class named 'Member' having the following members:Data members 
1- Name 2-Age 3-Phone number 4-Address 5-Salary
It also has a method named 'printSalary' which prints the salary of the members.Two classes 'Employee' and 'Manager' inherits 
the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
 Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these 
 classes and print the same. */
		Member m = new Member();
		Employeee e = new Employeee();
		System.out.println("Employee details are ");
		e.printName("Sonali Nehere");
		e.printAge(21);
		e.printPhoneNo(1234567890);
		e.printAddress("bhandup west ");
		e.printSalary(30000);
		e.printSpecialization("java");
		System.out.println();
		
		Manager mr = new Manager();
		System.out.println("Manager details are ");
		mr.printName("Charu Singh");
		mr.printAge(30);
		mr.printPhoneNo(1234567890);
		mr.printAddress("ghansoli west ");
		mr.printSalary(35000);
		mr.printDepartment("Technical");
		System.out.println();
		
		/*
		Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area
		 and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to 
		 initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor
		  having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. 
		  Print the area and perimeter of a rectangle and a square.
		 */
		Reactangl r = new Reactangl(10, 5);
		Squar sa = new Squar(5);
		
		/* Now repeat the above example to print the area of 10 squares. */
		Squar s1 = new Squar(2);
		Squar s2 = new Squar(3);
		Squar s3 = new Squar(12);
		Squar s4 = new Squar(6);
		Squar s5 = new Squar(20);
		Squar s6 = new Squar(75);
		Squar s7 = new Squar(25);
		Squar s8 = new Squar(0);
		Squar s9 = new Squar(9);
		Squar s10 = new Squar(50);
		System.out.println();
		
		/*
		 Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes named
		  'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and 
		  "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square
		   is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
		 */
		Squr s = new Squr();
		s.print();
		s.rPrint();
		System.out.println();
		
		/* 
		Create a class with main method. Create an object for each class A, B and C in main method and call every method of 
		each class using its own object/instance. */
		AA a = new AA();
		BB b = new BB();
		CC cr = new CC();
		a.print();
		b.print();
		cr.print();
		System.out.println();
		
	}

}
