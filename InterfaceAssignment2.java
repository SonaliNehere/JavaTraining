import java.util.Scanner;
//1
interface Doctor{
	void medicine();
}
abstract class Doctor1 implements Doctor{
	/* void medicine() {
		System.out.println("default method ");
	 } */ // default not allow 
}

//2
interface Doctor2{
	void print() ;
}
interface Doctor3 extends Doctor2{
	void permit();
}
class Doctor11 implements Doctor3{
	public void print() {
		System.out.println("Interface to Interface inheritance  ");
	}
	public void permit() {
		System.out.println("Interface to Interface inheritance  ");
	}
}

//3
interface Doctor4{
	int sum = 90;
	void printSum();
}
class Doctor5 implements Doctor4{
	public void printSum() {
		System.out.println("Sum is " + sum);
	}
}

//4
interface Doctor6{
//	private int a ;
// protected int b = 89;
}

//5.
interface Doctor7{
	public int c = 9;
}
class Doctor8 implements Doctor7{
	
}

//6
interface Doctor9{
	public static final String str = "SOnali";
	
}
class Doctor10 implements Doctor9{
	
}

//1.
abstract class Pen1{
	abstract void write();
	abstract void refill();
}

//2.
class FountainPen extends Pen1{
	void write() {
		System.out.println("This is the write method ");
	}
	void refill() {
		System.out.println("This is the refill method ");
	}
	void nib() {
		System.out.println("This is the nib of the pen ");
	}
}

//3.
class Monkey1{
	void jump() {
		System.out.println(" This is jump method ");
	}
	void bite() {
		System.out.println(" This is bite method ");
	}
}
class Human1 extends Monkey1 implements BasicAnimal{
	public void eat() {
		System.out.println(" This is eat method ");
	}
	public void sleep() {
		System.out.println(" This is sleep method ");
	}
}
interface BasicAnimal{
	void eat();
	void sleep();
}

//4,
abstract class Telephone{
	abstract void lift();
	abstract void disconnected();
	
}
class SmartTelephone extends Telephone{
	void lift() {
		System.out.println("This is lift method SmartTelephone");
	}
	void disconnected() {
		System.out.println("This is disconnected method SmartTelephone");
	}
}
class SmartTelephone1 extends Telephone{
	void lift() {
		System.out.println("This is lift method SmartTelephone1");
	}
	void disconnected() {
		System.out.println("This is disconnected method SmartTelephone1");
	}
}
class Smart{
	void permit(Telephone ref) {
		ref.lift();
		ref.disconnected();
	}
}

//5
class Monkey2 extends Monkey1{
	void jump() {
		System.out.println(" This is jump method in Monkey2");
	}
	void bite() {
		System.out.println(" This is bite method Monkey2");
	}
}
class Monkey3 extends Monkey1{
	void jump() {
		System.out.println(" This is jump method Monkey3 ");
	}
	void bite() {
		System.out.println(" This is bite method Monkey3 ");
	}
}
class MonkeyMaster{
	void permit(Monkey1 ref) {
		ref.jump();
		ref.bite();
	}
}

//6 , 7
interface SmartTvremote{
	void channel();
	
}
interface Tvremote extends SmartTvremote{
	void cable();
	
}
class Tv implements Tvremote{
	public void channel() {
		System.out.println("This is channel method ");
	}
	public void cable() {
		System.out.println("This is cable method ");
	}
}

//8
interface Shapes{
	void circleArea();
	void squareArea();
	void reactangleArea();
	void triangleArea();
}
class Area1 implements Shapes{
	Scanner sc = new Scanner(System.in);

	public void circleArea(){
		int r;
		System.out.println("Enter radius of the circle ");
		r = sc.nextInt();
		System.out.println("Area of the circle is " + (3.14*r*r) );
		
	}
	public void squareArea(){
		int s;
		System.out.println("Enter side of the square ");
		s = sc.nextInt();
		System.out.println("Area of the square is " + (s*s) );
		
	}
	public void reactangleArea(){
		int l, b;
		System.out.println("Enter length of the reactangle ");
		l = sc.nextInt();
		System.out.println("Enter breadth of the reactangle ");
		b = sc.nextInt();
		System.out.println("Area of the reactangle is " + (l*b) );
		
	}
	public void triangleArea(){
		int b, h;
		System.out.println("Enter base of the triangle ");
		b = sc.nextInt();
		System.out.println("Enter height of the triangle ");
		h = sc.nextInt();
		System.out.println("Area of the triangle is " + (0.5*b*h) );
		
	}
}
public class InterfaceAssignment2 {
	
	public static void main(String[] args) {
		
		System.out.println();
/* 1. Create an interface with a default method and implement it in a class. Do not provide implementation to the default 
 method and call the method. */
	// Doctor1 d1 = new Doctor1();
		System.out.println();
		
/* 2. Create an interface and inherit it from the other interface.  */
		Doctor11 d11 = new Doctor11();
		d11.permit();
		d11.permit();
		System.out.println();
		
 /*3. Create a PUBLIC interface with fields and methods, fields should have values assigned. Implement this interface to some 
 class and print the values of the interface fields and call the interface methods  */
	Doctor5 d5 = new Doctor5();
	System.out.println(d5.sum);
	d5.printSum();
		
 /*4. Create a PRIVATE or PROTECTED interface and print the values as above scenario */
	// interface fileds cannot be private, protected 
	System.out.println();
	
 /*5. Create an interface with private, public and protected fields.  */
	Doctor8 d8 = new Doctor8() ;
	System.out.println(d8.c);
	System.out.println();
	
	
/* 6.Create an interface with static final variable */
	Doctor10 d10 = new Doctor10();
	System.out.println(d10.str);
	System.out.println();

	/*1.Create an abstract class pen with methods write () and refill () as abstract methods   */
	
	
	/*2.Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()  */
	FountainPen f = new FountainPen();
	f.nib();
	f.write();
	f.refill();
	System.out.println();
	
	/*3.Create a class monkey with jump ( ) and bite ( ) methods. Create a class human which inherits this monkey class and
	   implements basicanimal interface with eat ( ) and sleep methods   */
	Human1 h = new Human1();
	h.jump(); h.bite(); h.sleep(); h.eat();
	System.out.println();
	
	/*4.Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods. create another class 
	 smart telephone and demonstrate polymorphism   */
	SmartTelephone st = new SmartTelephone();
	SmartTelephone1 st1 = new SmartTelephone1();
	Smart s = new Smart();
	s.permit(st);
	s.permit(st1);
	System.out.println();
	
	/*5. Demonstrate polymorphism using using monkey  class from Q3  */
	MonkeyMaster ms = new MonkeyMaster();
	Monkey2 m2 = new Monkey2();
	Monkey3 m3 = new Monkey3();
	ms.permit(m2);
	ms.permit(m3);
	System.out.println();
	
	/*6.Create an interface TVremote and use it to inherit another interface smart TVremote   */
	Tv t = new Tv();
	t.channel();
	t.cable();
	System.out.println();
	
	/*7.Create a class TV which implements TVremote interface from Q6 */
	Tv t1 = new Tv();
	t1.channel();
	t1.cable();
	System.out.println();
	
	/*8.Here we try to calculate the area of geometrical shapes, and for each shape, we have different methods. And all the
	  methods are defined, independent of each other. Only method signatures are written in the Interface.
	  Shapes are  1. circle  2. square  3. Triangle  4. Rectangle
	 */
	Area1 a1  = new Area1();
	a1.circleArea();
	a1.squareArea();
	a1.reactangleArea();
	a1.triangleArea();
	System.out.println();

	}

}
