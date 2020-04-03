import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DemoOval extends Applet {

	public void paint(Graphics g)
	{
		// g.drawOval(x, y, width, height);
		// similar as rectangle of height and width
		g.setColor(Color.CYAN);
		
		// draw replaces with fill 
		g.fillOval(40, 60, 80, 60);
		
		g.setColor(Color.BLACK);
		g.drawOval(40, 60, 80, 60);
		
		// making own color
		
		Color c1 = new Color(0,0,0);
		g.setColor(c1);
		g.fillOval(100, 200, 100, 50);
	}
}
