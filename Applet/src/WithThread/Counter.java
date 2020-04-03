package WithThread;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Counter extends Applet implements Runnable{
	
	Thread Th;
	int count;
	// String s;
	int x,y,w,h;
	
	public void init()
	{

		count =0;
		Th = new Thread(this);
		Th.start();
	}
	
	public void paint(Graphics g)
	{
		Color c1 = new Color(140,250,70);
		g.setColor(c1);
		Font f1 = new Font("Arial",Font.BOLD+Font.ITALIC,30);
		g.setFont(f1);
		
		// s = " "+ count;
		g.drawString(Integer.toString(count), x, y);
	}
	
	public void run() {
		
				
			while(true)
			{
				
				w= super.getSize().width;
				h= super.getSize().height;
				
				x = w/2;
				y = h/2;
					repaint();
						try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
									e.printStackTrace();
								}
						count++;
			}
		
	}
	
}