package DesignProject;
import java.util.*;

class Design{
	static int p1=150, p2=50,p3=120,p4=70,p5=50,p6=45;
	static int c1, c2,c3,c4,c5,c6;
	static int total;
	public static void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ------------------------------ JIO FOOD CENTER ------------------------------ ");
		System.out.println();
		System.out.println("                           Choose your favourite dishes                      "); 
		System.out.println();
		System.out.print("                   "); System.out.print(" 1. PAV BHAJI "); System.out.print("         "); System.out.print(" How many Plates do you want    "); 
		c1 = sc.nextInt();
		System.out.print("                   "); System.out.print(" 2. SHEV PURI "); System.out.print("         "); System.out.print(" How many Plates do you want    "); 
		c2 = sc.nextInt();
		System.out.print("                   "); System.out.print(" 3. MASALA DOSA "); System.out.print("       "); System.out.print(" How many Plates do you want    "); 
		c3 = sc.nextInt();
		System.out.print("                   "); System.out.print(" 4. SANDWICH "); System.out.print("          "); System.out.print(" How many Plates do you want    "); 
		c4 = sc.nextInt();
		System.out.print("                   "); System.out.print(" 5. FRANKY "); System.out.print("            "); System.out.print(" How many Plates do you want    "); 
		c5 = sc.nextInt();
		System.out.print("                   "); System.out.print(" 6. RAGADA PURI "); System.out.print("       "); System.out.print(" How many Plates do you want    "); 
		c6 = sc.nextInt();
		System.out.println();
	}
	
	public static int total() {
		total = p1*c1 + p2*c2 + p3*c3 + p4*c4 + p5*c5 + p6*c6;
		return total;
	}
	
	public static void printBill() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ------------------------------------ BILL----------------------------------- ");
		System.out.println();
		System.out.print("                   ");System.out.print(" 1. PAV BHAJI "); System.out.print("       "); System.out.print(p1*c1); 
		System.out.println();
		System.out.print("                   ");System.out.print(" 2. SHEV PURI "); System.out.print("       "); System.out.print(p2*c2); 
		System.out.println();
		System.out.print("                   ");System.out.print(" 3. MASALA DOSA "); System.out.print("     "); System.out.print(p3*c3); 
		System.out.println();
		System.out.print("                   ");System.out.print(" 4. SANDWICH "); System.out.print("        "); System.out.print(p4*c4); 
		System.out.println();
		System.out.print("                   ");System.out.print(" 5. FRANKY "); System.out.print("          "); System.out.print(p5*c5); 
		System.out.println();
		System.out.print("                   ");System.out.print(" 6. RAGADA PURI "); System.out.print("     "); System.out.print(p6*c6); 
		System.out.println();System.out.println();
		System.out.print("                   ");System.out.print(" Total "); System.out.print("              "); System.out.print(total());
		System.out.println();
	}
}
public class BillingSystem {
	static int c;
	static int p1=150, p2=50,p3=120,p4=70,p5=50,p6=45;
	static int c1, c2,c3,c4,c5,c6;
	static int total;
	
	public static void display() {
		System.out.println(" ------------------------------ JIO FOOD CENTER ------------------------------ ");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		while(true) {
			/*System.out.println("1.PavBhaji 2.ShevPuri 3.Dosa 4.Sandwich 5.Franky 6.RagadaPuri 7.Exit ");
			System.out.println("choose your menu ");
			c=sc.nextInt(); */
			System.out.println("     Choose your favourite dishes                      "); 
			System.out.println();
			System.out.println("       1. PAV BHAJI ");  
			System.out.println("       2. SHEV PURI ");
			System.out.println("       3. MASALA DOSA "); 
			System.out.println("       4. SANDWICH ");  
			System.out.println("       5. FRANKY ");  
			System.out.println("       6. RAGADA PURI ");   
			System.out.println("       7. EXIT "); 
			//System.out.println();
			System.out.print("       "); 
			c= sc.nextInt();
			System.out.println();
			
			
			switch(c) {
			case 1 : System.out.print("       How many plates of Pav Bhaji do you want ");  System.out.print("       "); c1 = sc.nextInt();  break;
			case 2 : System.out.print("       How many of plates of Shev Puri do you want "); System.out.print("       "); c2 = sc.nextInt();  break;
			case 3 : System.out.print("       How many of plates of Masala Dosa do you want "); System.out.print("       "); c3 = sc.nextInt(); break;
			case 4 : System.out.print("       How many of plates of Sandwich do you want "); System.out.print("       "); c4 = sc.nextInt(); break;
			case 5 : System.out.print("       How many of plates of Franky do you want "); System.out.print("       "); c5 = sc.nextInt(); break;
			case 6 : System.out.print("       How many of plates  of Ragada Puri do you want "); System.out.print("       "); c6 = sc.nextInt(); break;
			case 7 : printBill(); break;
			default : System.out.println("Invalid Input "); break;
			
			}
			System.out.println();
		}
		
	}
	public static int total() {
		total = p1*c1 + p2*c2 + p3*c3 + p4*c4 + p5*c5 + p6*c6;
		return total;
	}
	
	public static void printBill() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ------------------------------------ BILL----------------------------------- ");
		System.out.println();
		if(c1!=0) {
			System.out.print("                   ");System.out.print(" 1. PAV BHAJI "); System.out.print("       "); System.out.print(p1*c1); 
			System.out.println();
		}
		if(c2!=0) {
			System.out.print("                   ");System.out.print(" 2. SHEV PURI "); System.out.print("       "); System.out.print(p2*c2); 
			System.out.println();
		}
		if(c3!=0) {
			System.out.print("                   ");System.out.print(" 3. MASALA DOSA "); System.out.print("     "); System.out.print(p3*c3); 
			System.out.println();
		}
		if(c4!=0) {
			System.out.print("                   ");System.out.print(" 4. SANDWICH "); System.out.print("        "); System.out.print(p4*c4); 
			System.out.println();
		}
		if(c5!=0) {
			System.out.print("                   ");System.out.print(" 5. FRANKY "); System.out.print("          "); System.out.print(p5*c5); 
			System.out.println();
		}
		if(c6!=0) {
			System.out.print("                   ");System.out.print(" 6. RAGADA PURI "); System.out.print("     "); System.out.print(p6*c6); 
			System.out.println();System.out.println();
		}
		System.out.print("                   ");System.out.print(" Total "); System.out.print("              "); System.out.print(total());
		System.out.println();
		System.exit(0);
	}
	public static void main(String[] args) {
	//	Design.display();
	//	Design.printBill();
		
		BillingSystem.display();
		BillingSystem.printBill();

	}

}
