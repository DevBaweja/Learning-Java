package Frame;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameWindowListener extends Frame implements WindowListener{

	public FrameWindowListener()
	{
		setVisible(true);  // otherwise it will be not visible
		setSize(300,300);
		
		this.addWindowListener(this);
	}
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Opened Event");
	}


	@Override
	public void windowClosing(WindowEvent e) {

		System.exit(-1);
		System.out.println("Window Closing Event");
		
		
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
