class Dog{
	String name;
}
class Student{
	String name;
	int id;
	char div;
}
class Employee{
	int salary;
}
class Color{
	String color_name;
	void color() {
		System.out.println("Color name is " + color_name);
	}
}
class Pen{
	String brand;
}

public class ObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Dog d = new Dog();
		d.name = "Dolly";
		System.out.println(d.name);
		System.out.println(d);
		
		Student s = new Student();
		s.name = "Sonali";
		s.id = 67;
		s.div = 'B';
        System.out.println(s.id + " " + s.name + " " + s.div);
        
        Employee e = new Employee();
        e.salary = 10000;
        Employee e1 = e;
        System.out.println(e.salary);
        System.out.println(e1.salary);
        Employee e2 = new Employee();
        e2.salary = 20000;
        System.out.println(e2.salary);
        System.out.println(new Employee().salary);
        
        Color c = new Color();
        c.color_name = "red";
        Color c1 = new Color();
        System.out.println(c.color_name);
        c.color();
        
        Pen p = new Pen();
        p.brand = "cello";
        Pen p1 = new Pen();
        System.out.println(p.brand);
        System.out.println(new  Pen().brand);
        System.out.println(p1.brand);
        Pen p2 = new Pen();
        p2.brand = "Natraj";
        System.out.println(p2.brand);

	}

}
