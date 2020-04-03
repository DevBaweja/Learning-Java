package Menu;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.Polygon;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// Menu Requires Frame Class
public class WorkingMenu extends Frame implements WindowListener,ActionListener{
	
	MenuBar MB; 
	
	// Like button 
	// it cannot br treated as list and hence we cannot use Item Listener
	Menu MShape,MColor; 
	
	// Like button
	MenuItem MIRectangle,MISquare,MIOval,MICircle,MITriangle; 
	MenuItem MIRed,MIPink,MIBlack,MICyan,MIBlue,MIGreen; 
	
	int choice1=0; // for Shape
	int choice2=0; // for Color
	
	public WorkingMenu()
	{
	
		setVisible(true);
		setSize(500, 500);
		setLayout(new FlowLayout()); // as default of Frame is BorderLayout
		
		// Menu items for menu shape
		MIRectangle = new MenuItem("Rectangle"); 
		MISquare = new MenuItem("Square"); 
		MIOval = new MenuItem("Oval");
		MICircle = new MenuItem("Circle");
		MITriangle = new MenuItem("Triangle");

		// Menu items for menu color
		MIRed = new MenuItem("Red");
		MIPink = new MenuItem("Pink");
		MIBlack = new MenuItem("Black");
		MICyan = new MenuItem("Cyan");
		MIBlue = new MenuItem("Blue");
		MIGreen= new MenuItem("Green");
		

			
		MShape = new Menu("Shape");
		MColor = new Menu("Color");
		
		
		MShape.add(MIRectangle);
		MShape.add(MISquare);
		MShape.addSeparator(); // adding line
		MShape.add(MIOval);
		MShape.add(MICircle);
		MShape.addSeparator();
		MShape.add(MITriangle);
		
		
		MColor.add(MIRed);
		MColor.add(MIPink);
		MColor.addSeparator();
		MColor.add(MIBlack);
		MColor.add(MICyan);
		MColor.addSeparator(); 
		MColor.add(MIBlue);
		MColor.add(MIGreen);

		// Add Shortcuts For MenuItems
		// Ctrl will be added anyway
		MIRectangle.setShortcut(new MenuShortcut(KeyEvent.VK_R)); // Ctrl + R
		MISquare.setShortcut(new MenuShortcut(KeyEvent.VK_S));
		MIOval.setShortcut(new MenuShortcut(KeyEvent.VK_O));
		MICircle.setShortcut(new MenuShortcut(KeyEvent.VK_C));
		MITriangle.setShortcut(new MenuShortcut(KeyEvent.VK_T));
		
		MIRed.setShortcut(new MenuShortcut(KeyEvent.VK_R, true)); // as r is used already we can add shift operation
		// Ctrl + Shift + R
		MIPink.setShortcut(new MenuShortcut(KeyEvent.VK_P,false));
		MIBlack.setShortcut(new MenuShortcut(KeyEvent.VK_B)); // default shift modifier is false
		MICyan.setShortcut(new MenuShortcut(KeyEvent.VK_C, true));
		MIBlue.setShortcut(new MenuShortcut(KeyEvent.VK_B,true));
		MIGreen.setShortcut(new MenuShortcut(KeyEvent.VK_G,false));
			
		
		MB = new MenuBar();
		MB.add(MShape);
		MB.add(MColor);
		
		setMenuBar(MB);
		
		this.addWindowListener(this);
		
		
		// considering menu as choice,list
		// so we have to use item listener
		// MShape.addActionListener(this);
		//  MColor.addActionListener(this);
		
		
		// making them as buttons 
		// so we have to use action listener
		MIRectangle.addActionListener(this);
		MISquare.addActionListener(this);
		MIOval.addActionListener(this);
		MICircle.addActionListener(this);
		MITriangle.addActionListener(this);
		
		MIRed.addActionListener(this);
		MIPink.addActionListener(this);
		MIBlack.addActionListener(this);
		MICyan.addActionListener(this);
		MIBlue.addActionListener(this);
		MIGreen.addActionListener(this);
		
	}
	
	
	// Frame class overwriting applet class function paint
	public void paint(Graphics g) 
	{
		
		// Color
		switch(choice2) 
		{
			case 0:{
						// Do nothing
						break;
					}
			case 1:{
						g.setColor(Color.red);
						break;
					}
			case 2:{
						g.setColor(Color.pink);
						break;
					}
			case 3:{
						g.setColor(Color.black);
						break;
					}			
			case 4:{
						g.setColor(Color.cyan);
						break;
					}			
			case 5:{
						g.setColor(Color.blue);
						break;
					}
			case 6:{
						g.setColor(Color.green);
						break;
					}
			
		}
		
		// Shape
		switch(choice1)
		{
			case 0 :{
					 // do nothing
						break;
					}
			
			case 1 :{// Rectangle
							g.fillRect(100, 100, 200, 100);
							break;
					}
			
			case 2 :{// Square
							g.fillRect(100, 100, 100, 100);
							break;
					}
			
			case 3:{// Oval
							g.fillOval(100, 100, 200, 100);
							break;
					}
			
			case 4 :{// Circle
							g.fillOval(100, 100, 100, 100);
							break;
					}
			case 5:{//Triangle
							int []xpoint = { 125,200,275 };
							int []ypoint = { 250,100,250 };
							Polygon P = new Polygon(xpoint,ypoint,3);
							g.fillPolygon(P);
							break;
					}
		}
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		Object src = ae.getSource();
		
		// Color
		if(src == MIRed)
			choice2 = 1;
		else if(src == MIPink)
			choice2 = 2;
		else if(src == MIBlack)
			choice2 = 3;
		else if(src == MICyan)
			choice2 = 4;
		else if(src == MIBlue)
			choice2 = 5;
		else if(src == MIGreen)
			choice2 = 6;
		
		// Shape
		if(src == MIRectangle)
			choice1 = 1;
		else if(src == MISquare)
			choice1 = 2;
		else if(src == MIOval)
			choice1 = 3;
		else if(src == MICircle)
			choice1 = 4;
		else if(src == MITriangle)
			choice1 = 5;
		
				repaint(); // to make paint again
	}
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(-1);
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



}
