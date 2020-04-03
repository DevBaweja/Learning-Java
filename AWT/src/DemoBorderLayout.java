import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Label;

public class DemoBorderLayout extends Applet {

	Label lbn,lbs,lbc,lbw,lbe;
	
	public void init()
	{
	
		lbn = new Label("North Section");
		lbs = new Label("South Section");
		lbc = new Label("Center Section");
		lbw = new Label("West Section");
		lbe = new Label("East Section");
		
		super.setBackground(Color.magenta);
		lbn.setBackground(Color.cyan);
		lbs.setBackground(Color.black);
		lbc.setBackground(Color.blue);
		lbw.setBackground(Color.darkGray);
		lbe.setBackground(Color.green);
		//super.setForeground(Color.magenta);
		
		
		BorderLayout b = new BorderLayout(); // default Left Align
		setLayout(b);
		
		
		add(lbn,BorderLayout.NORTH);
		add(lbs,BorderLayout.SOUTH);
		add(lbc,BorderLayout.CENTER);
		add(lbw,BorderLayout.WEST);
		add(lbe,BorderLayout.EAST);
	}
	public Insets getTnsets()
	{
		return new Insets(150,150,100,100);
	}
	
}
