package ActionListener;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FunActivity extends Applet implements ActionListener {

	
	Button B[];
	int choice;
	
	public void init()
	{
		
		choice = 0;
		super.setBackground(Color.yellow);
		super.setForeground(Color.red);

		B = new Button[5];
		String s[] = {"Rectangle","Square","Triangle","Arc","Circle"};
		for(int i=0;i<B.length;i++)
		{
			B[i] = new Button(s[i]);
		}
		
		
		for(int i=0;i<B.length;i++)
		add(B[i]);
		
		
		for(int i=0;i<B.length;i++)
		B[i].addActionListener(this);
	}
	
		
		public void paint(Graphics g)
		{
			
			switch(choice)
			{
				case 0 :{
								g.drawString("Press Any Button", 100, 100);
								break;
						}
				case 1 :{// Rectangle
								g.drawRect(100, 100, 200, 100);
								break;
						}
				case 2 :{// Square
								g.drawRect(100, 100, 100, 100);
								break;
						}
				case 3:{//Triangle
								int []xpoint = { 125,200,275 };
								int []ypoint = { 250,100,250 };
								Polygon P = new Polygon(xpoint,ypoint,3);
								g.drawPolygon(P);
								break;
						}
				case 4:{// Arc
							g.drawArc(100, 100, 100, 100,90, 180);
							break;
						}
				case 5:{// Circle
								g.drawOval(100, 100, 100, 100);
								break;
						}
			}
	
		}
		
		
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		

		for(int i=0;i<B.length;i++)
		{
			if(src == B[i])
				{
				choice = i+1;
				break;
				}
		}
		repaint();
	}

}
