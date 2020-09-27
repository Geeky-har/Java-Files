/* creating thread with the runnable interface is more beneficial bcz we can do multiple inheritance
using interface
*/

/*class Thread1 implements Runnable{		// class thread 1
	public void run(){
		for(int i = 1; i <= 10; ++i){
			System.out.println("This is thread 1, iteration number: " + i);
		}
	}
}

class Thread2 implements Runnable{		// class thread 2
	public void run(){
		for(int i = 1; i <= 10; ++i){
			System.out.println("This is thread 2, iteration number: " + i);
		}
	}
}

public class Example1{
	
	public static void main(String args[]){
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread2());
		t1.start();
		t2.start();
	}
}

*/

//creating threads using Thread class(not feasable)

class Thread1 extends Thread{		// class thread 1
	public void run(){
		for(int i = 1; i <= 10; ++i){
			try{
				Thread.sleep(500);		// sleep will halt the execution of a thread for a specific time
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println("This is thread 1, iteration number: " + i);
		}
	}
}

class Thread2 extends Thread{		// class thread 2
	public void run(){
		for(int i = 1; i <= 10; ++i){
			try{
				Thread.sleep(1000);		// sleep will halt the execution of a thread for a specific time
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println("This is thread 2, iteration number: " + i);
		}
	}
}

public class Example1{
	
	public static void main(String args[]){
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}