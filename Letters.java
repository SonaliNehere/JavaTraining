
public class Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(j==1 || (i==j && i>5) || j==10 || (i+j==11 && i>5) )
						
				{
					System.out.print("*");
					
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=20; j++) {
				if(j==5 || (i==j && i>5) || (i+j==11 && i<=5) ) 
				{
					System.out.print("*");
					
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(j==1 || j==10 || i==j) {
					System.out.print("*");
					
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(j==1 || j==10 || (i==j && j<=5) || (i+j==11 && j>5)) {
					System.out.print("*");
					
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if((i==j && j<=5 ) || (i+j==11 && j>5)) {
					System.out.print("*");
					
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if((j==5 && i>5) || (i==j && i<=5) || (i+j==11 && i<5) ) {
					System.out.print("*");
					
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(j==i || i+j==11 ) {
					System.out.print("*");
					
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(i==1 || i==5 || j==1 || (j==10 && i<=5) || (i==j && j>=5)) {
					System.out.print("*");
					
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if((i==1 && j<=7) || (i==7 && j<=7) || (j==1 && i<=7) || (j==7 && i<=7) || 
						(i==j && i>=5) ) {
					System.out.print("*");
					
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(i==1 ||i==10 || j==1 || (i==6 && j>=6) || (j==10 && i>=6  )
						 || (j==10 && i<=3 )) {
					System.out.print("*");
					
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if((i==1 && j!=1) || (i==10 && j!=1) || (j==1 && i!=1 && i!=10)) {
					System.out.print("*");
					
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		

	}

}
