package WithThread;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopWatch extends Applet implements Runnable, ActionListener{

	
	Thread Th;
	Button btstart,btstop,btreset;
	int count;
	int w,h,a;
	
	public void init()
	{
		a=0;
		count = 0;
		btstart = new Button("Start");
		btstop = new Button("Stop");
		btreset = new Button("Reset");
		
		add(btstart);
		add(btstop);
		add(btreset);
		
		Th = new Thread(this);
		
		btstart.addActionListener(this);
		btstop.addActionListener(this);
		btreset.addActionListener(this);
	}
	
	public void paint(Graphics g)
	{
		w = super.getSize().width;
		h = super.getSize().height;
		g.drawString(Integer.toString(count), w/2,h/2);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			
				repaint();
					try {
							Th.sleep(1000);
						} catch (InterruptedException e) {
								e.printStackTrace();
							}
					count++;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
		
		if(src == btstart)
		{
				if(a==0)
			{
					Th.start();
					a=1;
			}
				else
			Th.resume();
		}
		else if(src == btstop)
		{
			Th.suspend(); // suspend and resume
		}
		else if(src == btreset)
		{
			count = 0;
			Th.suspend();
			repaint();
		}
	}



}
