import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

// APPLET DO NOT HAVE ANY MAIN METHOD
public class DemoStrings extends Applet {
	
	public void paint(Graphics g)
	{
		
		super.setBackground(Color.yellow);
		// super.setForeground(Color.pink);
		g.setColor(Color.GREEN);
		g.drawString("Hello World",100,100);
		//super.setForeground(Color.black);
		g.setColor(Color.PINK);
		g.drawString("Welcome", 200, 200);
		
		// g.drawString(str, x, y);
		// here (x,y) are coordinates from top left of screen 
		
		Font f1 = new Font("comic sans", Font.ITALIC+Font.BOLD,36);
		g.setFont(f1);
		g.drawString("Dev Baweja", 500, 500);
		
		
		
		
		
		// These methods are automatically called
		// Making lifecycle of Applet
		/*
		 * super.init();
		 * super.start();
		 * super.paint(Graphics g); // which we are overriding 
		 * super.stop();
		 * super.destroy();
		 */
	}
}
