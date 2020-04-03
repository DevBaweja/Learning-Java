package Frame;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDialogue extends Frame implements ActionListener,WindowListener{

	Dialog d;
	Button bopen,bclose;
	
	public FrameDialogue()
	{
		setVisible(true);
		setSize(400, 400);
		setTitle("myframe");
		
		setLayout(new FlowLayout());
		
		bopen = new Button("open");
		bclose = new Button("close");
		
		add(bopen);
		add(bclose);
		
		this.addWindowListener(this);
		bopen.addActionListener(this);
		bclose.addActionListener(this);
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		
		if(src == bopen)
		{
		//	if(d != null )
			//	d.dispose(); // to remove already dialog 
			d = new Dialog(this); // border layout
			d.setSize(100,100);
			d.setVisible(true);
			
			d.setLayout(new FlowLayout());
			
			d.add(new Label("Hello"));
			d.add(new Label("How Are You ?"));
			
			d.addWindowListener(this);
		}
		else if(src == bclose)
		{
			d.dispose();
		}
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent we) {
	
		Object src = we.getSource();
		if(src == d)
		{
			d.dispose();
		}
		else
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
