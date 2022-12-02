
public class MethodOverloadingAssignment {
	//1
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	//2
	void sum(int a, float b) {
		System.out.println(a+b);
	}
	void sum(int a, float b, double c) {
		System.out.println(a+b+c);
	}
	
	//3
	void mul(int a, float b) {
		System.out.println(a*b);
	}
	void mul(float a, int b) {
		System.out.println(a*b);
	}
	
	//4
	void mul(int a, double b) {
		System.out.println(a*b);
	}
	void mul(float a, double b) {
		System.out.println(a*b);
	}
	
	//5
	/*void product(int a, int b) {
		System.out.println(a*b);
	}
	int product(int b, int a) {
		return a*b;
	} */

	public static void main(String[] args) {
		/*
		
		1. Write two methods with the same name but different number of parameters of same type and call the methods from main
		 method */
		MethodOverloadingAssignment m = new MethodOverloadingAssignment();
		m.add(10, 20);
		m.add(10, 20, 30);
		
		
		/*	 2. Write two methods with the same name but different number of parameters of different data type and call the methods 
		 from main method */
		m.sum(10, 1.5f);
		m.sum(10, 10.5f, 10.50);
		
		
		/* 3. Write two methods with the same name and same number of parameters of same type and call from main method */
		m.mul(10, 10.5f);
		m.mul(12.5f, 10);
		
		
		/*  4. Write two methods with the same name and same number of parameters of different type and call from main method */
		m.mul(10, 10.10);
		m.mul(12.5f, 10.90);
		
		/* 5. Write two methods with the same name, number of parameters and data type but different return Typ */
	/*	m.product(10, 20);
		int d = m.product(20, 10);
		
		*/


	}

}
