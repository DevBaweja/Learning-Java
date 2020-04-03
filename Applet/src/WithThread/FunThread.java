package WithThread;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class FunThread extends Applet implements Runnable {

	Thread Th;
	int choice;
	
	public void init()
	{
		
		choice = 0;
		super.setBackground(Color.yellow);
		super.setForeground(Color.red);

		Th = new Thread(this);
		Th.start();
	}
	
		
		public void paint(Graphics g)
		{
			
			switch(choice)
			{

				case 0 :{// Rectangle
								g.drawRect(100, 100, 200, 100);
								break;
						}
				case 1 :{// Square
								g.drawRect(100, 100, 100, 100);
								break;
						}
				case 2:{//Triangle
								int []xpoint = { 125,200,275 };
								int []ypoint = { 250,100,250 };
								Polygon P = new Polygon(xpoint,ypoint,3);
								g.drawPolygon(P);
								break;
						}
				case 3:{// Arc
							g.drawArc(100, 100, 100, 100,90, 180);
							break;
						}
				case 4:{// Circle
								g.drawOval(100, 100, 100, 100);
								break;
						}
			}
	
		}


	@Override
	public void run() {

		while(true)
		{
			repaint();
			try {
				Th.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			choice++;
			choice %= 5; // as it can be 0 to 4
		}
		
	}

}
