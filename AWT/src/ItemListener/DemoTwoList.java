package ItemListener;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoTwoList extends Applet implements ActionListener{


	List l1,l2;
	Button b1,b2,b3,b4;
	Panel p;
	
	public void init()
	{
		setLayout(new GridLayout(1,3,500,500));
		
		l1 = new List();
		l2 = new List();
		
		l1.add("Butter");
		l1.add("Honey");
		l1.add("Milk");
		l1.add("Water");
		
		l2.add("Bread");
		l2.add("Egg");
		l2.add("Milk");
		l2.add("Coffee");
		
		b1 = new Button(">>");
		b2 = new Button("<<");
		b3 = new Button(">>>>");
		b4 = new Button("<<<<");
	
		p = new Panel();
		p.setLayout(new GridLayout(4,1));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		add(l1);
		add(p);
		add(l2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		
	/*	for(int i=0;i<l1.getItemCount();i++)
		{
			if(! l1.isSelected(i));
			{
				b1.setEnabled(true);
				System.out.println(i);
			}
		} */
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		
		if(src == b1)
		{
			if(l1.getSelectedIndex()==-1)
				return;
			String a =  l1.getSelectedItem() ;
			l2.add(a); // will add this at the end
			l1.remove(a);
			
			// Only for removing
			// int i = l1.getSelectedIndex();
			// l1.remove(i);
		}
		else if(src == b2)
		{
			if(l2.getSelectedIndex()==-1)
				return;
			String a = l2.getSelectedItem();
			l1.add(a); // will add this at the end
			l2.remove(a);
		}
		else if(src == b3)
		{
			for(int i=0; i < l1.getItemCount();i++)
				l2.add( l1.getItem(i) );
				
				l1.removeAll();
		}
		else if(src == b4)
		{
			for(int i=0 ; i< l2.getItemCount();i++)
				l1.add( l2.getItem(i));
			
			l2.removeAll();
		}
	}
	
	
}
