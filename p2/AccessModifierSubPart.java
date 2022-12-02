
package p2;
import p1.*; 
import p1.AccessModifier ;
//import p1.Tree;

/* class Raman extends AccessModifier {
	//AccessModifier a = new AccessModifier();
	 String city = "Mumbai";
	// System.out.println(p1.AccessModifier.weapon);
	 
}
*/
public class AccessModifierSubPart extends AccessModifier {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierSubPart a = new AccessModifierSubPart();
		System.out.println("protected  field from another class is : " + a.weapon);
		a.pr();
		System.out.println() ;
		
		
		
	}

}
