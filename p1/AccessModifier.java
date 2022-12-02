package p1;

//2.
class Fruit{
	private String fruitName = "Apple";
	private void print() {
		System.out.println("I am in private method ");
	}
}
class Apple extends Fruit{
	/* String name = fruitName;
	print(); */
}

// 3.
class Device{
	int price = 1000;
	void price() {
		System.out.println("under default method ");
		
	}
}
class Equipment{
	Device d = new Device();
	int n = d.price;
	void equ() {
		d.price();
	}
}

//4
class Weapon{
	protected String weapon = "Knife ";
	protected void pr() {
		System.out.println("I am under protected method ");
	}
}
		


//5
class Tree{
	public int height = 100;
	public void psize() {
		System.out.println("in public method ");
	}
}

public class  AccessModifier {
	//1. 
	private String name = "Sonali";
	private void print() {
		System.out.println("I am in private method ");
	}
	
	//4
		protected String weapon = "Knife ";
		protected void pr() {
			System.out.println("I am under protected method ");
		}
	
		//5
		public int height = 100;
		public void psize() {
			System.out.println("in public method ");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. Create a class with PRIVATE fields, private method and a main method. Print the fields in main method. 
		Call the private method in main method. */
		 AccessModifier a = new  AccessModifier();
		System.out.println("private field " + a.name);
		a.print();
		System.out.println();
		
		/* 2. Create a sub class and try to access the private fields and methods from sub class.  */
		Apple ap = new Apple();
		// System.out.println(fruitName);
		System.out.println();
		
		/* 3. Create a class with DEFAULT fields and methods. Access these fields and methods from any other class in the same package */
		Device d = new Device();
		//int n = d.price;
		d.price();
		System.out.println(d.price + " default price ");
		Equipment e = new Equipment();
		System.out.println("default value " + e.n);
		e.equ();
		System.out.println();
		
		/* 4. Create a class with PROTECTED fields and methods. Access these fields and methods from any other class in the same 
		 * package. 
		 Also, Access the PROTECTED fields and methods from child class located in a different package . Access the PROTECTED fields 
		and methods from any class in different package  */
		
		a.pr();
		System.out.println(a.weapon + " protected data type ");
		System.out.println();
		
		/* 5. Create a class with PUBLIC fields and methods. Access the public methods and fields from any class in the same 
		 package or different package. */
		Tree t = new Tree();
		System.out.println("public field " + t.height);
		t.psize();
		 
	}

}
