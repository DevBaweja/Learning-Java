package ScrollBar;

import java.applet.Applet;
import java.awt.Scrollbar;

public class DemoScrollBar extends Applet {

	Scrollbar sb;
	
	public void init()
	{
		sb = new Scrollbar();
		add(sb);
	
		System.out.println("Orientation: "+sb.getOrientation()); // default veritcal (1)
		System.out.println("Min Value: "+sb.getMinimum()); // (0)
		System.out.println("Max Value: "+sb.getMaximum()); // (100)
		System.out.println("Current Tab Position: "+sb.getValue()); // (0)
		System.out.println("Unit Increament: "+sb.getUnitIncrement()); // (1)
		System.out.println("Block Increament: "+sb.getBlockIncrement()); // (10)
	}
}
