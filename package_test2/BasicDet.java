package Bdetails;

public class BasicDet{
	private String name, f_name, m_name;
	protected BasicDet(){
		this.name = "Harsh Negi";
		this.f_name = "Mr. Dalip Negi";
		this.m_name = "Late. Rama Negi";
	}
	
	public void printB(){
		System.out.println("My name is: " + name);
		System.out.println("My fathers name is: " + f_name);
		System.out.println("My mothers name is: " + m_name);
	}
}