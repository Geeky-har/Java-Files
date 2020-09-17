class CopyCons{
	int id;
	String name;
	
	CopyCons(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	CopyCons(CopyCons cp){
		id = cp.id;
		name = cp.name;
	}
	
	CopyCons(){}
	
	void disp(){
		System.out.println("id: " + id + " name: " + name);
	}
	
	public static void main(String args[]){
		CopyCons cpy1 = new CopyCons(1001, "harsh negi");
		cpy2.id = cpy1.id;  (alternative way)
		cpy2.name = cpy1.name;  (alternative way)
		cpy1.disp();
		cpy2.disp();

	}
}





