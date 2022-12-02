import  java.lang.Math;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Perimeter and area of rectangle
		int l = 7;
		int b = 5;
		System.out.println("Perimeter of reactangle is " + (l+l+b+b));
		System.out.println("Area of reactangle is " + (l*b));
		
		System.out.println();
		
		//Perimeter of triangle
		int a = 2;
		int d = 3;
		int c = 5;
		System.out.println("Perimeter of triangle is " + (a+d+c));
	    System.out.println();
	    
	    // 
	    int x = 8+2345;
	    x = x/3;
	    x = x%5;
	    x = x*5;
	    System.out.println("result is " + x);
	    System.out.println();
	    
	    //check 23 and 45 are equal or not
	    int m = 23;
	    int n = 45;
	    if(m==n) {
	    	System.out.println("23 and 45 are equal");
	    }
	    else {
	    	System.out.println("23 and 45 are not equal");
	    }
	    System.out.println();
		
	    // 7^5
	    double v = Math.pow(7, 5);
	    System.out.println("7 raised to 5 is " + v);
	    System.out.println();
	    
	    //
	    int y =55;
	    int z = 70;
	    System.out.println(y<50 && y<z);
	   // System.out.println(y<z);
	    System.out.println();
	    
	    //
	    System.out.println(y<50 || y<z);
	    System.out.println();
	    
	    //percentage and total
	    int maths = 78;
	    int science = 45;
	    int english = 62;
	    int total = maths + science + english;
	    System.out.println("The total is " + total);
	    float percentage = (total*100)/300;
	    System.out.println("The percentage is " + percentage);
	    System.out.println();
	    
	    //swap
	    int p = 6;
	    int q = 8;
	    int temp;
	    temp = p;
	    p = q;
	    q = temp;
	    System.out.println("after swapping p = " + p + " q = " + q);
	    p = 6;
	    q = 8;
	    p = p+q;
	    q = p-q;
	    p = p-q;
	    System.out.println("after swapping p = " + p + " q = " + q);
	    System.out.println();
	    
	    //fahrenheit to celsius
	    float f = 20f;
	    float deg = (f - 32) * 5 / 9;
	    System.out.println("20 fahrenheit to degree celsius is " + deg);
	    System.out.println();
	    
	    //find grade A girls
	    int Study = 90;
	    int boys  = 45;
	    int Study_A = 50*90/100;
	    int boys_A = 20;
	    int girls_A = Study_A - boys_A;
	    System.out.println("Girls with grade A are " + girls_A);
	    System.out.println();
	    
	    //sum of 1st and 2nd last digit
	    int k = 76895;
	    int add = 0;
	    int di=0;
	    int i =0;
	    int n3 = k;
	    while(n3>0) {
	    	di = n3%10;
	    	if(i ==1  || i == 4)
	    		add = add + di;
	    	n3 = n3/10;
	    	i = i+1;
	    }
	    System.out.println("sum of 1st and 2nd last digit is " + add);
	    System.out.println();
	    
	    //display number with each digit greater than that digit
	    int number = 5698;
	    int nu = number;
	    int one  = nu %10 + 2;
	    if(one > 9)
	    	one = one - 10;
	    nu = nu/10;
	    int two = nu%10 + 2;
	    if(two > 9)
	    	two = two - 10;
	    nu = nu/10;
	    int three = nu%10 + 2;
	    if(three > 9)
	    	three = three - 10;
	    nu = nu/10;
	    int four = nu%10 +2;
	    if(four > 9)
	    	four = four - 10;
	    int result = four*1000 + three*100 + two*10 + one;
	    
	    System.out.println("5698 display number with each digit greater than that digit " +  result);
	    System.out.println();
	    
	    
	    
	    
	    //sum of digits
	    int no = 132;
	    int sum = 0;
	    int digit=0;
	    int n2 = no;
	    while(n2>0) {
	    	digit = n2%10;
	    	sum = sum + digit;
	    	n2 = n2/10;
	    }
	    System.out.println("sum of digits  of 132 is " + sum);
	    System.out.println();
	    
	    
	    
	    //reverse 
	    int num = 132;
	    int rev = 0;
	    int dig=0;
	    int n1 = num;
	    while(n1>0) {
	    	dig = n1%10;
	    	rev = rev*10 + dig;
	    	n1 = n1/10;
	    }
	    System.out.println("reverse of 132 is " + rev);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
