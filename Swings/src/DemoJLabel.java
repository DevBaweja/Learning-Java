import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;

public class DemoJLabel extends JApplet{
	
	JLabel lb1,lb2;
	
	public void init()
	{
		
		// Default Border Layout
		lb1 = new JLabel();
		lb1.setText("Hello");
		
		
		lb2 = new JLabel(new ImageIcon("image1.jpg"));
		
		add(lb1,BorderLayout.NORTH);
		add(lb2,BorderLayout.CENTER);
		
		lb1.setIcon(new ImageIcon("image2.jpg"));
	
	}

}
