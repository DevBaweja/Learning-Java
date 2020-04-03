package WithScreen;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DemoConCircleColor extends Applet {
	
	public void paint(Graphics g)
	{
		int w = super.getSize().width;
		int h = super.getSize().height;
		
		int xc = w/2;
		int yc = h/2;
		int r = w/32;
		
		for(int i=1; i<=25;i++)
		{
			Color c = new Color((int)((Math.random()*1000)%256),(int)((Math.random()*1000)%256),(int)((Math.random()*1000)%256));
			g.setColor(c);

			g.drawOval(xc-r, yc-r,2*r, 2*r);
			r += w/32;

		}
	}

}
