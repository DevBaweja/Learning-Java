package ItemListener;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoPanels extends Applet implements ActionListener {
	
	
	Button btadd,btremove;
	Panel P1;
	
	public void init()
	{
		setLayout(new GridLayout(3, 1));
		btadd = new Button("Add");
		btremove = new Button("Remove");
		
		
		add(btadd);
		add(btremove);
	
		
		P1 = new Panel();
		P1.setLayout(new GridLayout(2,2));
		P1.add(new Label("Dev"));
		P1.add(new Label("Dev"));
		P1.add(new Label("Dev"));
		P1.add(new Label("Dev"));
		
		btadd.addActionListener(this);
		btremove.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		
		if(src == btadd)
		{
			add(P1); // over write process
		}
		else
		{
			remove(P1);
		}
		
		validate();
	}

}
