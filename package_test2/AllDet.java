package Adetails;
import Bdetails.BasicDet;

class AllDet extends BasicDet{
	private String address, clg;
	AllDet(){
		super();
		this.address = "G-56, INA Colony";
		this.clg = "NDIIT";
	}
	
	void printA(){
		printB();
		System.out.println("My address is: " + address);
		System.out.println("My college name is: " + clg);
	}
	
	public static void main(String args[]){
		AllDet a = new AllDet();
		a.printA();
	}
}