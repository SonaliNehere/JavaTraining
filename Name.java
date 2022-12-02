
public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(i==1 || i==5 || i==10 || (j==1 && i<=5) || (j==10 && i>5)) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=1; j<=10; j++) {
				if((i==1 && j<=9 && j!=1) || (i==10 && j<=9 && j!=1) || (j==1 && i!=1 && i!=10) ||
						(j==10 && i!=1 && i!=10) ) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=1; j<=10; j++) {
				if(j==1 || j==10 || i==j) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=1; j<=10; j++) {
				if(i==1 || i==5 || j==1 || j==10 ) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=1; j<=10; j++) {
				if(i==10 || j==1) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=1; j<=10; j++) {
				if(i==1 || i==10 || j==5) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}



	}

}
