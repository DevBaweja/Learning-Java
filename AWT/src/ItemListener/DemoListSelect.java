package ItemListener;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DemoListSelect extends Applet implements ItemListener{
	List lscountry ,lscapital;
	Label lbcountry,lbcapital;

	public void init()
	{
		lscountry = new List();
		lscountry.add("India");
		lscountry.add("Pakistan");
		lscountry.add("Srilanka");
		lscountry.add("Bangladesh");
		
		lscountry.setSize(new Dimension(700, 1000));
		lscountry.setPreferredSize(new Dimension(700, 1000));
		
		lscapital = new List();
		lscapital.add("Delhi");
		lscapital.add("Islamabad");
		lscapital.add("Colmbo");
		lscapital.add("Dakha");

		lbcountry = new Label("Country is: ");
		lbcapital = new Label("Capital is: ");
		lbcapital.setPreferredSize(new Dimension(100, 200));
		lbcapital.setSize(new Dimension(100, 200));
		
		add(lscountry);
		add(lscapital);
		add(lbcountry);
		add(lbcapital);
		
		lscountry.addItemListener(this);
		
		
		
		}


	@Override
	public void itemStateChanged(ItemEvent ie) {
	
			lscapital.select( lscountry.getSelectedIndex() );
			
		lbcountry.setText("Country is: "+lscountry.getSelectedItem()); // overwrite previous label
		lbcapital.setText("Capital is: "+lscapital.getSelectedItem());
		
		validate();
		
		
	}
	
}
