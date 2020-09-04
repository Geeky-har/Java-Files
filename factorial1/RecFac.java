package Recursive;
import java.util.*;

public class RecFac{
	public int getFac(int n){
		if(n > 0){
			return(n * getFac(n - 1) );
		}
		else
			return 1;
	}
	public static void main(String args[]){
		int num, val;
		System.out.println("Enter the number to find teh factorial: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		RecFac r = new RecFac();
		val = r.getFac(num);
		
		System.out.println("The factorial of " + " num" + " is: " + val);
	}
}