class A{
	A(){
		System.out.println("Class A constructor");
	}
}

class B extends A{
	B(){
		System.out.println("class b constructor");
	}
	
	public static void main(String args[]){
		A a = new B();
		System.out.println(a instanceof A);
	}
}