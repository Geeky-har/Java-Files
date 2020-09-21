import java.util.Scanner;

class StdinStdout{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double d = sc.nextDouble();
		sc.nextLine();		// wrote this to clear the inputBuffer
		String s = sc.nextLine();
		
		System.out.println("Integer Value: " + a);
		System.out.println("Double Value: " + d);
		System.out.println("String Value: " + s);

	}
}