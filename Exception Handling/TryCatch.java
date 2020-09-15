// In here we will perform exception handling with arithmetic exception

class TryCatch{
	public static void main(String args[]){
		//try{
			//int data = 50/0; 	// will throw exception
			//System.out.println("Hulu");		// this wont execute since exception has occured above
		//}
		// catch(ArithmeticException e){	
			// System.out.println(e);
		// }
		//catch(Exception e){		// custom error message
			//System.out.println("Divide by zero condition");
		//}
		
		//System.out.println("Important code! should execute");
		
		//try{
			//String s = null;	// will throw null poinetr exception
			//System.out.println(s.length());
		//}
		//catch(NullPointerException e){
			//System.out.println("Exception occured: " + e);
		//}
		
		//try{
			//int a[] = new int[5];	// will throw Array Index out of bound exception
			//a[5] = 10;
			
		//}
		//catch(ArrayIndexOutOfBoundsException e){
			//System.out.println(e);
		//}
		//try{
			//int s = 10/0;		// when jvm reads this line it will get out of try block
			//String s1 = null;	// this wont be read by the jvm
			//System.out.println(s1.length());
		//}
		//catch(NullPointerException e){		// In case of multiple catch blocks, catch blocks having 
			//System.out.println(e);			// specific classes should placed first and then the general catch block is placed at the last
		//}
		//catch(Exception e){
			//System.out.println("Cust Exception");
		//}
		
		// Java nested try blocks
		
		try{  
			try{    
				 int b =39/0;  								// this try block will be resolved
			}catch(ArithmeticException e){System.out.println(e);}  // wont disrupt the flow of parent try block
		   
			try{  
				int a[]=new int[5];  						// this try block will be resolved
				a[5]=4;  
			}catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  // wont disrupt the flow of parent try block
			 
			int c = 10/0; 		// this raise error and the flow of parent try block will be disrupted and the control will jump to catch block of parent try
			 
			System.out.println("other statement");		// this wont be executed
			
		}catch(Exception e){System.out.println("handeled");}  	// parent try block exception handled
   
		
		System.out.println("Important code! should execute");
	}
}