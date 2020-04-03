import java.applet.Applet;
import java.awt.Graphics;

public class DemoPolylines extends Applet{
	
	public void paint(Graphics g)
	{
		int []xpoint = { 125,200,275 };
		int []ypoint = { 250,100,250 };
		

		
		
	//	g.drawPolygon(xPoints, yPoints, nPoints);
		g.drawPolyline(xpoint, ypoint,3);
		// Last line will be removed 
	}

}
