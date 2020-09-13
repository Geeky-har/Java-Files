// Java String buffer is very similar to the String class, except that it is mutable

class TestStringBuffer{
	public static void main(String args[]){
		
		// concat String Buffer
		
		StringBuffer st1 = new StringBuffer("Hello");
		
		// st1.append(" World");	// will change the original string
		// System.out.println(st1);
		
		// insert() - inserts given string it specific position\
		
		// st1.insert(2, "java");	// will put after 1 index  
		// System.out.println(st1);
		
		// replace() - will replace the string from the specified indexes(takes 3 args)
		
		// st1.replace(0, 3, "World");		// will replace the string starting index 0 to index 3(second args excluded)
		// System.out.println(st1);
		
		// delete() - deleted string from specifc indexes
		
		// st1.delete(0, 3);	// second args excluded
		// System.out.println(st1);
		
		// reverse() - it reverses the current string
		
		// st1.reverse();
		// System.out.println(st1);
		
		//capacity() - default capacity is 16, after that length of each element in String will add to 16
		
		StringBuffer st2 = new StringBuffer("java is my favourite language");
		StringBuffer st3 = new StringBuffer();
		
		// System.out.println(st3.capacity());		// return 16
		// System.out.println(st2.capacity());		// return 45
		// System.out.println(st1.capacity());		// return 21
		
	}
}