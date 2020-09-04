// In this program we are calculating the percentage of a student

import java.util.*;

class PercentCalc{
	private int n_sub, total = 0, i, sub, max_marks;
	private float per;
	
	PercentCalc(int n){ 
		this.n_sub = n;
		this.max_marks = n_sub*100;
	}
	
	void showTotal(){
		Scanner s = new Scanner(System.in);
		
		for(i = 1; i <= n_sub; i++){
			System.out.println("Enter the marks of subject " + i);
			
			sub = s.nextInt();
			total += sub;
		}
		
		per = (float)total/(float)max_marks;
		
		System.out.println("Your Percentage is: " + per*100 + "%");
	}
	
	public static void main(String args[]){
		int n = 5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of subjects you have: ");
		
		n = sc.nextInt();
		
		PercentCalc pc = new PercentCalc(n);
		pc.showTotal();
	}
}