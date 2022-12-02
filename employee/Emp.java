package employee;

public class Emp {
String name="Sonali Nehere", category="Female";
int empid=15, hra=10,da=100,npa=1000, pf=2000, grosspay=27000,incometax=500, allowance=1000; 
int bpay = grosspay - hra - da - npa - pf - incometax - allowance;
	public void print(){
	System.out.println("employee id is " + empid);
	System.out.println("employee name is " + name);
	System.out.println("employee category is " + category);
	System.out.println("employee bpay is " + bpay);
	System.out.println("employee hra is " + hra);
	System.out.println("employee da is " + da);
	System.out.println("employee npa is " + npa);
	System.out.println("employee PF is " + pf);
	System.out.println("employee grosspay is " + grosspay);
	System.out.println("employee incometax is " + incometax);
	System.out.println("employee allowance is " + allowance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
