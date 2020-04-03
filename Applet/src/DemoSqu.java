import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DemoSqu extends Applet {

	public void paint(Graphics g)
	{
		// g.drawRect(x, y, width, height);
		// for square make both width and height same
		super.setBackground(Color.BLACK	);
		g.setColor(Color.CYAN);
		g.drawRect(20, 50, 60, 60);
	}
}
