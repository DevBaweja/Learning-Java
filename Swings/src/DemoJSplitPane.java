import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class DemoJSplitPane extends JApplet{

	JScrollPane leftjsp,rightjsp;
	JSplitPane jsp;
	
	public void init()
	{
		
		leftjsp = new JScrollPane(new JLabel(new ImageIcon("Bliss1.jpg")));
		rightjsp = new JScrollPane(new AdmissionFormJPanel());
		
		System.out.println(Color.orange);
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftjsp , rightjsp);
		jsp.setResizeWeight(0.5); // split screen
		
		add(jsp);
	}
}
