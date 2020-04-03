import java.awt.Color;

import javax.swing.JApplet;
import javax.swing.JTabbedPane;

public class DemoJTabbedPane extends JApplet{

	JTabbedPane jtp;
	public void init()
	{
		jtp = new JTabbedPane();
		jtp.setBackground(Color.blue);
		
		jtp.addTab("DemoJRadioButtonPanel", new DemoJRadioButtonPanel());
		jtp.addTab("DemoJLabelExamplePanel", new DemoJLabelPanel());
		jtp.addTab("DemoJComboBoxPanel", new DemoJComboBoxPanel());
		jtp.addTab("DemoJButtonPanel", new DemoJButtonPanel());
		
		
		style();
		add(jtp);
	}
	
	public void style()
	{
		jtp.setBackground(Color.orange);
		jtp.setBackgroundAt(0, Color.cyan);
		jtp.setBackgroundAt(1,Color.green);
		
		jtp.setForeground(Color.red);
	}
}
