package CardLayout;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoCardLayoutActionListener extends Applet implements ActionListener{
	
	// Making panel card then putting it into 
	Button b1,b2,b3,b4;
	Panel pmain,pbutton;
	CardLayout CLO;
	
	public void init()
	{
		setLayout(new BorderLayout());
		
		// Applet size
		setSize(new Dimension(700, 700));
		setPreferredSize(new Dimension(700, 700));
		
		b1 = new Button("First");
		b2 = new Button("Next");
		b3 = new Button("Pre");
		b4 = new Button("Last");
		
		
		CLO = new CardLayout();
		pmain = new Panel();
		
		int w = super.getSize().width;
		int h = super.getSize().height;
		pmain.setPreferredSize(new Dimension(w/2, h/2));
		pmain.setLayout(CLO);
		// Linking
		pmain.add("MaxMinForm",new MaxMinForm());
		pmain.add("AOPForm",new AOPForm());
		pmain.add("CircleForm",new CircleForm());
		pmain.add("NumberForm", new NumberForm());
		pmain.add("SwapForm",new SwapForm());
	
		
		pbutton = new Panel();
		pbutton.setLayout(new GridLayout(1,4));
		pbutton.add(b1);
		pbutton.add(b2);
		pbutton.add(b3);
		pbutton.add(b4);
		
		add(pbutton,BorderLayout.NORTH);
		add(pmain,BorderLayout.CENTER);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		if(src == b1)
		{
			CLO.first(pmain);
		}
		else if(src == b2)
		{
			CLO.next(pmain);
		}
		else if(src == b3)
		{
			CLO.previous(pmain);
		}
		else 
		{
			CLO.last(pmain);
		}
				
		
	}
}
