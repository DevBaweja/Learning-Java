package ItemListener;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoPanel1 extends Applet implements ActionListener {
	
	
	Button btadd,btremove;
	Panel P1;
	
	public void init()
	{
		setLayout(new GridLayout(3, 1));
		btadd = new Button("Add");
		btremove = new Button("Remove");
		
		
		add(btadd);
		add(btremove);

		
		btadd.addActionListener(this);
		btremove.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		
		if(src == btadd)
		{
			if(P1 != null)
				remove(P1);  // donot add if already 
			P1 = new Panel();
			P1.setLayout(new GridLayout(2,2));
			P1.add(new Label("Dev"));
			P1.add(new Label("Dev"));
			P1.add(new Label("Dev"));
			P1.add(new Label("Dev"));
			add(P1); // Multiple add
		}
		else
		{
			if(P1 != null)
			remove(P1);
		}
		
		validate();
	}

}
