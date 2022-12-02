
public class Operators {

	 void add() { //method define
			System.out.println("addition of 2 and 3 is " + 5);
			
		}
		 
		public int sub(int x, int y) {
			return(x-y);
		}

		public void arithmetic(int a, int b) {
			System.out.println("addition of 100 and 50 is " + (100+50));
			System.out.println("substraction of 100 and 50 is " + (100-50));
			System.out.println("multiplication of 100 and 50 is " + (100*50));
			System.out.println("division of 100 and 50 is " + (100/50));
			
		}

		public void unary(int a) {
			int inc = ++a;
			a=5;
			int dec = --a;
			System.out.println("increment of 5 is " + inc);
			System.out.println("decrement of 5 is " + dec);
		}

		public void bitwise(int a, int b) {
			
			System.out.println("bitwise and of 5 and 8 is " + (a&b) );
			System.out.println("bitwise or of 5 and 8 is " + (a|b));
			System.out.println("bitwise not of 5 is " + (a!=b) );
		}




		public void smaller() {
			if(20<80) {
				System.out.println("20 is smallest number");
			}
			else {
				System.out.println("80 is smallest number");
			}
		}

		public void larger() {
			if(20>80) {
				System.out.println("20 is largest number");
			}
			else {
				System.out.println("80 is largest number");
			}
		}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Operators c = new Operators(); //create object
				c.add(); //call method
				
				int ans = c.sub(10, 20);
				System.out.println("Substraction of 10 and 20 is " + ans);
				
				System.out.println("Sonali Nehere"); //print name
				
				//single line comment
				
				/*  multiple line
				  comment   */
				
				/** documentation comment     */
				
				//define data types
				int i = 10;
				float f = 12.45f;
				char ch = 'a';
				double d = 456.678;
				boolean bt = true;
				
				System.out.println(i + "\n" + f + "\n" + d + "\n" + bt + "\n" + ch  );
				
				//arithmetic
				c.arithmetic(100, 50);
				
				//unary
				c.unary(5);
				
				//bitwise
				c.bitwise(5, 8);
				
				//find numbers equal or not
				System.out.println("equality of 5 and 5  is " + (5 == 5));
				System.out.println("equality of 10 and 6  is " + (10==6));
				
				//relational operator
				if(5>8) {
					System.out.println("5 is  greater than 8");
				}
				else {
					System.out.println("5 is not greater than 8");
				}
				
				if(5<8) {
					System.out.println("5 is less than 8");
				}
				
				c.smaller();
				c.larger();
				
				if(5==5 && 6==7) {
					System.out.println("logical and is true");
				}
				else {
					System.out.println("logical and is false");
				}
				
				if(5==5 || 6==7) {
					System.out.println("logical or is true");
				}
				else {
					System.out.println("logical or is false");
				}
				
				if(6!=5 ) {
					System.out.println("logical not is true");
				}
				else {
					System.out.println("logical and is false");
				}
			}

}
