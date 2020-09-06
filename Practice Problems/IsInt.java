import java.util.*;

class IsInt{
	public static void main(String args[]){
		int n;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		if(sc.hasNextInt()){	// return true if its of in 
			System.out.println("The input is of integer type!");
		}
		
		else{
			System.out.println("The input is not of integer type!");
		}
	}
}