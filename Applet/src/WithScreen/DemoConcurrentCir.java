package WithScreen;
import java.applet.Applet;
import java.awt.Graphics;

public class DemoConcurrentCir extends Applet {

		public void paint(Graphics g)
		{
			
			int w = super.getSize().width;
			int h = super.getSize().height;
			
			int xc = w/2;
			int yc = h/2;
			int r = w/32;
			for(int i=1; i<=10;i++)
			{
			g.drawOval(xc-r, yc-r,2*r, 2*r);
			r += w/32;
			}
		}
}
