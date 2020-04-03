import java.applet.Applet;
import java.awt.Graphics;

public class DesignCar extends Applet {

	public void paint(Graphics g)
	{
		int xpoints[] = {75,50,50,250,250,225};
		int ypoints[] = {150,150,50,50,150,150};
		// Body
		g.drawPolyline(xpoints, ypoints, 6);
		
		// Circle
		g.drawOval(75, 125, 50, 50);
		g.drawOval(175, 125, 50, 50);
				
		
	}
}
