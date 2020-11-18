// Linked List class uses Doubly Linked List.
// It can contain duplicate elements.
// It is non synchronized.
// It can be used as List, Stack, Queue.

import java.util.*;

class Book{
	String subject;
	String bname;
	String author;
	int price;
	
	Book(String sub, String bname, String author, int price){
		this.subject = sub;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
}

class TestLinkedList{
	public static void main(String args[]){
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		ll.add(3, 100);	// will add 100 at index 3
		
		// Adding element in the beginning 
		
		ll.addFirst(0);

		// Adding element at the end

		ll.addLast(1000);
		
		// Iterator i = ll.iterator();
		
		// while(i.hasNext()){
		//	System.out.println(i.next());
		// }
		
		// We can also use foreach loop for traversing in linked list
		
		// for(Object o: ll){
		// 	System.out.println(o);
		// }
		
		// We can also reverse the elements in the list
		
		// Iterator i = ll.descendingIterator();	// Will start from the end
		
		// while(i.hasNext()){
		//	System.out.println(i.next());
		// }
		
		// Removing Specific element from the list(can also specify index)
		
		// ll.remove(0);
		
		// Removing all elements from the list
		
		// ll.clear();
		
		// Removing first element from the list
		
		// ll.removeFirst();
		
		// Removing last elements from the list
		
		// ll.removeLast();
		
		// We can also add user defined objects in the LinkedList
		
		Book b1 = new Book("Java", "Java The Complete Reference", "Herbert Schildt", 600);
		Book b2 = new Book("Python", "Automate the boring stuff with python", "AI Sweigart", 1700);
		Book b3 = new Book("C++", "Object Oriented Programming C++", "E Balagurusamy", 350);
		
		LinkedList<Book> lbook = new LinkedList<Book>();
		lbook.add(b1);
		lbook.add(b2);
		lbook.add(b3);
		
		for(Book bb: lbook){
				System.out.println(bb.subject);
		}
	}
}

// NOTE: Most of the methods in ArrayList and LinkedList are similar