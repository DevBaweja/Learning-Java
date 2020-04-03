import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

public class DemoJToolBar extends JApplet{

	JToolBar jtb;
	JLabel lb1,lb2;
	JButton bt1,bt2;
	JComboBox cb;
	JRadioButton  jb1,jb2,jb3;
	ButtonGroup grp;
	public void init()
	{
		lb1 = new JLabel("Label1");
		lb2 = new JLabel("Label2");
		bt1 = new JButton("Button1");
		bt2 = new JButton("Button2");
		cb = new JComboBox();

		cb.addItem("C");
		cb.addItem("C++");
		cb.addItem("Java");
		 
		// in place of add()
		// cb.setSelectedIndex(anIndex); in place of cb.select(index)
		
	grp = new ButtonGroup();
		
		jb1 = new  JRadioButton("C");
		jb2 = new JRadioButton("C++");
		jb3 = new JRadioButton("Java");
		
		// jb1.isSelected(); in place of jb1.getState();
		// jb1.setSelected(false); in place of jb1.setstate(false); 
 		
		grp.add(jb1);
		grp.add(jb2);
		grp.add(jb3);

		
		jtb = new JToolBar();
		jtb.add(lb1);
		jtb.add(lb2);
		jtb.addSeparator();
		jtb.add(bt1);
		jtb.add(bt2);	
		jtb.addSeparator();
		jtb.add(cb);
		jtb.addSeparator();
		
		jtb.add(jb1);
		jtb.add(jb2);
		jtb.add(jb3);
		
		
		add(jtb);
	}
}
