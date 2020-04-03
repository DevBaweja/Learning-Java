package ItemListener;
import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class DemoCheckBox  extends Applet implements ItemListener{
	
	Checkbox chmusic,chread,chcook;
	Label lb1;
	
	public void init()
	{
		chmusic = new Checkbox("Music");
		chread = new Checkbox("Read");
		chcook = new Checkbox("Cook");
		lb1 = new Label();
	
		print();
		
		chmusic.addItemListener(this);
		chread.addItemListener(this);
		chcook.addItemListener(this); // must pass all of the check box
	}
	
	public void print()
	{
		add(new Label("Hobbies")); 
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
		if(chmusic.getState())
			{
				res += " Music";
			}
		if (chread.getState())
		{
			
			res += " Read";
		}
		
		if(chcook.getState())
		{	
			
			res += " Cook";
		}
		
		lb1.setText(res);
		validate(); // to set it automatically
		
	}
	
}
