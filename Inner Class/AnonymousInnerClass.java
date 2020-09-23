// anonymous class dont have any name, the jvm decides the name for that class
// It should be used when you want to override a method in a interface or a abstract class

abstract class Drive{
	abstract void car();
	abstract void truck();
}

interface Code{
	void cpp();
	void java();
	void python();
}

class TestAnonymousClass{
	public static void main(String args[]){
		Drive d1 = new Drive(){		// declaration and definition of Anonymous Class
			void car(){
				System.out.println("Hello, i am driving a car!");
			}
			
			void truck(){
				System.out.println("Hello, i am driving a truck!");
			}
		};
		
		System.out.println("Methods of Drive class are: ");
		
		d1.truck();
		d1.car();
		
		Code c1 = new Code(){
			public void cpp(){
				System.out.println("Hello I am coding in c++");
			}
			
			public void java(){
				System.out.println("Hello, I am coding in java");
			}
			
			public void python(){
				System.out.println("Hello I am coding in python");
			}
		};
		System.out.println("\nMethods of Code class are: ");
		
		c1.cpp();
		c1.java();
		c1.python();

	}
}