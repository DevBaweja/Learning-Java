import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class DemoJRadioButton extends JApplet implements ActionListener{ 

	JRadioButton jb1,jb2,jb3;
	ButtonGroup grp;

	JLabel lb;
	
	public void init()
	{
		setLayout(new FlowLayout());
		grp = new ButtonGroup();
		
		jb1 = new  JRadioButton("C");
		jb2 = new JRadioButton("C++");
		jb3 = new JRadioButton("Java");
		
		// jb1.isSelected(); in place of jb1.getState();
		// jb1.setSelected(false); in place of jb1.setstate(false); 
 		
		grp.add(jb1);
		grp.add(jb2);
		grp.add(jb3);
		lb = new JLabel();
		
		add(jb1);
		add(jb2);
		add(jb3);
		
		add(lb);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
		Object src = e.getSource();
		
		
		if(src == jb1)
		{
			lb.setText("Selected is : C");
		}
		else if(src == jb2)
		{
			lb.setText("Selected is: C++");
		}
		else if(src == jb3)
		{
			lb.setText("Selected is: Java");
		}
		
		validate();
	}
}
