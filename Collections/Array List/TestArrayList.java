// Array list uses dynamic array to store elements.
// Array list can contain duplicate elements.
// It is non synchronized.
// Array List allows random access of elements.

import java.util.*;

class Employee{
	int empId;
	String name;
	int age;
	
	Employee(int empId, String name, int age){
		this.empId = empId;
		this.name = name;
		this.age = age;
	}
}

class TestArrayList{
	public static void main(String[] args){
			
		ArrayList l1 = new ArrayList();	// will create an array list
		l1.add("Harsh");
		l1.add("Aditya");
		l1.add("Vishal");
		l1.add("Bittu");
		l1.add("Sunil");
		
		// Iterator i = l1.iterator();	// getting iterator of the ArrayList
		
		// while(i.hasNext()){		// returns true if iterator has more elements
		// 	System.out.println(i.next());	// returns current element and moves to next element
		// }
		
		// We can also iterate through the ArrayList by using the foreach loop
		
		// for(Object s: l1){
		// 	System.out.println(s);
		// }
		
		// We can also add User Defined objects in the ArrayList
		
		Employee e1 = new Employee(101, "Rajesh", 35);
		Employee e2 = new Employee(102, "Harsh", 20);
		Employee e3 = new Employee(103, "Jon Skeet", 51);
		
		ArrayList l2 = new ArrayList ();
		l2.add(e1);		// adding the objects of Employee as list item
		l2.add(e2);
		l2.add(e3);
		
		Iterator i = l2.iterator();
		
		// while(i.hasNext()){
		//	Employee em = (Employee)i.next();	// with each iteration obtaining the object by typecasting it 
		//	System.out.println(em.empId + " " + em.name + " " + em.age);	// printing the deatils of the employee
		// }
		
		// If we want to append the whole list into a another list we do it by using the addAll() method
		
		ArrayList l3 = new ArrayList();
		l3.add("Petek");
		l3.add("Sophie");
		l3.add("Jon");
		
		l1.addAll(l3);	// will join the elements of l3 with l1;
		
		//for(Object s: l1){
		//	System.out.println(s);
		//}
		
		// If we want to remove those elements in the list which occurs in an another list, we use removeAll() method
		
		l1.removeAll(l3);	// will remove those elements which are common in with l3
		
		// for(Object s: l1){
		//	System.out.println(s);
		// }
		
		// If we want to keep only those elements which are common and remove rest, then we use retainAll() method
		
		ArrayList l4 = new ArrayList();
		l4.add("Aditya");
		l4.add("Vishal");
		
		l1.retainAll(l4);	// will only keep those elments which occur in l4
		
		for(Object s: l1){
			System.out.println(s);
		}
	}
}

/* Some important methods/constructors of the array list are:
   ArrayList(int capacity) - To set a size
   clear() - To remove all elements
   boolean contains(Object o) - Returns true if list contains that element
   remove(int index) - To remove element at specific index
   sort(Collection c) - To Sort the list
   size() - To get the current size of the list
   
*/