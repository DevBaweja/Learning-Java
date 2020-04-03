import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;


import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.Scrollable;

public class DemoMain extends JApplet{

	static JPanel pbreadcrumbs;
	static JLabel lbbreadcrumbs;
	JPanel pmain;
	JTabbedPane jtp;
	
	public void init()
	{
		
		setVisible(true);
		setSize(1000, 800);
		setSize(new Dimension(1000, 800));
		setPreferredSize(new Dimension(1000, 800));
		BorderLayout border = new BorderLayout();
		setLayout(border);
		
		lbbreadcrumbs = new JLabel();
		
		pbreadcrumbs = new JPanel();
		
		jtp = new JTabbedPane();
		
		jtp.add("DataBase",new DataBase());
		pmain.add(jtp);
		
		add(pbreadcrumbs);
		style();
	}
	
	private void style() {
		
	}
}
