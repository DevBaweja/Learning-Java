package WithScreen;
import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;

public class DemoCirScreen extends Applet {

	
	// overriding Applet Class method
	public void paint(Graphics g)
	{
		// g.drawOval(x, y, width, height);
		int h  = this.getSize().height;
		int w = this.getSize().width;
	/*	
	 * Dimension D = super.getSize();
	 *	int w = D.width;
	 *	int h = D.height;
	 *	
	*/
		int xc = w/2;
		int yc = h/2;
		int r = w/4;
		
		g.drawOval(xc- r ,yc-r , 2*r , 2*r);
		


	}

}