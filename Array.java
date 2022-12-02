import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		int a[] = new int[5];
		for(int i=0; i<=a.length-1;i++) {
			System.out.println("Enter element");
			a[i] = sc.nextInt();
		}
		System.out.println("Entered elements are : ");
		for(int i=0; i<=a.length-1;i++) {
			System.out.println(a[i]);
		} */
	
		/*int b[][] = new int[3][4];
		for(int i=0; i<=b.length-1;i++) {
			for(int j=0; j<=b[i].length-1; j++) {
				System.out.println("Enter element");
				b[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("Entered elements are : ");
		for(int i=0; i<=b.length-1;i++) {
			for(int j=0; j<=b[i].length-1;j++)
				System.out.print(b[i][j] + " ");
			System.out.println();
		} */
		
		//two dimentional jagged array
		/*int c[][] = new int[3][];
		c[0] = new int[3];
		c[1] = new int[5];
		c[2] = new int[4];
		
		
		for(int i=0; i<=c.length-1;i++) {
			for(int j=0; j<=c[i].length-1; j++) {
				System.out.println("Enter element");
				c[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("Entered elements are : ");
		for(int i=0; i<=c.length-1;i++) {
			for(int j=0; j<=c[i].length-1;j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		} */
		
		
		//three dimentional array
		/*int a[][][] = new int[2][3][3];
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1; j++) {
				for(int k=0; k<=a[i][j].length-1; k++) {
					System.out.println("Enter the element " +  i + " " +  j + " " + k);
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("Entered elements are ");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1; j++) {
				for(int k=0; k<=a[i][j].length-1; k++) {
					System.out.print(a[i][j][k] + " ");
					
				}
				System.out.println();
			}
			System.out.println();
		} */
		
		//three dimentional jagged array
		int r[][][] = new int[2][][];
		r[0] = new int[3][];
		r[1] = new int[2][];
				
		r[0][0] = new int[3];
		r[0][1] = new int[4];
		r[0][2]= new int[5];
		
		r[1][0] = new int[4];
		r[1][1] = new int[2];
		
		for(int i=0;i<=r.length-1;i++) {
			for(int j=0;j<=r[i].length-1; j++) {
				for(int k=0; k<=r[i][j].length-1; k++) {
					System.out.println("Enter the element " +  i + " " +  j + " " + k);
					r[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("Entered elements are ");
		for(int i=0;i<=r.length-1;i++) {
			for(int j=0;j<=r[i].length-1; j++) {
				for(int k=0; k<=r[i][j].length-1; k++) {
					System.out.print(r[i][j][k] + " ");
					
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
