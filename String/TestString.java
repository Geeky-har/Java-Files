// string comparision :

class TestString{
	public static void main(String args[]){
		String s1 = "Sachin";
		String s2 = "SACHIN";
		String s3 = "Sachin";
		String s4 = new String("Sachin");
		
		
		// System.out.println(s1.equals(s2));	// not ignore case
		// System.out.println(s1.equalsIgnoreCase(s2));	// ignore case
		
		// == compares the references 
		
		// System.out.println(s1 == s3);	// true bcz share same ref
		// System.out.println(s1 == s4);	// false bcz value same but diff ref
		
		// compareTo(): if s1 == s2 return 0; else if(s1 > s2) return +ve; else return -ve
		
		// System.out.println(s1.compareTo(s2));
		
		// String concatenation(+, concat())
		
		// System.out.println(s1 + " Tendulkar");	// becomes: (new StringBuilder()).append("Sachin).append("Tendulkar").toString();
		
		// "+" operator can also concat primitive types
		
		String s = 20 + 10 + " bye" + 100 + 200;	// after a string literal + will concat
		
		// System.out.println(s); 	// 30 bye 100200
		
		//concat() method
		
		String y = " mahan";
		
		// System.out.println(s1.concat(y));	// join the strings
		
		// substring
		
		// System.out.println(s1.substring(2));	// start from 2 index
		
		// System.out.println(s1.substring(2, 6));	// will exclude 5 index
		
		// String class methods :
		
		/*
			1. toUpperCase() and toLowerCase() - transfor all char to upper/lower
			2. trim()	- removes white space from starting and ending
			3. startsWith() and endsWith() - return true if string start/end with specific char/string
			4. charAt() - returns char at secified index
			5. length() - returns length
			6. intern() - if object not present in string const pool the newly added string ref returned, otherwise string from the pool is returned
			7. valueOf() - converts to string(given as arg)
			8. replace() - replace the string with string given as second arg
		
		*/
		
		String sl = "Harsh is bad, Harsh is worst";
		String sm = sl.replace("Harsh", "Parsh");	// example of replace()
		System.out.println(sm);

	}
}