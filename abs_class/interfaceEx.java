interface Inter{	// interafce Inter
	void a();
	void b();		// all default access modifier methods
	void c();
	void d();
}

// abstract class inherits all the methods declared in the interface
abstract class Abs implements Inter{	// abstract class implements Inter
	public void b(){					// public access modifier(default in Inter)
		System.out.println("This is b method defined in abstract class");
	}
}

class Ext extends Abs{		// Ext class inherits Abstract class
	public void a(){
		System.out.println("This is a method defined in main class!");
	}
	
	public void c(){
		System.out.println("This is c method defined in main class!");
	} 
	
	public void d(){
		System.out.println("This is d method defined in main class!");
	} 
}

class Run{
	public static void main(String args[]){
		Ext ex = new Ext();
		ex.a();
		ex.b();
		ex.c();
		ex.d();

}
}