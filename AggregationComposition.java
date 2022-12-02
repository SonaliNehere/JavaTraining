class Heart{
	String name;
	Heart(String name){
		this.name= name;
	}
	String getName() {
		return name;
	}
}
class Brain{
	String name;
	Brain(String name){
		this.name = name;
	}
	String getName() {
		return name;
	}
}
class Bike{
	String name;
	Bike(String name){
		this.name = name;
	}
	String getName() {
		return name;
	}
}
class Book{
	String name;
	Book(String name){
		this.name = name;
	}
	String getName() {
		return name;
	}
}
class Studentt{
	Heart h = new Heart("Heart of Sonali ");
	void hasBike(Bike b) {
		System.out.println("Bike access through student : " + b.getName());
	}
	
	Brain br = new Brain("Brain of Sonali ");
	void hasBook(Book b) {
		System.out.println("Book access through student : " + b.getName());
	}
	

}

//2.
class Human{
	Heart h = new Heart("Heart of Human ");
	Brain br = new Brain("Brain of Human ");
		
}
class Studentt1 extends Human{
	void hasBike(Bike b) {
		System.out.println("Bike access through student1 : " + b.getName());
	}
	
	void hasBook(Book b) {
		System.out.println("Book access through student1 : " + b.getName());
	}
}

public class AggregationComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. student has composite heart and brain , student has aggregate book and bike 
		 Studentt s = new  Studentt();
		 Bike b = new Bike("Pulsor");
		 System.out.println(b.getName());//access bike
		 System.out.println(s.h.getName()); //access heart
		 s.hasBike(b);//access bike through student
		 
		 Book bk = new Book("Maths");
		 System.out.println(bk.getName()); //access book
		 System.out.println(s.br.getName()); //access brain 
		 s.hasBook(bk); // access book through student 
		// s = null;
		// System.out.println(bk.getName());
		// s.hasBook(bk); null exception
		// System.out.println(s.br.getName()); null exception
		 System.out.println();
		 
		 //2.  student extends human , human has composite heart and brain , student has aggregate book and bike 
		 Human h = new Human();
		 System.out.println("access through human : " + h.h.getName());
		 System.out.println("access through human : " + h.br.getName());
		 
		 Studentt1 s1 = new  Studentt1();
		 Bike b1 = new Bike("New Pulsor");
		 System.out.println(b1.getName());//access bike
		 s1.hasBike(b1);//access bike through student1
		 Book bk1 = new Book("New Maths");
		 System.out.println(bk1.getName()); //access book
		 s1.hasBook(bk1); // access book through student1 
		 
		 System.out.println("access through student1 : " +s1.h.getName());
		 System.out.println("access through studenr1 : " +s1.br.getName());
		 System.out.println();
		 
		 h = new Studentt1();
		 System.out.println("access bike and book through parent referene ");
		 ((Studentt1)(h)).hasBike(b1);
		 ((Studentt1)(h)).hasBook(bk1);
		 
		 
		 
		 

	}

}
