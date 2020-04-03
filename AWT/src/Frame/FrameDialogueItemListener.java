package Frame;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDialogueItemListener extends Frame implements ItemListener,WindowListener{
	
	// Making panel card then putting it into 
	Choice ch;
	Dialog d;
	
	public FrameDialogueItemListener() // constructor
	{
		
		setVisible(true);
		setSize(800, 800);
		setLayout(new FlowLayout());
		
		ch = new Choice();
		
		ch.add("Select Form");
		ch.add("AOPForm");
		ch.add("CircleForm");
		ch.add("MaxMainForm");

		add(ch);

		ch.addItemListener(this);
		this.addWindowListener(this);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
// only one list
		
		if(d != null)
			d.dispose();
		
		int a = ch.getSelectedIndex();
		
		switch(a)
		{
			case 1 :
				{
					d = new AOPForm(this);  // Frame super class
					break;
				}
			case 2 :
			{
				d = new CircleForm(this);
				break;
			}
			case 3:
			{
				d = new MaxMinForm(this);
				break;
			}
		}
		d.addWindowListener(this);	
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent we) {
		// TODO Auto-generated method stub
		
		Object src = we.getSource();
		if(src == d)
		{
			d.dispose();
		}
		else
		this.dispose();
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
