// an interface inside an interface or a class is called nested interface
// nested interface are static by default
// if defined in a interface nested interface should be public

interface Displayable{
	interface Printable{
		void print();
	}
}

class NestedInterface implements Displayable.Printable{		// refered by the outer interface name
	public void print(){
		System.out.println("Hello, this is nested interface using Interface");
	}
	
	public static void main(String args[]){
		Displayable.Printable ni = new NestedInterface();	// upcasting required
		ni.print();
	}
}

// Example of Nested interface in a class

class A{
	interface showable{
		void show();
	}
}

class TestClassNestedInterface implements A.showable{
	public void show(){
		System.out.println("hello, this is nested interface using Class");
	}
	
	public static void main(String args[]){
		A.showable obj = new TestClassNestedInterface();	// upcasting required
		obj.show();
	}
}
