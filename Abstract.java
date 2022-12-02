import java.util.Scanner;
abstract class Animalx{
	abstract void eat();
	abstract void sleep();
	abstract void breadth();
}
class Lion extends Animalx{
	void eat() {
		System.out.println("Lion eats other animals");
	}
	void sleep() {
		System.out.println("Lion sleeps in the cave ");
	}
	void breadth() {
		System.out.println("Lion breath in oxygen and breadth out carbondioxide ");
	}
}
class Buffalo extends Animalx{
	void eat() {
		System.out.println("Buffalo eats grass");
	}
	void sleep() {
		System.out.println("Buffalo sleeps in the cowshed ");
	}
	void breadth() {
		System.out.println("Buffalo breath in oxygen and breadth out carbondioxide ");
	}
}
class Cat extends Animalx{
	void eat() {
		System.out.println("Cat eats fish and mouse");
	}
	void sleep() {
		System.out.println("Cat sleeps anywhere or in the human's house ");
	}
	void breadth() {
		System.out.println("Cat breath in oxygen and breadth out carbondioxide ");
	}
}
class Forest1{
	void permit(Animalx ref) {
		ref.eat();
		ref.sleep();
		ref.breadth();
	}
}

abstract class Parentx {
	abstract void message();
	
}
class Childx1 extends Parentx{
	void message() {
		System.out.println("This is first subclass ");
	}
}
class Childx2 extends Parentx{
	void message() {
		System.out.println("This is second subclass ");
	}
}


abstract class Birdx{
	abstract void eat();
	abstract void fly();
}
class Sparrow extends Birdx{
	void eat() {
		System.out.println("Sparrow eats cereals ");
	}
	void fly() {
		System.out.println("sparrow flies at low or medium height ");
	}
}
abstract class Eagle extends Birdx{
	abstract void eat();
	void fly() {
		System.out.println("Eagles flies at vety high heigth ");
	}
}
class GoldenEagle extends Eagle{
	void eat() {
		System.out.println("Golden Eagle eats medium sized mammals and birds ");
	}
}
class SerpantEagle extends Eagle{
	void eat() {
		System.out.println("Serpant Eagle eats mostly snakes ");
	}
}
class EagleForest{
	void permit(Eagle ref) {
		ref.eat();
		ref.fly();
	}
}
class SparrowForest {
	void permit(Sparrow s){
		s.eat();
		s.fly();
	}
}

class Home{
	void permit(Parentx ref) {
		ref.message();
	}
}

abstract class Shapee{
	float area;
	abstract void input();
	abstract void compute();
	void display() {
		System.out.println(area);
	}
}
class Squaree extends Shapee{
	float side;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of the square ");
		side = sc.nextFloat();
		
	}
	void compute() {
		area = side * side;
		System.out.print("Area of the square is ");
	
	}
}
class Reactanglee extends Shapee{
	float l, b;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the reactangle ");
		l = sc.nextFloat();
		System.out.println("Enter breadth of the reactangle ");
		b = sc.nextFloat();
		
	}
	void compute() {
		area = l * b;
		System.out.print("Area of the reactangle is ");
		
	}
}
class Circlee extends Shapee{
	float radius;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of the circle ");
		radius = sc.nextFloat();
		
	}
	void compute() {
		area = 3.14f * radius * radius;
		System.out.print("Area of the circle is " );
		
	}
}
class Geometry{
	void permit(Shapee ref) {
		ref.input();
		ref.compute();
		ref.display();
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l = new Lion();
		Buffalo b = new Buffalo();
		Cat c = new Cat();
		Forest1 f = new Forest1();
		f.permit(l);
		f.permit(b);
		f.permit(c);
		System.out.println();
		
		
		//
		EagleForest e = new EagleForest();
		GoldenEagle g = new GoldenEagle();
		SerpantEagle s = new SerpantEagle();
		e.permit(s);
		e.permit(g);
		SparrowForest sf = new SparrowForest();
		Sparrow sp = new Sparrow();
		sf.permit(sp);
		System.out.println();
		
		/*
	Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name
	 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' 
	 by creating an object for each subclass.  */
		Childx1 c1 = new Childx1();
		Childx2 c2 = new Childx2();
		Home h = new Home();
		h.permit(c1);
		h.permit(c2);
		System.out.println();
		
		//find area of square, circle, reactangle 
		Squaree sq = new Squaree();
		Reactanglee r = new Reactanglee();
		Circlee cr = new Circlee();
		Geometry gr = new Geometry();
		gr.permit(sq);
		gr.permit(r);
		gr.permit(cr);
		

	}

}
