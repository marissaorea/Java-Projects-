	//Fourth Lab

	import java.applet.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.awt.Color;
	
	public class AnAppletWithButtons extends Applet implements ActionListener {
	
		public void init() {
			button1 = new Button("Button 1");
			add(button1);
			button1.addActionListener(this);
			

			button2 = new Button("Button 2");
			add(button2);
			button2.addActionListener(this);
			
		};
		
		
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == button1) {
				setBackground(Color.red);
				System.out.println("Button 1 was pressed");
				Line = true;
				Oval = false;
				
			}    
			
			else {
				setBackground(Color.blue);
				System.out.println("Button 2 was pressed");
				Line = false;
				Oval = true;
			}
			
			repaint();	
				
	}
		public void paint(Graphics g) {
				if(Line){
				g.setColor(Color.GREEN);
				g.drawLine(0,200,300,200);
				}
				
				else if(Oval) {
				g.setColor(Color.GREEN);
				g.drawOval(40, 40, 40, 40);
				}
			}	
	
			
	//declarations below		
		boolean Line;
		boolean Oval;
		Button button1, button2;
		
	}


		
	

