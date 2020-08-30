import java.lang.Math;  // Math.pow(a, b); s.length(); toString(a)
import java.util.*;
class Armstrong{
	private int n, size, total = 0, n1, rem = 0;
	
	public Armstrong(int n, int size){
		this.n = n;
		this.size = size;
	}
	
	public void show(){
		n1 = n;
		while(n1 > 0){
			rem = n1 % 10;
			total += Math.pow(rem, size);
			n1 /= 10;
		}
		
		if(total == n) System.out.println(n + " is a Armstrong number");
		
		else System.out.println(n + " is not a Armstrong number");
	}
	
	public static void main(String args[]){
		int num, size;
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		num = sc.nextInt();
		
		str = Integer.toString(num);
		size = str.length();
		
		Armstrong arm = new Armstrong(num, size);
		arm.show();
		
	}
}