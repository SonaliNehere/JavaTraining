import java.util.*;
public class CollectionAssignment {

	public static void main(String[] args) {
		
/*1. Write a Java program to create a new array list, add some colors (string) and print out the collection. */
		ArrayList al = new ArrayList();
		al.add("black");
		al.add("white");
		al.add("blue");
		al.add("yellow");
		System.out.println("arralist : " + al);
		System.out.println();
		
		
/*2. Write a Java program to iterate through all elements in a array list. */
		Iterator itr = al.iterator();
		System.out.println("iterating arraylist elements ");
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		System.out.println();
		
/*3. Write a Java program to insert an element into the array list at the first position. */
		System.out.println("insert element at first position ");
		al.add(0, "gray");
		System.out.println(al);
		System.out.println();
		
/*4. Write a Java program to retrieve an element (at a specified index) from a given array list.  */
		System.out.println("retrieving element at 3rd position is " + al.get(2));
		System.out.println();
		
/*5. Write a Java program to update specific array element by given element.*/
		System.out.println("update specific element ");
		al.set(1, "purple");
		System.out.println(al);
		System.out.println();
		
		
/*6. Write a Java program to remove the third element from a array list.*/
		System.out.println("remove third element ");
		al.remove(2);
		System.out.println(al);
		System.out.println();
		
/*7. Write a Java program to search an element in a array list. */
		
		System.out.println("white is in arraylist is " + al.contains("white"));
		System.out.println("purple is in arraylist is " + al.contains("purple"));
		System.out.println();
		
/* 8. Write a Java program to sort a given array list. */
		Collections.sort(al);
		System.out.println("sorted arraylist is ");
		System.out.println(al);
		System.out.println();
		
/*9. Write a Java program to copy one array list into another. */
		System.out.println("copy arraylist1 in arraylist2 ");
		ArrayList al2 = new ArrayList(al);
		
		System.out.println(al2);
		System.out.println("copy arraylist1 in arraylist3 ");
		ArrayList al3 = (ArrayList)al.clone();
		System.out.println(al3);
		System.out.println();
		
/*10. Write a Java program to shuffle elements in a array list.  */
		System.out.println("shuffle elements ");
		Collections.shuffle(al);
		System.out.println(al);
		System.out.println();

		 

	}

}
