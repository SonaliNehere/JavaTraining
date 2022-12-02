import java.util.*;

public class CollectionAssignment2 {

	public static void main(String[] args) {
		/*
1. Create an ArrayList of type String with 10 string elements. 
Add 10 string elements to ArrayList and perform the below operations 
Add an element to the ArrayList 
Iterate through the ArrayList by using Iterator object 
Add an element at a specific index 
Remove an element from the ArrayList, Remove at an index 
Update the element at a specific index 
Check the element is present at a particular index 
Get an element at a particular index 
 Find out the size of the ArrayList 
 Check the given element is present in the ArrayList 
 Remove all elements of the ArrayList */
		
 ArrayList<String> al = new ArrayList<String>();
 al.add("Sonali"); al.add("Sejal"); al.add("Shravani"); al.add("Purva"); al.add("Shamika");
 al.add("Manasi"); al.add("Meghana"); al.add("Rani"); al.add("Siddhi"); al.add("Shamika");
 Iterator itr = al.iterator();
 while(itr.hasNext()) {
	 System.out.println(itr.next() );
 }
 
 al.add(5, "MOM"); System.out.println(al);
 
 al.remove("Rani"); System.out.println(al);
 
 al.remove(0); System.out.println(al);
 
 al.set(3, "SONALI"); System.out.println(al);
 
 System.out.println(al.size());
 
 System.out.println(al.contains("Purva")); System.out.println(al.contains("Riya"));
		
al.clear(); System.out.println(al);
System.out.println();


 /*2. Create a HashMap with at least 10 key value pairs of the Student ID and Name 
 Insert a Key value mapping into the map 
 Fetch the value of a Key 
 Create a clone/copy of HashMap 
 Check if the given Key is in the Map 
 Check if the value is in the Map 
 Check if the map is empty
  Print the size of the Map to the console
  Print all the Keys of the map to the console 
  Print all the Values of the map to the console 
  Remove a specific Key-value pair 
  Copy all the elements of the Map to another Map */
HashMap<Integer, String> hm = new HashMap<Integer, String>();
hm.put(1, "Raj"); hm.put(2, "Rudra"); hm.put(3, "Ansh"); hm.put(4, "Jivansh"); hm.put(5, "Karnan");
hm.put(6, "Sanskar"); hm.put(7, "Rajat"); hm.put(8, "Satyendra"); hm.put(9, "Samrat"); hm.put(10, "Aman");
System.out.println(hm);

hm.put(13, "Arnav");  System.out.println(hm);
hm.put(13, "Ravi"); System.out.println(hm);

System.out.println(hm.get(5));

System.out.println(hm.clone());

System.out.println(hm.containsKey(5));
System.out.println(hm.containsValue("Varad"));

System.out.println(hm.isEmpty());
System.out.println(hm.size());

System.out.println(hm.keySet());
System.out.println(hm.values());
System.out.println(hm.entrySet());

hm.remove(7);
System.out.println(hm);
hm.remove(10, "Aman");
System.out.println(hm);

HashMap hm1 = new HashMap(hm);
System.out.println(hm1); System.out.println();
	
 /*  3. Create a HashSet with at least 10 elements of type String 
  * Write program covering all the operations of HashSet  */
HashSet hs = new HashSet();
hs.add("Reliance"); hs.add("Google"); hs.add("Amazon"); hs.add("Microsoft"); hs.add("TCS");
hs.add("Deolite"); hs.add("Infosys"); hs.add("LNT"); hs.add("Facebook"); hs.add("Mahendra"); hs.add("TCS");
System.out.println(hs);

HashSet hs1 = new HashSet();
hs1.addAll(hs); System.out.println(hs1);

System.out.println(hs.contains("Wipro"));
System.out.println(hs.containsAll(hs1));

System.out.println(hs.equals(hs1));

hs.forEach(i -> System.out.println(i));

System.out.println(hs.getClass());

System.out.println(hs.hashCode());

System.out.println(hs.isEmpty());

hs.remove("LNT");System.out.println(hs);
hs1.removeAll(hs); System.out.println(hs1);

hs1.retainAll(hs); System.out.println(hs1);

System.out.println(hs.size());
System.out.println(hs1.size());


	}

}
