// Throws keyword is used to propagate the checked(runtime) exceptions..
// It provides information to the caller method about the exception

import java.io.IOException;

//class Throws {
	//void a() throws IOException{
	//	throw new IOException("System Exception");	// checked exception
	//}
	
	//void b() throws IOException{	// informing about the IO exception(declaring)
	//	a();
	//}
	
	//void c(){
	//	try{
	//		b();
	//	}catch(Exception e){
	//		System.out.println("Exception handled");
	//	}
	//}
	
	//public static void main(String args[]){
	//	Throws t = new Throws();
	//	t.c();
	//	System.out.println("Outside code");
	//}
//}

// case where we declare the exception


class Throws {
	void a() throws IOException{
		System.out.println("Device error");		// will execute if no exception occurs
	}
	
	public static void main(String args[]) throws IOException{
		Throws t = new Throws();
		t.a();
		System.out.println("Outside code");
	}
}
