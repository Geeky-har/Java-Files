package FibonacciIterative;
import java.util.*;
class fibonacci{
	// printing n fibonacci numbers in the console
	
	public static void main(String args[]){
		int num1 = 1, num2 = 1, sum = 0, i, n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of n: ");
		
		n = sc.nextInt();
		
		for(i=1; i<=n; i++){
			if(i == 1)
				System.out.print(num1 + " ");
			
			else if(i == 2)
				System.out.print(num2 + " ");
			
			else{
				sum = num1 + num2;
				System.out.print(sum + " ");
				num1 = num2;
				num2 = sum;
		}
	}
		
}}