package Frame;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Frameex extends Frame implements WindowListener{
	
	Label lb1,lb2;
	
	
	public Frameex()
	{
		// default is border layout of frame class
		
		setVisible(true);  // otherwise it will be not visible
		setSize(400,400); // set size of both dialog and frames
		
	
		lb1 = new Label("Hello");
		lb2 = new Label("Welcome");
		
		add(lb1,BorderLayout.WEST);
		add(lb2,BorderLayout.EAST);
		
		this.addWindowListener(this);
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Opened Event");
	}


	@Override
	public void windowClosing(WindowEvent e) {

		System.out.println("Window Closing Event");
		System.exit(-1);
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Closed Event");
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Iconified Event");
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Deiconified Event");
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Activated Event");
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Deactivated Event");
	}

}
