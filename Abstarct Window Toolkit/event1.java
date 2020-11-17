import java.awt.*;
import java.awt.event.*;

class MyEvent extends Frame implements ActionListener{
	TextField tf;
	MyEvent(){
		// Will create our components
		
		tf = new TextField();
		tf.setBounds(60, 50, 200, 20);
		Button b = new Button("Click Here!!");
		Button b2 = new Button("Click Here, please!!");

		b.setBounds(100, 120, 80, 30);
		b2.setBounds(100, 150, 100, 30);

		
		// Will register the listener
		
		b.addActionListener(this); // will pass current object instance
		b2.addActionListener(this);
		
		// Will add the components and set size
		add(tf);
		add(b);
		add(b2);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
	
	// Now we will write the implementation of our event
	
	public void actionPerformed(ActionEvent e){
		tf.setText("Thanks for clicking me!!");
	}
	
	public static void main(String args[]){
		new MyEvent();	// this will invoke the constructor
	}
}