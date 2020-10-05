import java.util.Scanner;

class Customer{
	int amt = 10000;	// Initial Amount
	
	synchronized void withdrawl(int amt){	// methods recieves the amt to withdraw
		System.out.println("Going to withdraw "+ amt);
		
		if(this.amt < amt){		// If amount in the object is less than amount to be withdrawn
			System.out.println("Less Balance...Waiting for deposit");
			
			try{
				wait();			// it will release the lock and control went to Thread2(deposit)
			}catch(Exception e){}
		}
		
		// When amount is submitted

		this.amt -= amt;	// amount is deducted
		System.out.println("Withdrawl done of amount "+ amt);
		System.out.println("Balance left: "+this.amt);

	}
	
	synchronized void deposit(int amt){		// methods recieves the amt to deposit
		System.out.println("Depositing the amount "+amt);
		this.amt += amt;	// will add the amount
		System.out.println("Deposit successful of amount "+amt);
		notify();	// will release the lock of Withdrawl Thread
	}
}

class InterThreadComm{
	public static void main(String args[]){
		int option;
		Scanner sc = new Scanner(System.in);
			
			Customer c = new Customer();
			
			new Thread(){		// Thread for withdrawl
				public void run(){
					//System.out.println("Enter the withdrawl amount: ");
					//int a = sc.nextInt();
					c.withdrawl(11000);
				}
			}.start();
		
			new Thread(){		// Thread for Deposit
				public void run(){
					//System.out.println("Enter the deposit amount: ");
					//int b = sc.nextInt();
					c.deposit(2000);
				}
			}.start();
				
	}
}