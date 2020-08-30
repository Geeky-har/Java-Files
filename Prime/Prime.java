import java.util.*;
class Prime{
	public static class chk_prime{
		private int n, i;
		public chk_prime(int n){ this.n = n;}
		
		public void show(){
		
			for(i=2; i<n/2; i++){
				if(n%i == 0){
					System.out.println(n + " is not a prime number!");
					break;
				}
			}
			if(i == n/2)
				System.out.println(n + "is a prime number");
		}
	}
	
	public static void main(String args[]){
		int num;
		
		System.out.print("Enter the number that you want ot check: ");
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		chk_prime ch = new chk_prime(num);
		ch.show();
	}
}