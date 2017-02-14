	//Fifth Lab

	import java.applet.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.awt.Color;
	
public class AnAppletWithTextFields extends Applet implements ActionListener {
		public void init() {
			Label label1 = new Label("First Text Field: ");
			
			textArea1 = new TextArea("Hello");
			textArea1.setForeground(Color.RED);
			
			swapEm = new Button("Swap");
			swapEm.addActionListener(this);
			
			Label label2 = new Label("Second text field: ");
			
			textArea2 = new TextArea("Goodbye");
			textArea2.setEditable(false);
			textArea2.setForeground(Color.RED);
		
			
			clear = new Button("Clear: ");
			clear.addActionListener(this);
				
			add(label1);
			add(textArea1);
			add(swapEm);
			add(label2);
			add(textArea2);
			add(clear);
			
		}

		
		public void actionPerformed(ActionEvent e) {
			
			String temp = textArea1.getText();
			textArea1.setText(textArea2.getText());
			textArea2.setText(temp);
			
			if(e.getSource() == clear) {
				textArea1.setText("");
				textArea1.setText("");
			} // end of if-statement
			

		}
		
		
		
		
		
		
		TextArea textArea1, textArea2;
		Button swapEm;
		Button clear;
	
	
}
