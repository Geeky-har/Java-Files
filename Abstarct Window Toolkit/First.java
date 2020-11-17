// This program will display a static button on a frame

import java.awt.*;

class First extends Frame{	// This our container class(Frame is one of Containers type)
	First(){
		Button b = new Button("Click Here!");	// Button constructor takes the value to be displayed
		b.setBounds(80, 100, 100, 50);	// setBounds() will set dimentions and size of the button
		add(b);	// add() method will add the button in the frame
		setSize(250, 250); // will set the size of the frame
		setLayout(null);
		setVisible(true); 	// visibility by default is false
	}
	
	public static void main(String args[]){
		First f = new First();
	}
}

/* The above program can be implemented with association of the Frame class as well in that case
we wont extend the Frame class.. instead we will create an object of Frame class inside the
constructor and will call all the methods associated with Frame by class by using the object
of the Frame class(like: f.add(), f.setVisible())

The container (in this case Frame) can further be divided into sections called panels.
We can use add() to add those panels into the Frame created
*/

