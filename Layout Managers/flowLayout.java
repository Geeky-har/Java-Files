import java.awt.*;
import javax.swing.*;

class FlowLayoutEx{
	JFrame f;
	
	FlowLayoutEx(){
		f = new JFrame("Flow Layout Example");
		
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		
		f.add(b1); f.add(b2); f.add(b3); f.add(b4);
		
		f.setSize(400, 400);
		f.setLayout(new FlowLayout(FlowLayout.RIGHT));
		f.setVisible(true);
	}
	
	public static void main(String args[]){
		new FlowLayoutEx();
	}
}
