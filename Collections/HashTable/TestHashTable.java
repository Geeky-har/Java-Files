// Java HashTable class maps keys to its values
// contains only unique elements
// It does not allow null key or values
// It is synchronized

import java.util.*;

class TestHashTable{
	public static void main(String args[]){
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(100, "Harsh");
		ht.put(101, "Aditya");
		ht.put(102, "Vishal");
		ht.put(103, "Veer");
		ht.put(104, "Petek");
		ht.put(105, "Monika");
		
		// Traversing our map
		
		// for(Map.Entry m: ht.entrySet()){
		//	System.out.println(m.getKey() + " " + m.getValue());
		// }
		
		// We can also remove a key by using remove() method
		
		ht.remove(105);	// Will pass the key values
		
		// for(Map.Entry m: ht.entrySet()){
		// 	System.out.println(m.getKey() + " " + m.getValue());
		// }
		
		// To get the value of a key
		
		// System.out.println(ht.get(100));	// Specify the key
		
		// To check if the HashTable is empty
		
		// System.out.println("Is the HashTable empty: " + ht.isEmpty());
		
		// To get the size of the HashTable
		
		// System.out.println("The size of our HashTable is: " + ht.size());
		
		// To check whether a key or a value is present or not in the HashTable
		
		// System.out.println(ht.containsKey(104));	// For key

		// System.out.println(ht.containsValue("Monika"));	// For value
		
		// To get a string representation of the map
		
		// System.out.println(ht.toString());
		
		// To get all the values in the table
		
		// System.out.println("All the values in the Hash table are: " + ht.values());
		
		// To get all the keys in the table
		
		// System.out.println("All the keys in the Hash table are: " + ht.keySet());
		
		// To replace the value of a particular key
		
		ht.replace(100, "Parsh");
		
		for(Map.Entry m: ht.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		// To clear the whole HashTable
		
		// ht.clear();

	}
}