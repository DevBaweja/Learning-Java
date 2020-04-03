import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JScrollPaneWithJPanel extends JApplet{

	JScrollPane jsp;
	JPanel p;
	public void init()
	{
		// setLayout(new FlowLayout());
		p = new AdmissionFormJPanel();
		
		jsp = new JScrollPane(p);
		// jsp.setSize(new Dimension(200, 200));
		// jsp.setPreferredSize(new Dimension(200, 200));
		add(jsp);
		
	}
}
