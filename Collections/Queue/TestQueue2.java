// In this program we will be implementing the Queue DS which will follow the FIFO fashion

import java.util.*;

class TestQueue2{
	public static void main(String args[]){
		
		Queue<Integer> qu = new LinkedList<>();
		
		for(int i = 1; i <= 10; i++){
			qu.add(i);
		}
		
		System.out.println("All the elements in the queue right now are: ");

		System.out.println(qu);
		
		System.out.println("The first element in the queue is: " + qu.peek());
		
		// Now we will pop the first element from the queue
		
		qu.poll();
		
		System.out.println("All the elements in the queue right now are: ");
		
		System.out.println(qu);
		
		// Now we are adding one more element in our queue
		
		System.out.println("Now adding 11 in the queue!");
		
		qu.add(11);
		
		System.out.println("The first element in the queue is: " + qu.peek());
		
		System.out.println("All the elements in the queue right now are: ");
		
		System.out.println(qu);
	}
}