class Banks{
	void getInterest(){
	System.out.println("0");	// absract method in Parent class
	}
}

class Sbi extends Banks{
	void getInterest(){			// method overriden(compile time poly)
		System.out.println("The rate of interest in SBI bank is: 8%");
	}
}

class Hdfc extends Banks{		
	void getInterest(){			// method overriden(compile time poly)
		System.out.println("The rate of interest in HDFC bank is: 10%");
	}
}

class Pnb extends Banks{
	void getInterest(){			// method overriden(compile time poly)
		System.out.println("The rate of interest in PNB bank is: 5%");
	}
}

class RunPoly{
	public static void main(String args[]){
		Banks b1 = new Sbi();
		Banks b2 = new Hdfc();
		Banks b3 = new Pnb();
		b1.getInterest();
		b2.getInterest();
		b3.getInterest();
	}
}