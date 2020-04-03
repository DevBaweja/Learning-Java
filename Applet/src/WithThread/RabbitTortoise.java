package WithThread;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RabbitTortoise extends Applet implements Runnable,ActionListener{
	
	Thread Th1;
	int t,r,w;
	Button btstart,btencourage;
	Object src=null;
	
	public void init()
	{
		Font f1 = new Font("comic sans",Font.ITALIC+Font.BOLD,30);
		super.setFont(f1);
		super.setForeground(Color.blue);
		
		t=0;
		r=0;
		btstart = new Button("Start Race");
		btencourage = new Button("Encourage");
		add(btstart);
		add(btencourage);
		btencourage.setEnabled(false);
		
		btstart.addActionListener(this);
		btencourage.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		Font f1 = new Font("comic sans",Font.ITALIC+Font.BOLD,30);
			g.setFont(f1);
				g.drawString("Rabbit", 50+r, 100);
				g.drawString("Torroise", 50+t, 250);
	}

	@Override
	public void run() {
		while(true)
		{
			w = super.getSize().width;
		try {
			Thread.sleep(50);
			if(r<w/3) // after this
				{
					r +=15;
					t += 10;
				}
			else
				t += 10; // rabbit will stop
			
			if(src == btencourage) // this will be applied
				{
					t += 20; // tortoise will run faster
				}

					
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		repaint();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		src = e.getSource();
				if(src == btstart)
		{
					Th1 = new Thread(this);
					Th1.start();
					btencourage.setEnabled(true);
		}
		
	}
}
