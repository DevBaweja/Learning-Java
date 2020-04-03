package MouseListener;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// here we are using applet class so that we dont have to make main in this.
// also no need to setsize,setvisibility,setlayout as in frame.
// also no need to implements WindowListener to close it.
public class ExampleMouseListener extends Applet implements MouseListener{
	
	
	public void init()
	{
		this.addMouseListener(this);
	}
	

	
	@Override
	public void mouseClicked(MouseEvent me) {
		System.out.println("Mouse Clicked");
		
		
		Graphics g = this.getGraphics();
		g.drawString("Clicked", me.getX(), me.getY());
		
	}

	@Override
	public void mousePressed(MouseEvent me) {
		System.out.println("Mouse Pressed");
		
		
		Graphics g = this.getGraphics();
		g.drawString("Pressed", me.getX(), me.getY());
		
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		System.out.println("Mouse Released");
		
		
		Graphics g = this.getGraphics();
		g.drawString("Released", me.getX(), me.getY());
		
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		System.out.println("Mouse Entered");
		
		
		Graphics g = this.getGraphics();
		g.drawString("Entered", me.getX(), me.getY());
		
	}

	@Override
	public void mouseExited(MouseEvent me) {
		
		System.out.println("Mouse Exit");
		
		
		Graphics g = this.getGraphics();
		g.drawString("Exit", me.getX(), me.getY());
		
	}

}
