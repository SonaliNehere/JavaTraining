
class Mammal{
	public String name = "mammal";
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
class Bird extends Mammal{
	void wings() {
		System.out.println("Birds has wings for flying ");
	}
	void voice() {
		System.out.println("Birds has low voice ");
	}
} 


class Plane{
	void fly() {
		System.out.println("Plane is flyig ");
	}
	void land() {
		System.out.println("Plane is landing ");
	}
}
class CargoPlane extends Plane{
	void fly() {
		System.out.println("Cargo Plane fly at low height ");
	}
	void carryCargo() {
		System.out.println("Cargo plane carries cargo");
	}
}
class PassengerPlane extends Plane{
	void fly() {
		System.out.println("Passenger Plane fly at medium height ");
	}
	void carryPassenger() {
		System.out.println("Passenger plane carries passengers");
	}
}

class AnimalWorld{
	void eat() {
		System.out.println("Animal eats ");
	}
	void breath() {
		System.out.println("All animals take breath ");
	}
}
class Tigher extends  AnimalWorld{
	void eat() {
		System.out.println("Tiger eats small animals ");
	}
}
class Cow extends  AnimalWorld{
	void eat() {
		System.out.println("Cow eats grass ");
	}
}
class Forest{
	void permit( AnimalWorld ref) {
		ref.eat();
		ref.breath();
		
	}
}

class AP{
	void type() {
		System.out.println("I comes under method ");
	}
	void position() {
		System.out.println("In class AP ");
	}
}
class BP extends AP{
	void position() {
		System.out.println("In class BP ");
	}
}
class CP extends BP{
	void position() {
		System.out.println("In class CP ");
	}
}
class Alphabet{
	void permit(AP ref ) {
		ref.position();
		ref.type();
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Bird();
		Mammal ref ;
		ref = b;
		ref.voice();
		// ref.wings(); error 
		((Bird)(ref)).wings(); //version 1
		System.out.println(); 
		
		//Version 1 Polymorphism 
		Plane p;
		CargoPlane c = new CargoPlane();
		p = c;
		p.fly();
		((CargoPlane)(p)).carryCargo();
		
		PassengerPlane ps = new PassengerPlane();
		p = ps;
		p.fly();
		((PassengerPlane)(p)).carryPassenger();
		p.land();
		System.out.println();
		
		//Version 2 Polymorphism
		Tigher t = new Tigher();
		Cow cw = new Cow();
		Forest f = new Forest();
		f.permit(cw);
		f.permit(t);
		System.out.println();
		
		/*
		 A, B and C are classes A is a super class. B is a sub class of A. C is a sub class of B. 
		Call an overridden method with super class reference to B and C class’s objects */
		BP bp = new BP();
		CP cp = new CP();
		Alphabet a = new Alphabet();
		a.permit(bp);
		a.permit(cp);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
