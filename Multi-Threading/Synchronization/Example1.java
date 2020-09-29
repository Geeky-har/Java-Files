// synchronization prevents thread interference
/* if two threads share a resource(method in this case), then we should sync
 the threads and allow only one thread to execute at a time
*/

class Table{		// The class where the shared method is defined
	synchronized void printTable(int n){	// this method is shared and should have a synchronized keyword before it
		for(int i = 1; i <= 10; ++i){
			System.out.println(n + "*" + i + "=" + n*i);
			
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class TestThread extends Thread{	// thread 1
	Table t;
	
	TestThread(Table t){
		this.t = t;
	}
	
	public void run(){
		t.printTable(5);
	}
}

class TestThread2 extends Thread{	// thread 2
	Table t;
	
	TestThread2(Table t){
		this.t = t;
	}
	
	public void run(){
		t.printTable(10);
	}
}

public class Example1{
	public static void main(String args[]){
		Table t = new Table();
		TestThread t1 = new TestThread(t);
		TestThread2 t2 = new TestThread2(t);
		
		t1.start();
		t2.start();
	}
}


/* In the above case context switching will not take place and hence only one thread
will execute at a time.
*/

// NOTE: We can execute the above program with the help of annonymous class, which might 
// result in less number of lines

/*
public class Example1{
	public static void main(String args[]){
		Table t = new Table();
		
		Thread t1 = new Thread(){
			public void run(){
				t.printTable(5);
			}
		};		// semi-colon important in annonymous class
		
		Thread t2 = new Thread(){
			public void run(){
				t.printTable(10);
			}
		};		// semi-colon important in annonymous class
		
		t1.start();
		t2.start();
	}
}
*/