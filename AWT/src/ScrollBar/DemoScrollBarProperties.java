package ScrollBar;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class DemoScrollBarProperties extends Applet implements AdjustmentListener {

	Scrollbar hsb;
	
	public void init()
	{
		
		hsb = new Scrollbar();
		// input type="range" in html
		
		hsb.setOrientation( Scrollbar.HORIZONTAL ); // static constant will give numerical value
		hsb.setMaximum(1000);
		hsb.setUnitIncrement(5);
		hsb.setBlockIncrement(20);
		
		hsb.setSize(new Dimension(800, 20));
		hsb.setPreferredSize(new Dimension(800, 20));
		add(hsb);
	
		
		
		
		System.out.println("Orientation: "+hsb.getOrientation()); // default veritcal (1)
		System.out.println("Min Value: "+hsb.getMinimum()); // (0)
		System.out.println("Max Value: "+hsb.getMaximum()); // (100)
		System.out.println("Current Tab Position: "+hsb.getValue()); // (0)
		System.out.println("Unit Increament: "+hsb.getUnitIncrement()); // (1)
		System.out.println("Block Increament: "+hsb.getBlockIncrement()); // (10)
		
		hsb.addAdjustmentListener(this);
	}



	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
		
		showStatus("Current tab value is: "+hsb.getValue()); // applet life cycle
		
	}
}
