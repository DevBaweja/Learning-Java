package MouseListener;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//here we are using applet class so that we dont have to make main in this.
//also no need to setsize,setvisibility,setlayout as in frame.
//also no need to implements WindowListener to close it.
public class MouseListenerLines extends Applet implements MouseListener{
	
	
	public void init()
	{
		this.addMouseListener(this);
	}
	

	
	@Override
	public void mouseClicked(MouseEvent me) {
		
		Dimension d = super.getSize();
		int w = d.width;
		int h = d.height;

		
		// same as
		// int w = super.getSize().width;
		 // int h = super.getSize().height; 
		
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
			g.drawLine(w/2, h/2, me.getX(), me.getY());
			// to give it color we use filloval instead of drawoval
		
	}

	@Override
	public void mousePressed(MouseEvent me) {
		
		// Graphics g = this.getGraphics();
		
		
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		
		// Graphics g = this.getGraphics();

		
	}

	@Override
	public void mouseEntered(MouseEvent me) {

	}

	@Override
	public void mouseExited(MouseEvent me) {
			
	}

}
