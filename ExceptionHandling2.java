import java.util.Scanner;

//1
class Excp1{
	void print() {
		int arr[] = new int[5];
		arr[7] = 9;
	}
	
	
}
class Excp2 extends Excp1{
	void print1() {
		print();
	}
}
class Excp3 extends Excp2{
	void print2() {
		print1();
	}
}

//2
class WrongInput extends Exception{
	void getMsg() {
		System.out.println("invalid input ");
	}
}

class ATM{
	private String username="sonali";
	private String password="sonali";
	String un, up;
	void permit() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  username ");
		String un = sc.nextLine();
		System.out.println("Enter  password ");
		String up = sc.nextLine();
		if(username.equals(un) && password.equals(up)) {
			System.out.println("You can Collect Money and Receipt ");
		}
		else {
			 WrongInput w = new  WrongInput();
			 w.getMsg();
			throw w;
		}
	}
	
}

//3
class CreateException1 extends Exception{
	void getMsg() {
		System.out.println("Student name or age or div or percentage is wrong  ");
		
	}

}
class StudentRecord{
	String n = "sonali";
	int a = 21;
	char d = 'B';
	double p = 80;
	void validate () throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name ");
		String name = sc.nextLine();
		System.out.println("Enter student age ");
		int age = sc.nextInt();
		System.out.println("Enter student div ");
		char div = sc.next().charAt(0);
		System.out.println("Enter student percentage ");
		double percentage = sc.nextDouble();
		
		try {
			if(n.equals(name) == false || a != age || d!=div || p!=percentage) { 
				CreateException1 c1 = new CreateException1();
				c1.getMsg();
				throw c1;
			}
		}
		catch(Exception e) {
			System.out.println("exception occur : " + e);
		}
			
	}
}

//4
class CreateException2 extends Exception{
	void getMsg() {
		System.out.println("Not allow to create more than one object ");
		
	}

}
class PreventSecondObject{
	static int c= 0;
	PreventSecondObject(){
		c+=1;
	}
	void check() throws Exception{
		if(c>1) {
			CreateException2 c2 = new CreateException2();
			c2.getMsg();
			throw c2;
		}
		
	}
	
}
public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		/*	1. Program for chained exception */
	/*	try {
			Excp1 e1 = new Excp1();
			e1.print();
		}
		catch(Exception e) {
			System.out.println("exception occur in Excp1 class is : " + e);
		} */
		System.out.println();
		
		/* 2. Program to create custom exception */
	/*	ATM a = new ATM();
		try {
			
			a.permit();
		}
		catch(Exception e) {
			System.out.println("2 attempts remaining ");
			try {
				a.permit();
			}
			catch(Exception e1){
				System.out.println("1 attempt remaining ");
				try {
					a.permit();
				}
				catch(Exception e2){
					System.out.println("Try again after 12 hrs ");
				}
			}
		} */
		System.out.println();
		
		/* 3.  Program to validate student record */
		/*try {
			StudentRecord s = new StudentRecord();
			s.validate();
		}
		catch(Exception e) {
			System.out.println("exception occur : " + e );
		}
		
		*/
		
		System.out.println();
		
		/*  4. Program to prevent creation of second object */
		PreventSecondObject pr = new PreventSecondObject();
		PreventSecondObject pr1 = new PreventSecondObject();
		try {
			pr1.check();
		}
		catch(Exception e) {
			System.out.println("exception occur  more than one object created : " + e );
		}
		
		
		System.out.println();

		
	}

}
