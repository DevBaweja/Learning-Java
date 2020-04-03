package WithThread;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

// Applet Life Cycle
public class ALCCircle extends Applet implements Runnable {
	
	Thread Th;
	int xc,yc,r,w,h;
	/*
	 * init();
	 * start();
	 * 
	 * paint();
	 * 
	 * stop();
	 * destroy();
	 */
	
	
	public void init()
	{
		r = w/32;
		Th = new Thread(this);
		Th.start();
	}
	
	public void paint(Graphics g)
	{
		Color c1 = new Color(52,73,105); // making color
		g.setColor(c1);
		g.fillOval(xc-r,yc-r, 2*r, 2*r);
	}
	
	public void run() {
		
		for(int i=1;i<=15;i++)
		{
			h = super.getSize().height;
			w = super.getSize().width;
			xc = w/2; 
			yc = h/2;
			
			repaint();
			try {
				Th.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

	
					r += w/32;
		}
	
}
	

	
}
