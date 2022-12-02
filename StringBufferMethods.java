
public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		//append
		s1.append("Java");
		System.out.println(s1);
		
		//reverse
		s1.reverse();
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		
		//insert
		s1.insert(0, "Core ");
		System.out.println(s1);
		
		//replace
		s1.replace(1,3, "Hello");
		System.out.println(s1);
		
		//delete
		s1.delete(1, 6);
		System.out.println(s1);
		
		
		s1.insert(1, "or");
		System.out.println(s1);
		
		//capacity
		System.out.println(s1.capacity());
		s1.append(" the great developer");
		System.out.println(s1);
		System.out.println(s1.capacity());
		
		//ensureCapacity
		s1.ensureCapacity(45);
		System.out.println(s1.capacity());
		s1.ensureCapacity(69);
		System.out.println(s1.capacity());
		
		//deleteChaeAt
		s1.deleteCharAt(2);
		System.out.println(s1);
		
		//give unicode
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.codePointBefore(1));
		
		
		
		
		

	}

}
