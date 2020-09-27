// setPriority() - sets a priority for a thread(min, norm, max)
// daemon thread - It is a service provider thread that provides services to the user thread.
// Two methods for daemon thread: setDaemon(), isDaemon()

/* NOTE: Threads are scheduled on the basis of priorities but its not guranteedd that thread with
		 maximum priority will run first as it depends on JVM specifications  */
		 
/* NOTE: daemon threads are meant for providing service to the user thread, when user thread dies 
		 daemon threads also gets terminated  */

class Thread1 extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){		// checking if it is daemon or not
			System.out.println("Daemon thread running...");
		}
		
		System.out.println("Thread with minimum priority! " + Thread.currentThread().getPriority());
	}
}


class Thread2 extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Daemon thread running...");
		}
		
		System.out.println("Thread with normal priority! " + Thread.currentThread().getPriority());
	}
}

class Thread3 extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Daemon thread running...");
		}
		
		System.out.println("Thread with maximum priority! " + Thread.currentThread().getPriority());
	}
}

class Example3{
	public static void main(String args[]){
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		t1.setPriority(Thread.MIN_PRIORITY);	// sets minimum(1) priority for a thread
		t2.setPriority(Thread.NORM_PRIORITY);	// sets normal(5) priority for a thread
		t3.setPriority(Thread.MAX_PRIORITY);	// sets maximum(10) priority for a thread
		
		t1.setDaemon(true);	//setting t1 as daemon thread
		
		t1.start();
		t2.start();
		t3.start();

	}
}