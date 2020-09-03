interface Inter{
	void a();
	void b();
	void c();
	void d();
}

abstract class Abs implements Inter{
	public void b(){
		System.out.println("This is b method defined in abstract class");
	}
}

class Ext extends Abs{
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