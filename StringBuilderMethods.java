
public class StringBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1 = new StringBuilder();
		System.out.println(s1);
		
		//append
		s1.append("Java");
		System.out.println(s1);
		
		//reverse
		s1.reverse();
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		
		//insert
		s1.insert(0, "Hello ");
		System.out.println(s1);

		//delete
		s1.delete(6, 10);
		System.out.println(s1);
		
		//capacity
		System.out.println(s1.capacity());
		s1.append(" the great developer");
		System.out.println(s1);
		System.out.println(s1.capacity());
		
		//ensureCapacity
		s1.ensureCapacity(45);
		System.out.println(s1.capacity());
		s1.ensureCapacity(71);
		System.out.println(s1.capacity());
		s1.ensureCapacity(288);
		System.out.println(s1.capacity());
		
		//give unicode
				System.out.println(s1.codePointAt(0));
				System.out.println(s1.codePointBefore(1));
				
		
		
		
		
	}

}
