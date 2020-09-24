// a class that is declared inside a method is called local inner class

class TestLocalClass{
	private int h = 100;
	void method(){
		class InnerClass{	// Local Inner Class
			
			void msg(){
				System.out.println("Hello this is Local Inner Class");
				System.out.println("The private data in the outer class is: " + h);
			}
		}
		
		InnerClass ic = new InnerClass();	// The object of Inner class should be created inside the method only
		ic.msg();
	}
	
	public static void main(String args[]){
		TestLocalClass t1 = new TestLocalClass();	// create instance of outer class
		t1.method();	// method inside inner class will be invoked automatically
	}
}