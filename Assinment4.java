/*
1. Java program to find duplicate elements in an array.

2. Java program to find second largest element in an array of integers.

3. Java program to check the equality of two arrays.

4. Find all pairs of elements in an integer array whose sum is equal to a given number.

5. Java program to find continuous sub array whose sum is equal to a given number

6. Java program to find the intersection of two arrays

7. Java program to separate zeros from non-zeros in an integer array

8. Java program to find all the leaders in an integer array

9. Java program to find a missing number in an integer array

10.Java program to count occurrences of each element in an array

11.Java program to reverse an array without using an additional array

12.Java program to remove duplicate elements from an array

13. Java program to find union and intersection of multiple arrays

14. Java program to find the most frequent element in an array
*/


import java.util.Scanner;
import java.lang.Math;
public class Assinment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//2
		/*int a[] = new int[5];
		for(int i=0; i<=4; i++) {
			System.out.println("Enter an element ");
			a[i] = sc.nextInt();
		}
		for(int i=0; i<=3; i++) {
			for(int j=i+1; j<=4; j++) {
				if(a[i] <= a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("Second largest element is " + a[1]);
		System.out.println(); */
		
		
	//3
		/*int b[] = new int[5];
		int c[] = new int[5];
		int flag = 1;
		for(int i=0; i<=4; i++) {
			System.out.println("Enter an element of array 1");
			b[i] = sc.nextInt();
		}
		for(int i=0; i<=4; i++) {
			System.out.println("Enter an element of array 2");
			c[i] = sc.nextInt();
		}
		for(int i=0; i<=4; i++) {
			if(b[i]!=c[i]) {
				flag = 0;
				break;
			}
		}
		if(flag == 1)
			System.out.println("Two arrays are equal ");
		else
			System.out.println("Two arrays are not  equal ");
		*/
		
	//6
		/*int d[] = new int[5];
		int e[] = new int[5];
		int inter[] = new int[5];
		for(int i=0; i<=4; i++) {
			System.out.println("Enter an element of array 1");
			d[i] = sc.nextInt();
		}
		for(int i=0; i<=4; i++) {
			System.out.println("Enter an element of array 2");
			e[i] = sc.nextInt();
		}
		int k=0;
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=4; j++) {
				if(d[i]==e[j]) {
					inter[k] = d[i];
					k++;
				}
			}
			
		}
		System.out.println("Intersection of two arrays are ");
		for(int i=0; i<=inter.length-1; i++) {
			System.out.println(inter[i]);
		}
		System.out.println(); */
		
		//11
		/*int f[] =new int[5];
		for(int i=0; i<=4; i++) {
			System.out.println("Enter an element of array ");
			f[i] = sc.nextInt();
		}
		for(int i=0,j=4; i<=j;i++,j--) {
			int temp = f[i];
			f[i] = f[j];
			f[j] = temp;
		}
		System.out.println("Reverse array is ");
		for(int i=0; i<=4; i++) {
			System.out.println(f[i]);
			
		}
		System.out.println(); */
		
		//13
		/*
		int g[] = new int[5];
		int h[] = new int[5];
		int m[] = new int[5];
		
		int l = g.length + h.length + m.length;
		int union[] = new int[l];
		
		for(int i=0; i<=4; i++) {
			System.out.println("Enter an element of array 1");
			g[i] = sc.nextInt();
		}
		for(int i=0; i<=4; i++) {
			System.out.println("Enter an element of array 2");
			h[i] = sc.nextInt();
		}
		for(int i=0; i<=4; i++) {
			System.out.println("Enter an element of array 3");
			m[i] = sc.nextInt();
		}
		
		int j=0;
		for(int i=0; i<=g.length-1; i++) {
			union[j] = g[i];
			j++;
		}
		for(int i=0; i<=h.length-1; i++) {
			union[j] = h[i];
			j++;
		}
		for(int i=0; i<=m.length-1; i++) {
			union[j] = m[i];
			j++;
		}
		System.out.println("Union of array is ");
		for(int i=0; i<=l-1; i++) {
			System.out.println(union[i]);
		}
		System.out.println();
		
		
		int inter[] =new int[5];
		int x=0;
		for(int i=0; i<=4;i++) {
			for(int b=0; b<=4; b++) {
				for(int k=0; k<=4; k++) {
					if((g[i] == h[b])  ) {
						if(m[k] == g[i]) {
							inter[x] = m[k];
							x++;
						}
						
					}
				}
			}
		}
		System.out.println("Intersection of elements is ");
	    for(int i=0; i<=inter.length-1; i++) {
	    	System.out.println(inter[i]);
	    }
	    System.out.println(); */
	    
	    //10 no. of occurrences of each element
		/*int arr[] = new int[5];
		int fr[] = new int[5];
		for(int i=0;i<=4;i++) {
			System.out.println("Enter element of array ");
			arr[i]  = sc.nextInt();
		}
		int visit =-1;
		for(int i=0; i<=4;i++) {
			int count = 1;
			for(int j=i+1; j<=4; j++) {
				if(arr[i] == arr[j]) {
					fr[i] = count++;
					 fr[j] = visit;  
				}
				
					
			}
			  if(fr[i] != visit)  
	                fr[i] = count;  
		}
		for(int i=0; i<=4; i++) {
			if(fr[i] != visit)  
				System.out.println(arr[i] + " = " + fr[i]);
		} */
		
		//1 find duplicate elements
		/*
		int arr[] =new int[5];
		int duplicate[] = new int[5];
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println("Enter an element of array ");
			arr[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<=4;i++) {
			for(int j=i+1; j<=4; j++) {
				if(arr[i] ==arr[j]) {
					duplicate[i] = arr[i];
				}
			}
		}
		System.out.println("duplicate elements are ");
		for(int i=0; i<=duplicate.length-1; i++) {
			System.out.println(duplicate[i]);
		} */
		
		//14. find most frequent element
		/*int arr[] = new int[5];
		int fr[] = new int[5];
		for(int i=0;i<=4;i++) {
			System.out.println("Enter element of array ");
			arr[i]  = sc.nextInt();
		}
		int visit =-1;
		for(int i=0; i<=4;i++) {
			int count = 1;
			for(int j=i+1; j<=4; j++) {
				if(arr[i] == arr[j]) {
					fr[i] = count++;
					 fr[j] = visit;  
				}
				
					
			}
			  if(fr[i] != visit)  
	                fr[i] = count;  
		}
		int max = Integer.MIN_VALUE;
		for(int i=0; i<=4; i++) {
			if(fr[i] != visit)  
				//System.out.println(arr[i] + " = " + fr[i]);
				if(fr[i] > max)
					max = arr[i];
				
		} 
		System.out.println("Most frequent element is " + max);
		System.out.println(); */
		
		//4 find all pairs whose sum is equal to given number
		/*int arr[] = new int[10];
		System.out.println("Enter number");
		int n = sc.nextInt();
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println("Enter an element of array");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=i+1; j<=arr.length-1; j++) {
				if((arr[i] + arr[j]) == n) {
					System.out.println("(" + arr[i] + " " + arr[j] + ")");
				}
			}
		} */
		
		//5. find continuous subarray whose sum is equal to given number
		/*System.out.println("Enter length of array");
		int n= sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter number");
		int num = sc.nextInt();
		for(int i=0; i<=n-1;i++) {
			System.out.println("Enter an element of array");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<=n-2;i++) {
			if((arr[i]+ arr[i+1]) == num) {
				System.out.println(arr[i] + " " + arr[i+1]);
			}
			
		}
		
		for(int i=0; i<=n-3;i++) {
			
			if((arr[i]+ arr[i+1] + arr[i+2]) == num) {
				System.out.println(arr[i] + " " + arr[i+1] + " " + arr[i+2]);
			}
		} */
		
		//7 separate zeros from non-zeroes in array
		/*System.out.println("Enter size of an array");
		int n= sc.nextInt();
		int arr[] = new int[n];
		int zero[] = new int[10];
		int nonzero[] = new int[10];
		for(int i=0; i<=n-1;i++) {
			System.out.println("Enter an element of array");
			arr[i] = sc.nextInt();
		}
		for(int i= 0; i<=n-2; i++) {
			for(int j=i+1; j<=n-1; j++) {
				if(arr[i] == 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<=arr.length-1;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(); */
		
		//9. find missing number
		/*System.out.println("Enter the length of an array");
		int n = sc.nextInt();
		int miss;
		int arr[] = new int[n];
		for(int i=0; i<=n-2;i++) {
			System.out.println("Enter an element of array");
			arr[i] = sc.nextInt();
		}
		int sum = (n*(n+1))/2;
		int arrsum = 0;
		for(int i=0; i<=n-2; i++) {
			arrsum += arr[i];
			
		}
		
		miss = sum - arrsum;
		System.out.println("missing number is " + miss);
		*/
		
		
		/*for(int i=0; i<=n-1; i++) {
			if((arr[i+1] - arr[i]) == 2) {
				System.out.println(arr[i] + 1);
				break;
			}
		} */
		
		//8. Find leader element in an array
		// leader element = element which is greater than all element of its right side
		/* System.out.println("Enter the length of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<=n-1;i++) {
			//System.out.println("Enter an element of array");
			arr[i] = sc.nextInt();
		}
		System.out.println("Leader elements are");
		for(int i=0; i<=n-1; i++) {
			int flag = 0;
			for(int j=i+1; j<=n-1; j++) {
				if(arr[i]<arr[j]) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println(arr[i]);
			}
		} */
		
		//12. remove duplicate elements from an array
		int flag = 0;
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int newarr[] = new int[n];
		for(int i=0; i<=n-1;i++) {
			System.out.println("Enter an element of array");
			arr[i] = sc.nextInt();
		}
		int k=0;
		
		//System.out.println("Duplicate elements are");
		for(int i=0; i<=n-1; i++) {
			for(int j=i+1; j<=n-1; j++ ) {
				if(arr[i] != arr[j]) {
					System.out.println(arr[i]);
					
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
