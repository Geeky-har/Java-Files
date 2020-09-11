class StaticM{
	static String clg = "NDIIT";
	String name;
	
	static void change(){
		clg = "IITM";
	}
	
	StaticM(String name){
		this.name = name;
	}
	
	void disp(){
		System.out.println("Name: " + name + " college: " + clg);
	}
	
	public static void main(String args[]){
		StaticM.change();
		StaticM s1 = new StaticM("harsh");
		StaticM s2 = new StaticM("parsh");
		StaticM s3 = new StaticM("charsh");
		s1.disp();
		s2.disp();
		s3.disp();
	}
	
}