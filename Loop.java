
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			System.out.println("Bright IT Career");
		}
		System.out.println();
		
		//print 1-20
		int j=1;
		while(j<=20) {
			System.out.println(j);
			j++;
		}
		System.out.println();
		
		//print odd even
		if(12%2 == 0) {
			System.out.println("12 is even");
		}
		if(11%2 != 0) {
			System.out.println("11 is odd");
		}
		
		System.out.println();
		
		//print largest in 3
		if(10>20 && 10>30)
			System.out.println("10 is largest");
		else if(20>10 && 20>30)
			System.out.println("20 is largest");
		else 
			System.out.println("30 is largest");
		System.out.println();
		
		//print even no. 0-100
		int i=0;
		System.out.println("even numbers");
		while(i<=100) {
			if(i%2 == 0)
				System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		System.out.println();
		
		//do while
		int k = 1;
		do {
			System.out.println(k);
			k++;
			
		}while(k<=10);
		System.out.println();
		
		// armstrong  number
		int n = 153;
		int n1 = n;
		int d=0;
		int sum=0;
		
		while(n1>0) {
			d = n1%10;
			sum = sum + (d*d*d);
			n1 = n1/10;
		}
		if(sum == n)
			System.out.println("153 is armstrong number");
		else
			System.out.println("153 is not armstrong number");
		
		System.out.println();
		
		//prime no check
		int h=2;
		int flag = 0;
		int num = 37;
		while(num > h) {
			if(num%h == 0) {
				flag = 1;
				break;
			}
			else
				h++;
		}
		if(flag == 1)
			System.out.println("37 is not prime no.");
		else
			System.out.println("37 is prime no");
		
		System.out.println();
		
		//switch
		int s = 7707%2;
		switch(s){
			case 0 : System.out.println("even no."); break;
			case 1 : System.out.println("not even no. "); break;
			default : System.out.println("wrong input"); break;
		}
		
		System.out.println();
		
		char ch = 'M';
		switch(ch){
			case 'M' : System.out.println("male"); break;
			case 'F' : System.out.println("female "); break;
			default : System.out.println("wrong input"); break;
		}
		
		System.out.println();
		
		
		//largest using if else
		if(10>=20) {
			if(10>=30) {
				System.out.println("10 is largest");
			}
			else {
				System.out.println("30 is largest");
			}
		}
		else if(20>=30){
			System.out.println("20 is largest");
		}
		else {
			System.out.println("30 is largest");
		}
		
		System.out.println();
		
		//pallindrome
		
		int no = 2002;
		int no_ = no;
		int rev=0; 
		int di;
		while(no_ != 0) {
			di = no_ % 10;
			rev = rev*10 + di;
			no_ = no_ / 10;
		}
		if(no == rev) {
			System.out.println("2002 is palindrome");
		}
		else
			System.out.println("2002 is not palindrome");
		
		System.out.println();

		//equal operator
		int x = 230;
		int y = 240;
		int z = 230;
		if(x!=y)
			System.out.println("x and y are not equal");
		
		if(x==z)
			System.out.println("x and z are  equal");
		
		
		
		
	
		
		
		
		
		

	}

}
