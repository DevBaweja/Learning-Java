import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class DemoJScrollPane extends JApplet{

	JScrollPane jsp;
	JLabel lb;
	public void init()
	{
		// setLayout(new FlowLayout());
		lb = new JLabel(new ImageIcon("image7.jpg"));
		
		jsp = new JScrollPane(lb);
		// jsp.setSize(new Dimension(200, 200));
		// jsp.setPreferredSize(new Dimension(200, 200));
		add(jsp);
		
	}
}
