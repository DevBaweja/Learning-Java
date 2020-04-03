package WithThread;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class DemoDigitalClock extends Applet implements Runnable{
	
	Thread Th;
	int hh,mm,ss;
	int w,h,x,y;
	String s1,s2;
	
	public void init()
	{
		hh=0;
		mm=0;
		ss=0;
		Th = new Thread(this);
		Th.start();
	}

	
	public void paint(Graphics g)
	{
		s1 = hh+":";
		s2 = mm+":";
		
		Font f1 = new Font("comic sans",Font.BOLD,50);
		g.setFont(f1);
		
		g.drawString(s1, x-75, y);
		g.drawString(s2, x, y);
		g.drawString(Integer.toString(ss), x+75, y);
	}
	public void run() {
		
		while(true)
		{
			w = super.getSize().width;
			h = super.getSize().height;
			x = w/2;
			y = h/2;
			repaint();
			try {
				Th.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			ss++;
			if(ss>59)
			{
				ss = 0;
				mm += 1;
			}
			if(mm>59)
			{
				mm = 0;
				hh += 1;
			}
			
			
		}
		
		
	}
	

}
