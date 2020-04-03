import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

// Applet Life Cycle
public class DemoALC extends Applet {
	
	/*
	 * init();
	 * start();
	 * 
	 * paint();
	 * 
	 * stop();
	 * destroy();
	 */
	
	public void init()
	{
		super.showStatus("init Process");
		for(double i=0;i<=100000000;i++) ;
	}
	
	public void start()
	{
		super.showStatus("start Process");
		for(double i=0;i<=100000000;i++) ;
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.CYAN);
		Font f1 = new  Font("comic sans",Font.ITALIC+Font.BOLD,36);
		g.setFont(f1);
		g.drawString("Hello", 50, 50);
	}// repaint
	
	public void stop()
	{
		super.showStatus("stop Process");
		for(double i=0;i<=100000000;i++) ;
	}
	
	public void destroy()
	{
		super.showStatus("destroy Process");
		for(double i=0;i<=100000000;i++) ;
	}
	
	

}
