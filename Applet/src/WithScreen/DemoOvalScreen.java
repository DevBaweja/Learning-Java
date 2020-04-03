package WithScreen;
import java.applet.Applet;
import java.awt.Graphics;

public class DemoOvalScreen extends Applet {

	public void paint(Graphics g)
	{
		// g.drawOval(x, y, width, height);
		// similar as rectangle of height and width
		int h = super.getSize().height;
		int w = super.getSize().width;
		
		int xc = w/2; 
		int yc = h/2;
		
		g.drawOval(xc-w/4, yc-h/8, w/2, h/4);
	
	}
}
