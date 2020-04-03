import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class DemoJProgreeBar extends JApplet implements ActionListener,Runnable{

	JProgressBar jpb;
	JButton bt,bt1,bt2;
	JPanel p;
	Thread Th;
	int a;
	public void init()
	{
		Th = new Thread(this);
		
		a=0;
 		p = new JPanel();
		bt = new JButton("Current Value");
		bt1 = new JButton("Start");
		bt2 = new JButton("Stop");
		p.add(bt);
		p.add(bt1);
		
		jpb = new JProgressBar();
		
		jpb.setStringPainted(true);
		jpb.setBorderPainted(true);
		
		//jpb.setMaximum(400);
		//jpb.setMinimum(200);
		//jpb.setValue(250);
		
		add(jpb,BorderLayout.NORTH);
		add(p,BorderLayout.SOUTH);
		
		bt.addActionListener(this);
		bt1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		
		if(src == bt)
		{
			showStatus("Value is :"+jpb.getValue()+"%");
		}
		else if(src == bt1)
		{
			if(a==0)
				{
					Th.start();
					a=1;
				}
			else
				Th.resume();
				bt1.setEnabled(false);
		}
		else if(src == bt2)
		{
			Th.stop();
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++)
		{
			try {
				Th.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			jpb.setValue(jpb.getValue()+20);
			if(jpb.getValue()>=100)
			{
				jpb.setValue(0);
				bt1.setEnabled(true);
				Th.suspend();
			}
		}
	}
}
