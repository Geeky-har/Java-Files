// Stack class in java extends vector class
// It represents the LIFO stack of objects

import java.util.*;

class TestStack{
	public static void main(String args[]){
		Stack<String> st = new Stack<>();
		
		st.push("Harsh");
		st.push("Vishal");
		st.push("Monika");
		st.push("Yogesh");
		st.push("Rajesh Sir");
		
		Iterator itr = st.iterator();
		
		while(itr.hasNext()){
			Object val = itr.next();
			System.out.println(val);
		}
		
		System.out.println("Is the stack empty?? " + st.empty());
		
		String key = "chacha";
		
		if(st.search(key) >= 0){
			System.out.println("Found at position: " + st.search(key));
		}
		
		else{
			System.out.println(key + " not found!! ");
		}
	}
}

/* Important methods of Stack:
   boolean empty() - checks if stack empty or not
   void push() - To insert element in the stack
   E pop() - removes element from the top
   E peek() - returns the top element without removing iterator
   int search() - searches the specified object and returns the position of the object, if not found returns -1
   
*/