//join, setName, getName, currentThread

//join method waits for a thread to die

class A extends Thread{
	public void run(){
		System.out.println("Executing thread: " + Thread.currentThread().getName());	// gives reference of currently executing thread
		for(int i = 1; i <= 5; ++i){
			System.out.println("Thread 1");
		}
	}
}

class B extends Thread{
	public void run(){
		System.out.println("Executing thread: " + Thread.currentThread().getName());	// gives reference of currently executing thread
		for(int i = 1; i <= 5; ++i){
			System.out.println("Thread 2");
		}
	}
}

class Example2{
	public static void main(String args[]){
		A t1 = new A();
		B t2 = new B();
		
		System.out.println("name of thread t1 is: " + t1.getName());	//returns name of a thread()
		System.out.println("name of thread t2 is: " + t2.getName());
		System.out.println("Id of thread t1 is: " + t1.getId());		// returns id of a thread
		System.out.println("Changing name of t1.... ");
		t1.setName("Thread t1");		// sets the name of a thread
		System.out.println("name of thread t1 is: " + t1.getName());
		System.out.println("Changing name of t2.... ");
		t2.setName("Thread t2");
		System.out.println("name of thread t2 is: " + t2.getName());

		
		
		t1.start();
		//try{
			//t1.join(10000);		// join will waits for a thread to die
		//}catch(Exception e){
			//System.out.println(e);
		//}
		
		t2.start();			// this will execute only after the completion of t1 thread
	}
}