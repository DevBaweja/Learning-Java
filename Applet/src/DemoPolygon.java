import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Polygon;

public class DemoPolygon extends Applet{
	
	public void paint(Graphics g)
	{
		int []xpoint = { 125,200,275 };
		int []ypoint = { 250,100,250 };
		
	//	Polygon P = new Polygon(xpoint,ypoint,3);
	//	g.drawPolygon(P);
		
		
	//	g.drawPolygon(xPoints, yPoints, nPoints);
		g.drawPolygon(xpoint, ypoint,3);
	}

}
