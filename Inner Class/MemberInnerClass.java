// a non static class which is declared inside a class but outside a method is called memeber inner class

class TestInnerClass{
	private int a = 100;
	
	class InnerClass{
		void msg(){
			System.out.println("This is inner class");
			System.out.println("Private data member accessed " + a);	// It can also access private data

		}
	}
	
	public static void main(String args[]){
		TestInnerClass t1 = new TestInnerClass();	// first create instance of outer class

		// after that using the instance of outer class create instance of inner class
		TestInnerClass.InnerClass t1I = t1.new InnerClass();
		t1I.msg();
	}
}