package CardLayout;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DemoCardLayoutItemListener extends Applet implements ItemListener{
	
	Choice ch;
	Panel pmain,plist;
	CardLayout CLO;
	
	public void init()
	{
		setLayout(new BorderLayout());
		// Applet Size
	//	int w = getSize().width;
	//	int h = getSize().height;
		setSize(new Dimension(800,800));
		setPreferredSize(new Dimension(800,800));
		ch = new Choice();
		ch.add("MaxMinForm");
		ch.add("AOPForm");
		ch.add("CircleForm");
		ch.add("NumberForm");
		ch.add("SwapForm");
		
		
		
		CLO = new CardLayout();
		pmain = new Panel();
		pmain.setLayout(CLO);
		
		// Linking
		pmain.add("MaxMinForm",new MaxMinForm());
		pmain.add("AOPForm",new AOPForm());
		pmain.add("CircleForm",new CircleForm());
		pmain.add("NumberForm", new NumberForm());
		pmain.add("SwapForm",new SwapForm());
	
		
		plist = new Panel();
		plist.setLayout(new GridLayout(1,4));
		plist.add(ch);
		
		add(plist,BorderLayout.NORTH);
		add(pmain,BorderLayout.CENTER);
		
		
		ch.addItemListener(this);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		CLO.show(pmain, ch.getSelectedItem());
		
		
	}
	
	
}
