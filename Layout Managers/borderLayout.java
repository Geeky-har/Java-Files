import java.awt.*;
import javax.swing.*;

class BorderLayoutEx{
	JFrame f;
	
	BorderLayoutEx(){
		f = new JFrame("Border Layout Example");
	
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		JButton b5 = new JButton("Button 5");

		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.EAST);
		f.add(b4, BorderLayout.WEST);
		f.add(b5, BorderLayout.CENTER);

		f.setSize(400, 400);
		f.setVisible(true);
	}
	
	public static void main(String args[]){
		new BorderLayoutEx();
	}
	
}