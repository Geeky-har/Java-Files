class ArrCopy{
	public static void main(String args[]){
		
		// System.out.println("Enter the size of the array: ")
		char arr1[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		
		char arr2[] = new char[7];
		
		arr2[0] = 'a';
		
		arr2[1] = 'b';
		
		System.arraycopy(arr1, 2, arr2, 2, 5);	// args: Initial Array, starting postion(in initial array), destination array, destination array starting pos, total length
		
		System.out.println("The elements in the second array are: ");
		
		// for(int i = 0; i<5; i++){
			// System.out.print(arr1[i] + " ");
		// }
		
		System.out.println(new String(arr2));
 	}
}