// A static class defined and declared inside a class is called static nested class
// It cannot access non static memebers (ie. variables and methods) of the outer class.

class StaticNestedClass{
	private static int a = 90;
	
	static class ABC{	// static nested class
	
		void msg(){			// non static (instance method of nested class)
			System.out.println("This is static nested class");
			System.out.println("Private data of outer class is: " + a);
		}
		
		static void msg2(){	// static method of instance class
			System.out.println("This is static nested class and static method");
			System.out.println("Private data of outer class is: " + a);
		}
	}
	
	public static void main(String args[]){
		StaticNestedClass.ABC obj = new StaticNestedClass.ABC();	// no need to instantiate outer class since nested class is static
		obj.msg();		// will call the msg method because it is a instance method (not static)
		
		StaticNestedClass.ABC.msg2();	// for static method no need for object creation
	}
}