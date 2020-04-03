import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Polygon;

public class DemoPolygon6Sides extends Applet {
	
	public void paint(Graphics g)
	{
		int []xpoints = {100,200,250,200,100,50};
		int []ypoints = {100,100,150,200,200,150};
	
		Polygon P = new Polygon(xpoints,ypoints,6);
		g.drawPolygon(P);

	}

}
