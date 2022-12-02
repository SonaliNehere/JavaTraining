
public class Pattern {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
				
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
		
			
		
			System.out.println();
		}
	
		for(int i=1; i<=7;i++) {
			for(int j=1; j<=11; j++) {
				if(j>3 && j<9 && i>3) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

	}

}
