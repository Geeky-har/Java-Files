import java.util.*;
class sample{
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to get its table: ");
		n = sc.nextInt();
		
		for(int i=1; i<=10; i++){
				System.out.println(n+ " x " + i + " = " + i*n);
		}
	}	
}