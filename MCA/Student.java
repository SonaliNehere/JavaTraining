package MCA;
/*
 Write a Package MCA which has one class Student. Accept student detail through parameterized constructor. Write display ()
  method to display details. Create a main class which will use package and calculate total marks and percentage.
 */
public class Student {
	public int maths, science, english, history;
	public static int total;
	public double percentage;
	String name;
	public Student(String name, int maths, int science, int english, int history ){
	this.name = name;
	this.maths = maths;
	this.science = science;
	this.english = english;
	this.history = history;
	
	}
	public void display() {
		total = maths + science + english + history;
		percentage = total*100/400;
	System.out.println("Percentage of " + name + " is " + percentage  );
	
	}
	

}
