import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

public class DemoJSplitPaneFour extends JApplet{

	JLabel l1,l2,l3,l4;
	JSplitPane jsp,jspup,jspdown;
	
	
	public void init()
	{
		
		l1 = new JLabel("Label 1");
		l2 = new JLabel("Label 2");
		l3 = new JLabel("Label 3");
		l4 = new JLabel("Label 4");
		
		jspup = new JSplitPane(JSplitPane.VERTICAL_SPLIT, l1 , l2);
		jspup.setResizeWeight(.5);
		
		jspdown = new JSplitPane(JSplitPane.VERTICAL_SPLIT, l3 , l4);
		jspdown.setResizeWeight(.5);
		
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jspup, jspdown);
		jsp.setResizeWeight(.5);
		
		add(jsp);
	}
}
