package secondary;
import Hello.*;
import secondary.Extend;

public class Secondary{
	public static void main(String args[]){
		Main m = new Main();
		Main2 m2 = new Main2();
		Extend ex = new Extend();

		m.fun();
		m2.fun2();
		ex.abstractMethod();
		ex.abstractMethod2();

		// System.out.println("Hello, test successfull");
	}
}