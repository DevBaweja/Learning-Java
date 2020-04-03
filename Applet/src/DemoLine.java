import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DemoLine extends Applet{
	
	public void paint(Graphics g) 
	{
		g.setColor(Color.green);
		// g.drawLine(x1, y1, x2, y2);
		g.drawLine(50, 40, 90, 100);
	}

}
