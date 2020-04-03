import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class DemoRadio  extends Applet implements ItemListener{
	
	Checkbox chmale,chfemale;
	CheckboxGroup gr;
	Label lb; // same lb will be overwrite
	
	public void init()
	{
		gr = new CheckboxGroup();
		chmale = new Checkbox("Male",gr,false); 
		chfemale = new Checkbox("Female",gr,false);
		lb = new Label();
		// CheckboxGroup is for name in HTML. same for all 
		// True and False is for checked. 
		
		print();
		
		chmale.addItemListener(this);
		chfemale.addItemListener(this);
	}
	
	public void print()
	{
		add(new Label("Gender")); 
		// temp is created so we cannot apply any other font,colors.
		add(chmale);
		add(chfemale);
		add(lb);
	}
	
	public void itemStateChanged(ItemEvent e) {
	
		
		if(chmale.getState())
			lb.setText("Hello Mr");
		else if(chfemale.getState())
			lb.setText("Hello Mrs");
			
		validate();
	}
	
}
