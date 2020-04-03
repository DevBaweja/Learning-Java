import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class DemoJTabbedPaneself2 extends JApplet{

	JTabbedPane jtp;
	
	JTabbedPane jtp1,jtp2,jtp3;
	JPanel p11,p12,p13,p21,p22,p31,p32,p33,p34;
	
	
	public void init()
	{
		p11 = new JPanel();
		p11.add(new JLabel("Label 1.1"));
		
		p12 = new JPanel();
		p12.add(new JLabel("Label 1.2"));
		
		p13 = new JPanel();
		p13.add(new JLabel("Label 1.3"));
		
		p21 = new JPanel();
		p21.add(new JLabel("Label 2.1"));
		
		p22 = new JPanel();
		p22.add(new JLabel("Label 2.2"));
		
		p31 = new JPanel();
		p31.add(new JLabel("Label 3.1"));
		
		p32 = new JPanel();
		p32.add(new JLabel("Label 3.2"));
		
		p33 = new JPanel();
		p33.add(new JLabel("Label 3.3"));
		
		p34 = new JPanel();
		p34.add(new JLabel("Label 3.4"));
		
		
		
		jtp1 = new JTabbedPane();
		jtp1.addTab("Tab 1.1",p11);
		jtp1.addTab("Tab 1.2",p12);
		jtp1.addTab("Tab 1.3",p13);
		
		jtp2 = new JTabbedPane();
		jtp2.addTab("Tab 2.1",p21);
		jtp2.addTab("Tab 2.2",p22);
		
		jtp3 = new JTabbedPane();
		jtp3.addTab("Tab 3.1",p31);
		jtp3.addTab("Tab 3.2",p32);
		jtp3.addTab("Tab 3.3",p33);
		jtp3.addTab("Tab 3.4",p34);
		
		
		jtp = new JTabbedPane();
		jtp.addTab("Tab 1", jtp1);
		jtp.addTab("Tab 2", jtp2);
		jtp.addTab("Tab 3", jtp3);
		
		add(jtp);
		
	}
}
