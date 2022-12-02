//1. 
interface Cartoon{
	void watch();
}
class Tom implements Cartoon{
	public void watch() {
		System.out.println("I am watching Tom and Jerry ");
	}
}

//2.
interface Science{
	void bio();
	void chem();
}
abstract class Science1 implements Science{
	public void bio() {
		System.out.println("I am studying biology ");
	}
}

//3
interface Maths1{
	void algebra();
	
}
interface Maths2{
	void geometry() ;
}
class Math implements Maths1, Maths2{
	public void algebra() {
		System.out.println("I am studying Algebra ");
	}
	public void geometry() {
		System.out.println("I am studying Geometry ");
	}
}

//5
interface Bike1{
	void model();
}
interface Bike2{
	void model();
}
class Bikes implements Bike1, Bike2{
	public void model() {
		System.out.println("Bike model is Splender ");
	}
	
}
public class InterfaceAssignment {

	public static void main(String[] args) {
		/*1.  Create an interface with only one method and implement it in a class. Call the method implemented. 		 */
		Tom t = new Tom();
		t.watch();
		System.out.println();
		
  		/*2. Create an interface with two methods, but implement only one in a class. Call the method implemented. 		 */
		Science sc; 
		//sc.bio();
		System.out.println();
		
		/*3. Use Interface instances to call the implemented method in the implemented class 		 */
		//Science s = new Science();
		//can't instantiate interface 
		System.out.println();
		
		/*4. Create two interfaces with one method each. Implement these two interfaces in one class. 		 */
		Math m = new Math();
		m.algebra();
		m.geometry();
		System.out.println();

		/*5. Create two interfaces with the same method (same signature) in both the interfaces. Implement these two interfaces 
		 * in one class. Call the method
		 */
		Bikes b = new Bikes();
		b.model();

	}

}
