class Demo{
	static int a;
	static int b;
	int x;
	int y;
	
	static void  display() {
		a = 10;
		b = 20;
		System.out.println("Static variable " + a);
		System.out.println("Static variable "  + b);
		//System.out.println(x);
	}
	static void multiply() {
		System.out.println("multiplication of static  variables " + a*b);
	}
	
	static {
		System.out.println("I am in static block ");
		System.out.println();
	}
	
	void  display1() {
		x = 5;
		y = 15;
		System.out.println("instance variable "+ x);
		System.out.println("instance variable "+ y);
		System.out.println("Static variable inside instance method " + a);
		System.out.println("Static variable inside instance method " + b);
	}
	
	{
		System.out.println("I am in non static block ");
		System.out.println();
	}
	void multiply1() {
		System.out.println("multiplication of instance variables " + x*y);
	}
	
}
public class StaticPractice {
	static int var = 100;
	int var1 = 200;
	
	static int c=0;
	static int c1=0;
	StaticPractice(){
		c1+=1;
		System.out.println("constructor");
	}
	StaticPractice(String str){
		c1+=1;
		System.out.println("constructor");
	}
	{
		c++;
		System.out.println("non static block");
	}
	
	void add() {
		System.out.println("instance method : addition of 2 and 5 is " + (2+5));
		
	}
	static void add1() {
		System.out.println("static method : addition of 2 and 5 is " + (2+5));
		StaticPractice ss = new StaticPractice();
		ss.add();
	}
	
	void sub() {
		System.out.println("instance method : substraction of 20 and 5 is " + (20-5));
		StaticPractice.sub1();
	}
	static void sub1() {
		System.out.println("static method : substraction of 20 and 5 is " + (20-5));
		
	}
	public static void main(String[] args) {
		
		/* 
1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method.  */
		Demo d = new Demo();
		d.display1();
		System.out.println();
		d.multiply1();
		System.out.println();
		Demo.display();
		System.out.println();
		Demo.multiply();
		System.out.println();
		d.display1();
		System.out.println();
		d.multiply1();
		System.out.println();
		
		/* 2. Print instance variables in static methods 
		 can't make static reference to non static field
		 * */
		
		
		//3. Print static variables in instance methods
		
		//4. count the number of objects to be created
		StaticPractice s = new StaticPractice();
		StaticPractice s1 = new StaticPractice();
		StaticPractice s2 = new StaticPractice();
		System.out.println("no. of objects " + StaticPractice.c);
		System.out.println("no. of objects " + StaticPractice.c1);
		StaticPractice s3 = new StaticPractice("Sonali");
		System.out.println("no. of objects " + StaticPractice.c);
		System.out.println("no. of objects " + StaticPractice.c1);
		System.out.println();
		
		/* 1. Call instance methods in static methods */
		StaticPractice.add1();

		/* 2. Call static methods in instance methods */
		new StaticPractice().sub();
		/* 3. Print all the static, instance variables in main method */
		System.out.println("static variable " + StaticPractice.var);
		System.out.println("instance variable " + new StaticPractice().var1);
		System.out.println();

		/* 4. Call static methods and instance methods in main method */
		StaticPractice.add1(); //static
		System.out.println();
		new StaticPractice().sub(); //instance
	}

}
