import java.applet.Applet;
import java.awt.Graphics;

public class DemoCircle extends Applet {

	public void paint(Graphics g)
	{
		// g.drawOval(x, y, width, height);
		// similar as rectangle of height and width
		// for circle make width and height same
		g.drawOval(40, 60, 60, 60);
		
		// with xc,yc,r
		// g.drawOval(xc-r,yc-r, 2*r, 2*r);
		// it will make circle at center of desired xc,yc and raduis of r.
		
	}
}
