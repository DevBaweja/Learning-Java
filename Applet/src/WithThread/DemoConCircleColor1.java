package WithThread;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DemoConCircleColor1 extends Applet implements Runnable {
	
	Thread Th;
	int w,h;
	int r,xc,yc;
	int rr,gg,bb;
	
	public void init()
	{
		rr = 25;
		gg = 250; // Range from 0-255
		bb = 25;
		
		r = w/4;
		Th = new Thread(this);
		Th.start();
	}
	
	public void paint(Graphics g)
	{

		Color c = new Color(rr,gg,bb);
		g.setColor(c);

		g.fillOval(xc-r, yc-r,2*r, 2*r);

	}
		

		
		public void run()
		{
			for(int i=1; i<=6;i++)
			{
				
				w = super.getSize().width;
				h = super.getSize().height;
				
				xc = w/2;
				yc = h/2;
				
				r -= w/16;
				repaint();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
				// if we make inner first the outer it will override that outer one
				// also there is fixed loop times as raduis will become zero
				// another problem is that rr,gg,bb, values will go beyond limits
				rr += 30;
				gg -= 30;
				bb += 30;
				
				
				
				// in this first make outer circle then make inner circle
			}
		}
	

}
