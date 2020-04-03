import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;

public class DemoFlowLayout extends Applet {

	Button bt[];
	
	public void init()
	{
		bt = new Button[100]; // 100 ref of Button class
		
		for(int i=0 ; i<bt.length;i++)
		{
			bt[i] = new Button((i+1)+" "); // Memory Allocation
			// bt[i] = new Button( Integer.toString(i+1));
		}
		
		
		FlowLayout f = new FlowLayout(FlowLayout.LEFT,50,100);
		super.setLayout(f); 
		
		// Defualt Center Alignment
		
		for(int i=0;i< bt.length;i++)
		{
			add(bt[i]);
		}
	}
	
}
