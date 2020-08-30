package NonRecursive;
import java.util.*;

class Factorial{
	private int n, val = 1;
	
	public Factorial(int n){ this.n = n;}
	
	public void show(){
		while(n > 0){
			val = val * n;
			n -= 1;
		}
		
		System.out.println("Factorial of is " + val);
	}
	
	public static void main(String args[]){
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find factorial");
		num = sc.nextInt();
		
		Factorial fc = new Factorial(num);
		fc.show();
	}
}