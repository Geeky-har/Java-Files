interface I1{}	// an interface

class A implements I1{		// class A implements I1
	public void a(){
		System.out.println("Reference variable have A class object");
	}
}

class B implements I1{		// // class B implements I1
	public void b(){
		System.out.println("Reference variable have B class object");
	}
}

class Call{			// class for performing downcasting
	static void invoke(I1 i){		// invoke will get refernce of Interface
		if(i instanceof A){			// if interface have object of A class
			A a = (A)i;				// downcasting performed
			a.a();					// class A function called with its object
		}
		
		if(i instanceof B){			// if interface have object of B class
			B b = (B)i;				// downcasting performed
			b.b();					// class B function called with its object
		}
	}
}

class Ex{
	public static void main(String args[]){
		I1 obj_i = new B();			// reference variable of I1 have class A object		
		Call.invoke(obj_i);			
	}
}