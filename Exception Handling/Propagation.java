// unchecked exceptions are propagated by default
// propagation means the forwarding of exceptions in the call stack(from one method to another)

class Propagation{
	void a(){
		int t = 20/0;
	}
	
	void b(){
		a();
	}
	
	void c(){
		try{
			b();	
		}catch(Exception e){
			System.out.println("Exception Handled!");
		}
	}
	
	public static void main(String args[]){
		Propagation p = new Propagation();
		p.c();
		System.out.println("Important code!!");
	}
}

// Note: Checked(RunTime) exceptions are not propagated by default, we use throws keyword for that purpose