import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FirstFrame  extends Frame implements WindowListener{
	
	Label lb;
	public FirstFrame() {
		// TODO Auto-generated constructor stub
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setTitle("First Frame Window");
		
		lb = new Label("Hello");
		add(lb);
		this.addWindowListener(this);
	}
	


	public static void main(String[] args)
	{
		new FirstFrame();
	}



	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Opened");
	}



	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Closing");
		this.dispose();
	}



	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Closed");
	}



	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Iconified");
	}



	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Deiconified");
	}



	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Activated");
	}



	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Deactivated");
	}
}
