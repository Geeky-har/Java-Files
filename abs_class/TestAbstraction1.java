abstract class Bank{
	abstract int getInt();
}

class SBI extends Bank{
	int getInt(){ return 6;}
}

class ICICI extends Bank{
	int getInt(){ return 4;}
}

class PNB extends Bank{
	int getInt(){ return 2;}
}

class RunBank{
	public static void main(String args[]){
		Bank b1 = new SBI();
		System.out.println("The rate of intrest in SBI is: " + b1.getInt());
	}
}