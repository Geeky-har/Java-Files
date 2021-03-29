import java.awt.*;
import javax.swing.*;

class GridLayoutEx{
	JFrame f;
	
	GridLayoutEx(){
		f = new JFrame("Grid Layout Example");
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setSize(400, 400);
		f.setLayout(new GridLayout(2, 2));
		f.setVisible(true);
	}
	
	public static void main(String args[]){
		new GridLayoutEx();
	}
}