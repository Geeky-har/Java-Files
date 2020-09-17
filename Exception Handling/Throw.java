import java.util.Random;		// class for generating a random number

class Throw{
	static void checks(int age){
		if(age < 18){
			throw new ArithmeticException("NOT ALLOWED!!!");
		}
		else{
			System.out.println("Swagat hai aapka!");
		}
	}
	public static void main(String args[]){
		Random rand = new Random();
		
		int age = rand.nextInt(50);		// generates number between 10-50 
		
		System.out.println("The age generated is: " + age);
		checks(age);
		
		System.out.println("Outside code");		// this will only execute if throw wont execute
	}
}