import java.util.Scanner;

class MinArr{
	static int min(int arr[]){
	int min = arr[0], i;
	for(i = 0; i < arr.length; i++){
		if(arr[i] < min){
			min = arr[i];
		}
	}
	
	return min;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the elements in the array: ");
		for(int i = 0; i < n; i++){
			int item;
			item = sc.nextInt();
			arr[i] = item;
		}
		
		int m = min(arr);
		System.out.println("The minimum number is: " + m);
		
	}
}