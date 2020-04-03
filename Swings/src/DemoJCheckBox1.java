
import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JApplet;
import javax.swing.JCheckBox;
import javax.swing.JLabel;



public class DemoJCheckBox1  extends JApplet implements ItemListener{
	
	JCheckBox chmusic,chread,chcook;
	JLabel lb1;
	
	public void init()
	{
		setLayout(new FlowLayout());
		chmusic = new JCheckBox("Music");
		chread = new JCheckBox("Read");
		chcook = new JCheckBox("Cook");
		lb1 = new JLabel();
	
		print();
		
		chmusic.addItemListener(this);
		chread.addItemListener(this);
		chcook.addItemListener(this); // must pass all of the check box
	}
	
	public void print()
	{
		add(new JLabel("Hobbies")); 
		// temp is created so we cannot apply any other font,colors.
		add(chmusic);
		add(chread);
		add(chcook);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		add(lb1);
		String res= "Hobbies are: "; 
		// every time check each state 
		if(chmusic.isSelected())
			{
				res += " Music";
			}
		if (chread.isSelected())
		{
			
			res += " Read";
		}
		
		if(chcook.isSelected())
		{	
			
			res += " Cook";
		}
		
		if(res.equals("Hobbies are: "))
		{
			lb1.setText("");
			validate();
			return;
		}
		lb1.setText(res);
		validate(); // to set it automatically
		
	}
	
}
