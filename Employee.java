class Employee{
	int id;
	String name;
	int age;

	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}

	Employee(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
}

	void disp(){
		System.out.println("id: " + id + " name: " + name + 	" age: " + age);
	}

	public static void main(String args[]){
		Employee emp1 = new Employee(450, "harsh");
		Employee emp2 = new Employee(451, "parsh", 23);
		emp1.disp();
		emp2.disp();
	}
}