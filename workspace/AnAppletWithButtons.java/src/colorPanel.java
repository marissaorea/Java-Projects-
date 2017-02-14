import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class colorPanel {

	public class Colorlistener implements ActionListener {
		public void actionperformed(ActionEvent e) {
			Object o = e.getSource();
			Object redButton = null;
			Object blueButton = null;
			if(o.equals(redButton)) {
					colorPanel.setBackground(Color.red);
			}
			else if(o.equals(blueButton)) {
					colorPanel.setBackground(Color.blue);
			}
		
}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}

	public static void setBackground(Color red) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
