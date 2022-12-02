class Animal{
	void eat(){
		System.out.println("Animal eats");
	}
	void sleep() {
		System.out.println("Animal sleeps");
	}
	void breadth() {
		System.out.println("Animal takes breadths");
	}
}
class Tiger extends Animal {
	void eat(){
		System.out.println("Tiger eats small animals ");
	}
	void breadth() {
		System.out.println("Tiger takes breadths");
	}
}
class Dear extends Animal {
	void eat(){
		System.out.println("Dear eats grass ");
	}
	void breadth() {
		System.out.println("Dear takes breadths");
	}
}
class Monkey extends Animal {
	void eat(){
		System.out.println("Monkey  eats fruits ");
	}
	void breadth() {
		System.out.println("Monkey  takes breadths");
	}
}

class Circle1{
	double area ;
	void area(int r) {
		area = 3.14 * r * r;
		System.out.println("Area of the circle is " + area );
	}
	
}
class Cylinder extends Circle{
	double area, volume;
	private int radius, height;
	public void setRadius(int r) {
		radius = r;
	}
	int getRadius() {
		return radius;
	}
	public void setHeight(int h) {
		height = h;
	}
	int getHeight() {
		return height;
	}
	
	void area() {
		int r = getRadius();
		int h = getHeight();
		area = 2 *3.14 * r *( r + h);
		System.out.println("Area of the cylinder is " + area );
	}
	void volume() {
		int r = getRadius();
		int h = getHeight();
		volume = 3.14 * r * r * h;
		System.out.println("Volume of the cylinder is " +  volume );
	}
	
}

class AAA{
	void position() {
		System.out.println("I am in class A ");
	}
	void sequence() {
		System.out.println("Comes under alphabet sequence ");
	}
	void classNo() {
		System.out.println("This is method location under class  ");
	}
}
class BBB extends AAA{
	void position() {
		System.out.println("I am in class B ");
	}
	void sequence() {
		System.out.println("Comes under alphabet sequence ");
	}
	void classNo() {
		System.out.println("This is method location under class  ");
	}
}
class CCC extends BBB{
	void position() {
		System.out.println("I am in class C ");
	}
	void sequence() {
		System.out.println("Comes under alphabet sequence  ");
	}
	void classNo() {
		System.out.println("This is method location under class  ");
	}
}

class Vehicle{
	int noOfSeats, noOfWheels;
	void description(int s, int w){
		noOfSeats = s;
		noOfWheels = w;
		System.out.println(noOfSeats + " seats " + noOfWheels + " wheels ");
		
	}
	
}

class Car{
	void use() {
		System.out.println("Use of cars is to travel from one location to another ");
	}
}
class Mercedes extends Car{
	void accelerate() {
		System.out.println("Accelaration rate of Mercedes is 6.1 to 7.6 seconds   ");
	}
	void brake() {
		System.out.println("Mercides has adaptive brakes ");
	}
}
class BMW extends Car{
void accelerate() {
	System.out.println("Accelaration rate of BMW is 4.2 seconds  ");
	}
	void brake() {
		System.out.println("BMW uses Brembo for their supply of brake calipers ");
	}
}

class Animals{
	void voice() {
		System.out.println("Animals has high voice ");
	}
	void eat() {
		System.out.println("Animals and Birds are able to eat ");
	}
	void survive() {
		System.out.println("Animals and birds both use oxygen to survive ");
	}
}
class Birds extends Animals{
	void wings() {
		System.out.println("Birds has wings for flying ");
	}
	void voice() {
		System.out.println("Birds has low voice ");
	}
}

class Parents{
	int age = 40;
	void cry() {
		System.out.println("Parents cry with no voice ");
	}
}
class Child1 extends Parents{
	int age = 4;
	void cry() {
		System.out.println("Child 1  cry at low voice ");
	}
	void printAge() {
		System.out.println("Age of child 1 is " + age );
		System.out.println("Age of child 1 is " + this.age );
		System.out.println("Age of parent is " + super.age );
		
	}
}
class Child2 extends Parents{
	void cry() {
		System.out.println("Child 2  cry at medium voice ");
	}
}
class Child3 extends Parents{
	void cry() {
		System.out.println("Child 3  cry at high voice ");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t = new Tiger();
		Dear d = new Dear();
		Monkey m = new Monkey();
		t.eat();
		t.sleep();
		t.breadth();
		d.eat();
		d.sleep();
		d.breadth();
		m.eat();
		m.sleep();
		m.breadth();
		Animal a = new Animal();
		a.eat();
		System.out.println();
		
		/*
	1. Create a class circle and use inheritance to create another class cylinder from it
	2. Create a method for area and volume in 1
	3. create methods for area & volume in 2 also create getters and setters */
		Cylinder cl = new Cylinder();
		cl.setRadius(4);
		cl.setHeight(5);
		cl.area();
		cl.volume();
		System.out.println();
		 Circle1 c2 = new Circle1();
		 c2.area(15);
		 System.out.println();
		 
		 /*
		  A is a super class. B is a sub class of A. C is a sub class of B.
		Create three methods in each class, 2 methods are specific to each class and third method (override method) 
		should be in all three Classes A, B and C
		  */
		 AAA a1 = new AAA();
		 BBB b = new BBB();
		 CCC c = new CCC();
		 a1.position();
		 a1.sequence();
		 a1.classNo();
		 b.position();
		 b.sequence();
		 b.classNo();
		 c.position();
		 c.sequence();
		 c.classNo();
		 System.out.println();
		 
		 /*
		  Create a class Vehicle. The class should have two fields-no_of_seats and no_of_wheels. Create two objects-Motorcycle
		   and Car for this class. Your output should show the descriptions for Car and Motorcycle.
		  */
		 Vehicle Car = new Vehicle();
		 Vehicle MotorCycle = new Vehicle();
		 System.out.print("Car has ");
		 Car.description(5, 4);
		 System.out.print("Motorcycle has ");
		 MotorCycle.description(2, 2);
		 System.out.println();
		 
		 /*
		  Suppose a Car has two functions: accelerate and brake. Now these functions have different values for different cars 
		  as every car has a different acceleration rate and braking mechanisms. So let us take the example of a Mercedes 
		  Benz S-Class which is a car. It inherits all the definitions of the class Car. However its acceleration and braking 
		  systems are unique.
		  */
		 Mercedes mr = new Mercedes();
		 BMW bm = new BMW();
		 mr.accelerate();
		 mr.brake();
		 mr.use();
		 bm.accelerate();
		 bm.brake();
		 bm.use();
		 System.out.println();
		 
		 /*
		  you have a class named Animal, and you wanted to make a class for Birds. Since Birds and Animals share many of the 
		  same base attributes, you could extend the Animal class and add any additional parts needed to the Bird class.
		  */
		 Animals an = new Animals();
		 Birds bd = new Birds();
		 an.voice();
		 an.eat();
		 bd.voice();
		 bd.wings();
		 bd.survive();
		 System.out.println();
		 
		 //
		 Parents p = new Parents();
		 Child1 c1 = new Child1();
		 Child2 ch2 = new Child2();
		 Child3 c3 = new Child3();
		 p.cry();
		 c1.cry();
		 ch2.cry();
		 c3.cry();
		 c1.printAge();
		 System.out.println();
		 
		 //
		 
		 
		 
	}
	
	

}
