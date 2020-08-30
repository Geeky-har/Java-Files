class Child{
	public void message(){
		System.out.println("This is a base class, welcome!");
	}

static class Parent extends Child{
	public void message(){ System.out.println("This is derived class, welcome!");}
	public void display(){
		message();
		super.message();
	}
}
	
	public static void main(String args[]){
	Parent c = new Parent();
	c.display();
	}
}