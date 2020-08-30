public class InstInitBlock{
	InstInitBlock(){
		System.out.println("Parent Class COnstructor here!!");
	}

	static class SubClass extends InstInitBlock{
		SubClass(){
			// super();
			System.out.println("Child class constructor here!!");
		}
		
		SubClass(int n){
			System.out.println("parameterized Contructor invoked.. value passed is: " + n);
		}
		
		{ System.out.println("Initializer block here!!"); }	// it will copied to the contructor after the super method and then the contructor body will execute.
		
		
	}
		
		public static void main(String[] args){
			SubClass s = new SubClass();
			SubClass s1 = new SubClass(10);
		}
}