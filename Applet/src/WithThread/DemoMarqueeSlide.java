package WithThread;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

// Applet Life Cycle
public class DemoMarqueeSlide extends Applet implements Runnable {
	
	Thread Th;
	int x,y;
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
		
		x=0;
		y=100;
		Th = new Thread(this);
		Th.start();
	}
	
	
	public void paint(Graphics g)
	{
		g.setColor(Color.CYAN);
		Font f1 = new  Font("comic sans",Font.ITALIC+Font.BOLD,25);
		g.setFont(f1);
		g.drawString("Hello",x,y);
	}
	
	public void run() {
		
		while(true) {
		
			repaint();
					try {
	
							Th.sleep(10);
						} catch (InterruptedException e) {
								e.printStackTrace();
						}
					// Slide
					x += 1 ;
					if(x>= (super.getSize().width/2))
						Th.destroy();
					
				}
			}
	
	
}
