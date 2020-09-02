/* abstract class in java is a class which have a abstract method, which should
be overriden(or implemented) by its sub class.
It can have non abstract member functions and a constructor too
*/

abstract class Bike{	// abstract class
	Bike(){				// abstract class constructor
		System.out.println("abstract class constructor!");
	}
	abstract void run();	// abstract method
	void absMethod(){		// abstract class implemented method(instance method)
		System.out.println("abstract class method!");
	}
}

class Hero extends Bike{	// Hero inherited Bike(which is abstract)
	void run(){				// abstract method implemented(overriden)
		System.out.println("abstract method implemented!");
	}
	
	public static void main(String args[]){
		Hero h = new Hero();
		h.absMethod();
		h.run();
		
	}
}