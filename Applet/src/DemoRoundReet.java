import java.applet.Applet;
import java.awt.Graphics;

public class DemoRoundReet extends Applet {

	public void paint(Graphics g)
	{
		// g.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
		g.drawRoundRect(50,50 , 200, 200, 100, 100);
		// will give oval g.drawRoundRect(50,50 , 200, 100, 200, 100);
		// here arcwidth is from both sides submission 
		
	}
}
