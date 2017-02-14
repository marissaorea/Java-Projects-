import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;


public class AnAppletWithLayout extends Applet implements ActionListener {
	public void init() {
		setLayout(new GridLayout());

		topButton = new Button("Top");
		add(topButton, BorderLayout.NORTH);
		topButton.addActionListener(this);
	

		bottomButton = new Button("Bottom");
		add(bottomButton, BorderLayout.SOUTH);
		bottomButton.addActionListener(this);

		rightButton = new Button("Right");
		add(rightButton, BorderLayout.EAST);
		rightButton.addActionListener(this);

		leftButton = new Button("Left");
		add(leftButton, BorderLayout.WEST);
		leftButton.addActionListener(this);

		middleButton = new Button("Middle");
		add(middleButton, BorderLayout.CENTER);
		middleButton.addActionListener(this);
	};
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == topButton ){
		System.out.println("Top Button was pressed");
		}
	
		if (e.getSource() == bottomButton) {
		System.out.println("Bottom Button was pressed");
		}
		
		if(e.getSource() == rightButton) {
		System.out.println("Right Button was pressed");
		}
		
		if(e.getSource() == leftButton) {
		System.out.println("Left Button was pressed");
		}
		
		if(e.getSource() == middleButton) {
		System.out.println("Middle Button was pressed");
		}
		
	} //end of actionPErformed 
	
	Button topButton, bottomButton, rightButton, leftButton, middleButton;
		
}