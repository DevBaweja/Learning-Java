package ScrollBar;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class DemoScrollBarCircle extends Applet implements AdjustmentListener{

	Scrollbar sbhor,sbver;
	
	public void init()
	{
		sbhor = new Scrollbar();
		sbver = new Scrollbar();
		
		sbhor.setOrientation(Scrollbar.HORIZONTAL);
		sbver.setOrientation(Scrollbar.VERTICAL);
		
		sbhor.setMaximum(800);
		sbver.setMaximum(800);
		sbhor.setMinimum(100);
		sbver.setMinimum(100);
		sbhor.setUnitIncrement(20);
		sbhor.setBlockIncrement(50);
		sbver.setUnitIncrement(20);
		sbver.setBlockIncrement(50);
		
		setLayout(new BorderLayout());
		
		add(sbhor,BorderLayout.SOUTH);
		add(sbver,BorderLayout.WEST);

		

		sbhor.addAdjustmentListener(this);
		sbver.addAdjustmentListener(this);
	}



	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
		//Dimension D = super.getSize();
		//int h = D.height;
		//int w = D.width;

		
		int h = super.getSize().height;
		int w = super.getSize().width;
		
		int hor = sbhor.getValue()/2;
		int ver = sbver.getValue()/2;
		g.drawOval(w/2-hor, h/2-ver,2*hor ,2*ver);
	}

	
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
	
		repaint();
		// if we do paint in here multple time it will be formed
	}
}
