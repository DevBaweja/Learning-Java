package MouseListener;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//here we are using applet class so that we dont have to make main in this.
//also no need to setsize,setvisibility,setlayout as in frame.
//also no need to implements WindowListener to close it.
public class LineOfYourOwnDragging extends Applet implements MouseListener,MouseMotionListener{
	
	int x1,y1; 
	// for starting point
	int x2,y2;
	// ending point
	
 	// Point point = null;
	
	public void init()
	{
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	public void paint(Graphics g)
	{
			
		g.drawLine(x1, y1, x2, y2);

	}

	
	@Override
	public void mouseClicked(MouseEvent me) {
		

		
	}

	@Override
	public void mousePressed(MouseEvent me) {
		
		// taking coordinates of first point
	x1 = me.getX();
	y1 = me.getY();
	
	// if we add graphis here then it will draw line again and again
	// point = me.getPoint();
	
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		

	}

	@Override
	public void mouseEntered(MouseEvent me) {

	}

	@Override
	public void mouseExited(MouseEvent me) {
			
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// taking coordinates of first point
	x2 = e.getX();
	y2 = e.getY();
	
	repaint();

		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
