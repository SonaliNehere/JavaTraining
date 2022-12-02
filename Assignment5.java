/*

1.Take an array of length n where all the numbers are nonnegative and unique. Find the element in the array possessing the 
highest value. Split the element into two parts where first part contains the next highest value in the array and second part
 hold the required additive entity to get the highest value. Print the array where the highest value get splitted into those 
 two parts.

Sample input: 4 8 6 3 2

Sample output: 4 6 2 6 3 2 


2.Write a program to shift every element of an array to circularly right. E.g.-

INPUT : 1 2 3 4 5

OUTPUT : 5 1 2 3 4

 3.Initialize a 2D array of 3*3 matrix. E.g.-

123456789

3. Check if the matrix is symmetric or not.  

4.Sorting refers to arranging data in a particular format. Sort an array of integers in 
ascending order. One of the algorithm is selection sort. Use below explanation of selection sort to do this.

INITIAL ARRAY :

2314515

First iteration : Compare every element after first element with first element and if it is larger then swap. In first iteration, 
2 is larger than 1. So, swap it.


1324515

Second iteration : Compare every element after second element with second element and if it is larger then swap. In second
 iteration, 3 is larger than 2. So, swap it.


1234515

Third iteration : Nothing will swap as 3 is smaller than every element after it.


1234515

Fourth iteration : Compare every element after fourth element with fourth element and if it is larger then swap. In fourth 
iteration, 45 is larger than 15. So, swap it.


1231545
 5.Input any number. Find the sum of the digits of the number using a recursive function.

*/

import java.util.Scanner;
public class Assignment5 {
	
	public int sum(int n){
		if(n==0)
			return 0;
		else
		return(n%10 + sum(n/10));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Assignment5 as = new Assignment5();
		
		// 5. find sum of digits using recursion
		/*System.out.println("Enter number");
		int n = sc.nextInt();
		int ans = as.sum(n);
		System.out.println(ans); */
		
		//4. Selection sort
		/*System.out.println("Enter array length");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<=n-1; i++) {
			System.out.println("Enter element of an array");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<=n-2;i++) {
			for(int j=i+1;j<=n-1; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("sorted array is ");
		for(int i=0; i<=n-1; i++) {
			System.out.println(arr[i]); 
		} */
		
		//3. check matrix is symmetric or not
		/*System.out.println("Enter array length");
		int n = sc.nextInt();
		int flag =0;
		int arr[][] = new int[n][n];
		for(int i=0; i<=n-1; i++) {
			for(int j=0; j<=n-1; j++) {
				System.out.println("Enter element of an array");
				arr[i][j] = sc.nextInt();
			}
			
		}
		for(int i=0; i<=n-1; i++) {
			for(int j=0; j<=n-1; j++) {
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		for(int i=0; i<=n-1;i++) {
			for(int j=0;j<=n-1; j++) {
				if(arr[i][j]!=arr[j][i]) {
					flag = 1;
				}
			}
		}
		if(flag == 0)
			System.out.println("It is a symmetric matrix");
		else
			System.out.println("It is not a symmetric matrix");
		System.out.println();
		*/	
		
		//2. circular right shift
		/*System.out.println("Enter array length");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int a[] = new int[n];
		for(int i=0; i<=n-1; i++) {
			System.out.println("Enter element of an array");
			arr[i] = sc.nextInt();
		}
		int temp;
		temp = arr[n-1];
		a[0] = temp;
		for(int i=1; i<=n-1;i++) {
			a[i] = arr[i-1];
			
		}
		System.out.println("after right shifting ");
		for(int i=0; i<=n-1; i++) {
			System.out.println(a[i]); 
		} */
		
		
		//1.
		System.out.println("Enter array length");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int a[] = new int[n];
		for(int i=0; i<=n-1; i++) {
			System.out.println("Enter element of an array");
			arr[i] = sc.nextInt();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
