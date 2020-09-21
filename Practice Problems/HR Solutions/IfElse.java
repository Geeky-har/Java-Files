import java.util.Scanner;

class IfElse{
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		if(n % 2 != 0) { System.out.println("Weird"); }
		
		else if(n % 2 == 0 && n >= 2 && n <= 5) { System.out.println("Not Weird"); }
		
		else if(n % 2 == 0 && n >= 6 && n <= 20) { System.out.println("Weird"); }
		
		else { System.out.println("Not Weird"); }
	}
}