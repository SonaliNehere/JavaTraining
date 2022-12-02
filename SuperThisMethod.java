
class Dogs{
	private String name;
	Dogs(String name){
		super();
		this.name = name;
	}
	
	Dogs(){
		super();
	}
	
	public String getName(){
		return name;
	}
	
}

class Dogs2{
	private String name;
	Dogs2(String name){
		this();
		this.name = name;
	}
	
	Dogs2(){
		super();
		name = "Ravana";
	}
	
	public String getName(){
		return name;
	}
	
}

class Dogs3{
	private String name;
	public String getName() {
		return name;
	}
	
}

class Dogs4{
	private String name;
	private int age ;
	
	Dogs4(String name, int dAge){
		name = name;
		age = dAge;
	}
	public String getName() {
		return name;
	}
	
	Dogs4(int age){
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
public class SuperThisMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d2 = new Dogs("Rocky");
		System.out.println(d2.getName());
		Dogs d3 = new Dogs();
		System.out.println(d3.getName());
		
		System.out.println();
		
		
		Dogs2 d = new Dogs2();
		System.out.println(d.getName());
		Dogs2 d1 = new Dogs2("Rama");
		System.out.println(d1.getName());
		
		System.out.println();
		
		Dogs3 d4 = new Dogs3(); // default constructor will be created
		System.out.println(d4.getName());
		System.out.println();
		
		Dogs4 d5 = new Dogs4("Rama", 24);
		System.out.println(d5.getName() + " " + d5.getAge());
		Dogs4 d6 = new Dogs4(21);
		System.out.println(d6.getAge());
		
		
	}

}
