package WithThread;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DemoConCircleColor extends Applet implements Runnable {
	
	Thread Th;
	
	int w, h;
	int xc ,yc ,r;
	int rr,gg,bb;

	
	public void init()
	{
		
		rr = 25;
		gg = 250; // Range from 0-255
		bb = 25;
		
		r = w/32;
		
		Th = new Thread(this);
		Th.start();
	}
	
	public void paint(Graphics g)
	{

			Color c = new Color(rr,gg,bb);
			g.setColor(c);
			g.drawOval(xc-r, yc-r,2*r, 2*r);
	}
	
	public void run()
	{
		for(int i=1; i<=10;i++)
		{
			w = super.getSize().width;
			h = super.getSize().height;
			xc = w/2;
			yc = h/2;
			
			repaint();
			try {
				Th.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			rr += 25;
			gg -= 25;
			bb += 25;
			
			r += w/32;
		}
	}

}
