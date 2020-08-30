import java.util.*;
class Palindrome{
	
	public static class Check{
		private int n, i, newNum = 0, rem = 0, n1;
		
		public Check(int n){ this.n = n;}
		
		public void showResult(){
			n1 = n;
			while(n1 > 0){
				rem = n1 % 10;
				newNum = newNum*10 + rem;
				n1 /= 10;
			}
			
			if(newNum == n) System.out.println(n + " is a palindrome number!");
			
			else System.out.println(n + " is not a palindrome number!");
		}
	}
	
	public static void main(String args[]){
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to check: ");
		num = sc.nextInt();
		
		Check ch = new Check(num);
		ch.showResult();
	}
}