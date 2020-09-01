final class Q{		// final class cannot be inherited
	Q(){
		System.out.println("This class canonot be inherited");
	}
}

class P{
	int b = 30;
	final void func(){	// final function can be inherited but cannot be overidden
		System.out.println("The value of b is: " + b);
	}
}

class A extends P{
	final int a;	// final keyword.
	A(int a){ 
		this.a = a; // can only be initialized in a constructor.
		System.out.println("The value is: " + a);
		func();
	}
	
	public static void main(String args[]){
		A a = new A(20);
		P p = new P();
	}
}