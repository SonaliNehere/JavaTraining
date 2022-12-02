class Students{
	Students(){
		System.out.println("name is Unknown");
	}
	Students(String name){
		System.out.println("name is " + name);
	}
}

class Study{
	int id;
	String name;
	Study(){
		super();
		System.out.println("No arguments");
		System.out.println("name value in this class is " + this.name);
	}
	Study(int id){
		super();
		System.out.println("id is " + id);
		this.id = id;
		System.out.println("id of this class is " + this.name);
	}
	
	Study(int id, String name){
	System.out.println("id is " + id + " and name is " + name);
	}
	
	private Study(int age, int rollno){
		
	}
	protected Study(String school, int rollno) {
		System.out.println("This is protected constructor");
	}
	public Study(String name) {
		System.out.println("This is public constructor");
	}
	
	Study(char name) {
		System.out.println("This is default constructor");
	}
	
	int Study(Boolean a) {
		return 10;
	} 
}


public class ConstructorAssignment {
	private ConstructorAssignment(int marks) {
		System.out.println("marks are " + marks);
		System.out.println("This is private constructor");
	}

	public static void main(String[] args) {
		
		/*
		 1. Write a class with a default constructor, one argument constructor and two argument
		constructors. Instantiate the class to call all the constructors of that class from a main
		class  */
		Study s = new Study();
		Study s1 = new Study(65);
		Study s2 = new Study(65, "Sonali");
		System.out.println();
		
		
		
		/*2. Call the constructors(both default and argument constructors) of super class from a child
		class  */
		//done
		
		
		
		/*3. Apply private, public, protected and default access modifiers to the constructor  */
		//Study s3 = new Study(21, 65);
		Study s4 = new Study("Jondhale", 67);
		Study s5 = new Study("Sonali");
		ConstructorAssignment c = new ConstructorAssignment(89);
		Study s6 = new Study('S');
		System.out.println();
		
		
		/*4. Write constructors with return type int and String  */
		//constructor does not have return type so it will give error
		//Study s7 = new Study(true);
		
		
		/*5. Try to call the constructor multiple times with the same object */
		//this will give error
		//Study s = new Study();
		//Study s = new Study();
		System.out.println();
		
		
		/*
		 Write a program to print the names of students by creating a Student class. If no name is passed while creating an object 
		 of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while 
		 creating object of Student class.
		 */
		System.out.println();
		Students ss = new Students();
		Students ss1 = new Students("Sonali");
		System.out.println();
			
		
		

	}

}
