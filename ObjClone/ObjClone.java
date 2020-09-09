// import java.lang.*;

class ObjClone implements Cloneable{
	String name;
	int emp_id;
	
	ObjClone(String name, int emp_id){
		this.name = name;
		this.emp_id = emp_id;
	}
	
	public Object clone()throws CloneNotSupportedException{ return super.clone(); }
	
	public static void main(String args[]){
		try{
			ObjClone oc = new ObjClone("harsh", 1001);
			ObjClone oc1 = (ObjClone)oc.clone();
			
			System.out.println("Name is: " + oc.name + " and employee id is: " + oc.emp_id);
			System.out.println("Name is: " + oc1.name + " and employee id is: " + oc1.emp_id);
		}catch(CloneNotSupportedException c){}
	}
}