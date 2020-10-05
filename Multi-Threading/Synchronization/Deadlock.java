/* Deadlock is a condition in which a thread(t1) is waiting for a resource which is acquired by
another thread(t2), and t2 is waiting for a resource which is acquired by t1. In this way process 
goes in a deadlock state.	*/

public class Deadlock{
	public static void main(String args[]){
		final String RESOURCE1 = "1st Resource";
		final String RESOURCE2 = "2nd Resource";
		
		Thread t1 = new Thread(){
			public void run(){
				synchronized(RESOURCE1){	// Thread t1 takes Resource1(through sync block) 
					System.out.println("Thread 1, acquired resource 1");
					
					try{					
						Thread.sleep(300);	// Thread in waiting state (Thread wil switch to t2)
					}catch(Exception e){}	
				
					synchronized(RESOURCE2){	// this wont execute as resource2 is acquired by t2
						System.out.println("Thread 1, acquired resource 2");
					}
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				synchronized(RESOURCE2){	// Thread t2 takes resource t2(through sync block)
					System.out.println("Thread 2, acquired resource 2");
					
					try{
						Thread.sleep(300);	// Thread in waiting state (Thread wil switch to t1)
					}catch(Exception e){}
				
					synchronized(RESOURCE1){	// this wont execute as resource1 is acquired by t1
						System.out.println("Thread 2, acquired resource 1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}