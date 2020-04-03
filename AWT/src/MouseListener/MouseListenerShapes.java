package MouseListener;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//here we are using applet class so that we dont have to make main in this.
//also no need to setsize,setvisibility,setlayout as in frame.
//also no need to implements WindowListener to close it.
public class MouseListenerShapes extends Applet implements MouseListener{
	
	int x1,y1; 
	// for starting point
	
	public void init()
	{
		this.addMouseListener(this);
	}
	

	
	@Override
	public void mouseClicked(MouseEvent me) {
		

		
	}

	@Override
	public void mousePressed(MouseEvent me) {
		
		// taking coordinates of first point
	x1 = me.getX();
	y1 = me.getY();	
		
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		
	
		// only when clicked ie
		// if point of Pressed and Released is same
		Graphics g = this.getGraphics();
		// making my own color
		Color c1 = new Color((int)((Math.random()*1000)%256),(int)((Math.random()*1000)%256),(int)((Math.random()*1000)%256));
				/*
				 * Math.random() will give random between 0 to 1 so we multiple it by 1000
				 * and mod 265 to obtain it in between 0-265 rr,gg,bb value in my own color
				 * as Math give and take argument in double typecast it to int for rr,gg,bb values
				 */
			g.setColor(c1);
			
			int x2 = me.getX();
			int y2 = me.getY();
			
			// Four cases
			
			// Top-Left to Bottom-Right  
			if(x2 > x1 && y2 > y1)
			g.fillOval(x1, y1,x2-x1,y2-y1);
			
			// Bottom-Left to Top-Right
			else if(x2 > x1 && y2 < y1)
				g.fillRect(x1, y2, x2-x1,Math.abs(y2-y1));
			
			// Top-Right to Bottom-Left
			else if(x2 < x1 && y2 > y1)
				g.fillOval(x2, y1, Math.abs(x2-x1), y2-y1);
			
			// Bottom-Right to Top-Left
			else if(x2 < x1 && y2 < y1)
				g.fillRect(x2, y2, Math.abs(x2-x1) , Math.abs(y2-y1));
			
			
			// to give it color we use filloval instead of drawoval
		
	}

	@Override
	public void mouseEntered(MouseEvent me) {

	}

	@Override
	public void mouseExited(MouseEvent me) {
			
	}

}
