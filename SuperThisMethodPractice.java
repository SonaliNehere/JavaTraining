class ParentDogs{
	private String name;
	ParentDogs(String name){
		super();
		this.name = name;
		System.out.println("In ParentDogs");
	}
	
	ParentDogs(){
		super();
		System.out.println("In ParentDogs");
	}
	
	public String getName(){
		System.out.println("In ParentDogs");
		return name;
		
	}
	
}

class ParentDogs2{
	private String name;
	ParentDogs2(String name){
		this();
		this.name = name;
		System.out.println("In ParentDogs2");
	}
	
	ParentDogs2(){
		super();
		name = "Ravana";
		System.out.println("In ParentDogs2");
	}
	
	public String getName(){
		System.out.println("In ParentDogs2");
		return name;
	}
	
}

class ParentDogs3{
	private String name;
	public String getName() {
		System.out.println("In ParentDogs3");
		return name;
	}
	
}

class ParentDogs4{
	private String name;
	private int age ;
	
	ParentDogs4(String name, int dAge){
		name = name;
		age = dAge;
		System.out.println("In ParentDogs4");
	}
	public String getName() {
		System.out.println("In ParentDogs4");
		return name;
	}
	
	ParentDogs4(int age){
		System.out.println("In ParentDogs4");
		this.age = age;
	}
	public int getAge() {
		System.out.println("In ParentDogs4");
		return age;
		
	}
}
public class SuperThisMethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentDogs d2 = new ParentDogs("Rocky");
		System.out.println(d2.getName());
		ParentDogs d3 = new ParentDogs();
		System.out.println(d3.getName());
		
		System.out.println();
		
		
		ParentDogs2 d = new ParentDogs2();
		System.out.println(d.getName());
		ParentDogs2 d1 = new ParentDogs2("Rama");
		System.out.println(d1.getName());
		
		System.out.println();
		
		ParentDogs3 d4 = new ParentDogs3(); // default constructor will be created
		System.out.println(d4.getName());
		System.out.println();
		
		ParentDogs4 d5 = new ParentDogs4("Rama", 24);
		System.out.println(d5.getName() + " " + d5.getAge());
		ParentDogs4 d6 = new ParentDogs4(21);
		System.out.println(d6.getAge());
		
		
	}

}

