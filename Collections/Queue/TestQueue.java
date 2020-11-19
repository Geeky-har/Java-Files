// The java Queue orders the elements in FIFO manner
// PriorityQueue class provides the facility of Queue
// PriorityQueue does not orders the elements into FIFO manner

import java.util.*;

class TestQueue{
	public static void main(String args[]){
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.add("Harsh");
		q.add("Petek");
		q.add("Aditya");
		q.add("Shivam");
		q.add("Abhishek");
		
		System.out.println("HEAD: " + q.element());		// both the methods returns the first element in the queue but it does not pop the elements
		
		q.remove();	// will remove the first element
		
		System.out.println("HEAD: " + q.peek());
		
		q.poll();	// will remove the first element
		
		System.out.println("Elements in the after above operation are: ");
		
		Iterator i = q.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}

/* Important methods of PriorityQueue class
   boolean add() - insert element in the queue
   Object remove() - used to remove and retrieve the head of the queue(first element)
   Object poll() - used to remove and retrieve the head of the queue(first element)
   Object element - retrieve, but doesnt remove the head of the queue
   Object peek() - retrieve but does not remove the head of the queue
   
*/