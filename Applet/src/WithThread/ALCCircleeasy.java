package WithThread;
import java.applet.Applet;
import java.awt.Graphics;

// Applet Life Cycle
public class ALCCircleeasy extends Applet implements Runnable {
	
	Thread Th;
	int r;
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
		r = 100;
		Th = new Thread(this);
		Th.start();
	}
	
	public void paint(Graphics g)
	{
		g.drawOval(50,50, 2*r, 2*r);
	}
	
	public void run() {
		
		for(int i=1;i<=10;i++)
		{
			
			repaint();
			try {
				Th.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
					r += 20;
		}
	
}
	

	
}
