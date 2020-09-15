// there will always be one finally block in the program

class TryFinally{
	public static void main(String args[]){
		//try{
			//int a = 19/0;		// exception will occur
		//}
		//catch(ArrayIndexOutOfBoundsException e){	// wrong class used for exception
			//System.out.println(e);					// the jvm wont execue the cacth block
		//}
		//finally{				// finally block always executes!!
			//System.out.println("This will always execute");
		//}						// after finally block the program will terminate with error
		
		//System.out.println("Outside code");		// this wont execute
		
		try{
			int a[] = new int[5];		// exception occured
			a[5] = 10;
		}
		catch(ArrayIndexOutOfBoundsException e){	// appropriate class called for handling the exception
			System.out.println(e);
		}
		finally{						// finally block always executes
			System.out.println("This block will always execute(finally block)");
		}
		
		System.out.println("Outside code!");	// this will also execute as flow of the program is smooth without any disruptions

	}
}