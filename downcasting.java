/* if we perform downcasting by type casting it will throw ClassCastException error
 at runtime: SubClass s = (SubClass) new SuperClass
 
 Now we will see how we can achieve downcasting with the help of instance of operator
*/

class SuperClass{
	SuperClass(){ System.out.println("SuperClass Constructor"); }
}

class SubClass extends SuperClass{
	SubClass(){ System.out.println("SubClass Constructor"); }
	
	static void convert(SuperClass s){
		//if(s instanceof SubClass){		// checking using instanceof operator
			SubClass s2 = (SubClass) s;	//downcasting achieved
			
			System.out.println("Downcasting achieved successfuly");
		}
	//}
	
	public static void main(String args[]){
		SuperClass s1 = new SubClass();		// the object should be of child class otherwise it will raise exception error
		SubClass.convert(s1);
	}
}

// we can also achieve the above program without the use of instanceof operator