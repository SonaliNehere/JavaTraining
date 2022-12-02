class PrintNumber{
	void printn(int i) {
		System.out.println(i);
	}
	void printn(float i) {
		System.out.println(i);
	}
	void printn(double i) {
	System.out.println(i);
	}
	void printn(char i) {
	System.out.println(i);
	}
	void printn(boolean i) {
	System.out.println(i);
	}
	void printn(String i) {
	System.out.println(i);
	}
	
	void printn(char i, int a) {
		System.out.println(i + " " + a);
		}
	void printn(int a, char i) {
		System.out.println(a + " " + i);
		}
	
	void Area(int side) {
		System.out.println("Area of square is " + side*side);
	}
	void Area(int l, int b) {
		System.out.println("Area of reactangle is " + l*b);
	}
}

class Studnt{
	String name;
	String address;
	int age;
	Studnt(){
		System.out.print("name = " + "unknown" + " ");
		System.out.print("age = " + 0 + " ");
		System.out.println("address = " + "not available");
	}
	
	void setInfo(String name, int age){
		System.out.println("name = " + name + " age = " + age );
	}
	
	void setInfo(String name, int age, String address){
		System.out.println("name = " + name + " age = " + age + " address = " + address);
	}
	
	
	
}

class Degree{
	void getDegree() {
		System.out.println("I got degree ");
	}
}
class Undergraduate extends Degree{
	void getDegree() {
		System.out.println("I am undergraduate ");
	}
}
class Postgraduate extends Degree{
	void getDegree() {
		System.out.println("I am postgraduate  ");
	}
}

class Bank{
	int getBalance(){
		return 0;
	}
}
class Bank1 extends Bank{
	int money = 1000;
	int getBalance(){
		return money;
	}
}
class Bank2 extends Bank{
	int money = 1500;
	int getBalance(){
		return money;
	}
}
class Bank3 extends Bank{
	int money = 2000;
	int getBalance(){
		return money;
	}
}


class Print{
	int i=10;
	void printNum() {
		System.out.println("i = " + i);
	}
}
class ChildPrint extends Print{
	int j=i;
	
	void printNum() {
		System.out.println("j = " + j);
	}
}


class A{
	static void show() {
		System.out.println("Parent");
	}
}
class B extends A{
	static void show() {
		System.out.println("Child");
	}
}


class RBI{
	int minInterest = 4;
	int minBalance = 1000;
	int maxWithdrawal = 50000;
}
class Account extends RBI{
	String name;
	static int balance;
	static int deposit;
	static int withdraw;
	void accountDetails(String aName, int aBalance) {
		this.name = aName;
		balance = aBalance;
		System.out.println("accountholder name is " + name);
		System.out.println("balance of  " + name + " is " + balance);
		if(balance >= minBalance) {
			System.out.println("Your balance is in given range");
		}
		else {
			System.out.println("Your balance is lowe than given range");
		}
	}
	void deposit(int n) {
		deposit = n;
		System.out.println("Deposited ammount is " + deposit);
		balance += deposit;
		System.out.println("Your balance is " + (balance));
	}
	
	void withdraw(int n) {
		withdraw = n;
		if(n > maxWithdrawal) {
			System.out.println("You are exceeding the withdrawal limit");
		}
		else {
			System.out.println("Withdrawal ammount is " + n);
			balance -= withdraw;
			System.out.println("Your balance is " + (balance));
		}
	}
}
class ICICI extends Account{
	int rate;
	void showRate(int r) {
		this.rate = r;
		System.out.println("min interest rate in ICICI is " + rate + " %");
	}
}
class SBI extends Account{
	int rate;
	int maxLoan = 1000000;
	int interest = 9;
	void showRate(int r) {
		this.rate = r;
		System.out.println("min interest rate in SBI is " + rate + " %");
	}
}
class Customer extends SBI{
	int loan ;
	void getLoan(int l) {
		loan = l;
		if(loan > maxLoan) {
			System.out.println(" You can get loan upto " + (maxLoan) );
		}
		else {
			System.out.println("You can get loan with " + (interest) + " % interest");
		}
	}
}
public class Assignment7 {

	public static void main(String[] args) {
		/*
		1. Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods with
		  the same name 'printn' having a parameter for each datatype. */
		
		PrintNumber p = new PrintNumber();
		p.printn(34);
		p.printn(345f);
		p.printn(3480.99);
		p.printn('A');
		p.printn(false);
		p.printn("Sonali");
		System.out.println();
		
		
 
/* 2.
Create a class to print an integer and a character with two methods having the same name but different sequence of the integer 
and the character parameters.
For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the
 form (char c, int n). */
		p.printn('A', 1000);
		p.printn(30000, 'S');
		System.out.println();
		
		
		
/*3.
Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number
 of parameters. The method for printing area of rectangle has two parameters which are length and breadth respetively while the 
 other method for printing area of square has one parameter which is side of square. */
		p.Area(20);
		p.Area(15, 4);
		System.out.println();
		
		
		
 
/*4.
Create a class 'Student' with three data members which are name, age and address. The constructor of the class assigns default
 values name as "unknown", age as '0' and address as "not available". It has two methods with the same name 'setInfo'. 
 First method has two parameters for name and age and assigns the same whereas the second method takes has three parameters 
 which are assigned to name, age and address respectively. Print the name, age and address of 10 students.
Hint - Use array of objects */
		Studnt s1 = new Studnt();
		s1.setInfo("Sonali", 21);
		s1.setInfo("Sonali", 21, "bhandup");
		s1.setInfo("Sejal", 19, "mulund");
		s1.setInfo("Raj", 56);
		s1.setInfo("Ravi", 25, "USA");
		Studnt s7 = new Studnt();
		Studnt s8 = new Studnt();
		s1.setInfo("Kedar", 9);
		Studnt s10 = new Studnt();
		System.out.println();
		
		
		
/*5.
Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". It has two subclasses namely 'Undergraduate'
 and 'Postgraduate' each having a method with the same name that prints "I am an Undergraduate" and "I am a Postgraduate" 
 respectively. Call the method by creating an object of each of the three classes. */
		Degree d = new Degree();
		d.getDegree();
		Undergraduate d1 = new Undergraduate();
		d1.getDegree();
		Postgraduate d2 = new Postgraduate();
		d2.getDegree();
		System.out.println();
		
		
 
/*6.
A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. We have to print the money 
deposited by him in a particular bank.
Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three subclasses named 'BankA', 'BankB' and 'BankC'
 with a method with the same name 'getBalance' which returns the amount deposited in that particular bank. Call the method 
 'getBalance' by the object of each of the three banks.*/
		Bank1 b1 = new Bank1();
		Bank2 b2 = new Bank2();
		Bank3 b3 = new Bank3();
		System.out.println("Money deposited in bank 1 is " + b1.getBalance());
		System.out.println("Money deposited in bank 2 is " + b2.getBalance());
		System.out.println("Money deposited in bank 3 is " + b3.getBalance());
		
		Bank b4 = new Bank1();
		System.out.println("Money deposited in bank 1 by refering Bank is is " + b4.getBalance());
		Bank b5 = new Bank();
		System.out.println("Money deposited in Bank is " + b5.getBalance());
		System.out.println();
		
		
		
/*7.
A class has an integer data member 'i' and a method named 'printNum' to print thevalue of 'i'. Its subclass also has an 
integer data member 'j' and a method named 'printNum' to print the value of 'j'. Make an object of the subclass and use it to 
assign a value to 'i' and to 'j'. Now call the method 'printNum' by this object. */
		ChildPrint c = new ChildPrint();
		c.printNum();
		System.out.println();
		
 
/*8.
Suppose a class 'A' has a static method to print "Parent". Its subclass 'B' also has a static method with the same name to
 print "Child". Now call this method by the objects of the two classes. Also, call this method by an object of the parent class
  refering to the child class i.e. A obj = new B()
 */
		//A a = new A();
		A.show();
		//B b = new B();
		B.show();
		A a1 = new B();
		a1.show();
		
		System.out.println();
		
/* 
9.All the banks operating in India are controlled by RBI. RBI has set a well defined guideline (e.g. minimum interest rate, 
minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set minimum 
interest rate applicable to a saving bank account to be 4% annually; however, banks are free to use 4% interest rate or to
 set any rates above it.

Write a JAVA program to implement bank functionality in the above scenario and demonstrate the dynamic polymorphism concept.
 Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc).
  Assume and implement required member variables and functions in each class.

*/
		
		RBI r = new RBI();
		Account a = new Account();
		a.accountDetails("Sonali Nehere", 20000);
		a.deposit(15000);
		a.withdraw(5000);
		ICICI i = new ICICI();
		i.showRate(5);
		SBI s = new SBI();
		s.showRate(7);
		Customer cu = new Customer();
		cu.getLoan(500000);
		
		
		
		
		
		
		
	}

}
