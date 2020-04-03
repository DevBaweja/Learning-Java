package WithScreen;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DemoChess extends Applet{
	
	
	public void paint(Graphics g)
	{
		int w = super.getSize().width;
		int h = super.getSize().height;
		
		int n = w/8;
		int m = h/8;
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
	
			{
				if(i%2==0)
				{
					if(j%2==0)
						g.setColor(Color.black);
					else 
						g.setColor(Color.white);
				}
				else 
				{
					if(j%2==0)
						g.setColor(Color.white);
					else 
						g.setColor(Color.black);
				}
				
					g.fillRect(i*m, j*n, n, m);
			}
		
		}
	}
}
