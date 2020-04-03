
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JRadioButton;



public class DemoJRadioButton1  extends JApplet implements ItemListener{
	
	JRadioButton chmale,chfemale;
	ButtonGroup gr;
	JLabel lb; // same lb will be overwrite
	
	public void init()
	{
		setLayout(new FlowLayout());
		gr = new ButtonGroup();
		chmale = new JRadioButton("Male"); 
		chfemale = new JRadioButton("Female");
		gr.add(chmale);
		gr.add(chfemale);
		
	//	chmale.setSelected(true);
		
		lb = new JLabel();
		// CheckboxGroup is for name in HTML. same for all 
		// True and False is for checked. 
		
		print();
		
		chmale.addItemListener(this);
		chfemale.addItemListener(this);
	}
	
	public void print()
	{
		add(new JLabel("Gender")); 
		// temp is created so we cannot apply any other font,colors.
		add(chmale);
		add(chfemale);
		add(lb);
	}
	
	public void itemStateChanged(ItemEvent e) {
	
		
		if(chmale.isSelected())
			lb.setText("Hello Mr");
		else if(chfemale.isSelected())
			lb.setText("Hello Mrs");
			
		validate();
	}
	
}
