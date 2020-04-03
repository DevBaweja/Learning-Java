package WithThread;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class MyClock extends Applet implements Runnable {

	Thread Th;
	int xc,yc,w,h,r,hh,mm,ss;
	
	
	public void init()
	{ 
		// For intisation of anything
		ss=0;
		mm=0;
		hh=0;
		Th = new Thread(this);
		Th.start();
	}
	
	public void paint(Graphics g)
	{
		
		g.fillOval(xc-(3*r), yc-(3*r), 6*r, 6*r);
		
		// seconds
		g.setColor(Color.pink);
		g.fillArc(xc-(3*r), yc-(3*r), 6*r, 6*r, 90,-ss);
		// minutes
		g.setColor(Color.green);
		g.fillArc(xc-(2*r) , yc-(2*r) , 4*r , 4*r , 90, -mm);
		// hours
		g.setColor(Color.red);
		g.fillArc(xc-r, yc-r, 2*r, 2*r, 90, -hh);
	}
	
	
	public void run() {
		
		while(true)
		{
			// For screen size
			h = super.getSize().height;
			w = super.getSize().width;
			xc = w/2; 
			yc = h/2;
			r  = w/8; 
			repaint();
			
			try {
				Th.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			 
			ss += 90;
			
			
			
			if(ss>360) 
			{
				ss = 90;
				mm += 90;  
			}
			
			if(mm>360)
			{
				mm=00;
				hh += 90;
			}
			if(hh>360)
			{
				ss = 90;
				mm = 0;
				hh = 0;
			}  
			
		}	
	}
	

}
