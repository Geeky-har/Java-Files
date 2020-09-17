import java.util.Scanner;

class InvalidUser extends Exception{
	public InvalidUser(String s){
		super(s);
	}
}

class TestCustEx{
	static void check(String s1)throws InvalidUser{
		//s1 = s1.toLowerCase();
		
		if(s1.equalsIgnoreCase("harsh")){
			System.out.println("Welcome harsh");
		}
		
		else{
			throw new InvalidUser("You are not a valid user " + s1);
		}
	}
	
	public static void main(String args[]){
		try{
			String name;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name: ");
			name = sc.nextLine();
			check(name);
			
		}catch(Exception e){
			System.out.println("Exception occured: " + e);
		}
		
		System.out.println("Rest of the code!");
		
	}
}