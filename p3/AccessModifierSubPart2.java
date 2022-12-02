package p3;


import p1.*; 


/* class Raman extends AccessModifier {
	//AccessModifier a = new AccessModifier();
	 String city = "Mumbai";
	// System.out.println(p1.AccessModifier.weapon);
	 
}
*/
public class AccessModifierSubPart2  {

	public static void main(String[] args) {
		
		
		AccessModifier a1 = new AccessModifier();
		System.out.println("public  field from another class is : " + a1.height) ;
		a1.psize();
		
	}

}