package ScrollBar;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class DemoScrollBarColor extends Applet implements AdjustmentListener{

	Label lbred,lbgreen,lbblue,lbnew;
	Scrollbar sbred,sbgreen,sbblue;
	Button color;
	Panel P,Phead;
	
	public void init()
	{

		color = new Button();
		
		lbred = new Label("RED");
		lbgreen = new Label("GREEN");
		lbblue = new Label("BLUE");
		lbnew = new Label("New Color");
		
		sbred = new Scrollbar();
		sbgreen = new Scrollbar();
		sbblue = new Scrollbar();
		
		sbred.setOrientation(Scrollbar.HORIZONTAL);
		sbgreen.setOrientation(Scrollbar.HORIZONTAL);
		sbblue.setOrientation(Scrollbar.HORIZONTAL);
		sbred.setMaximum(255);
		sbgreen.setMaximum(255);
		sbblue.setMaximum(255);
		sbred.setUnitIncrement(5);
		sbred.setBlockIncrement(20);
		sbgreen.setUnitIncrement(5);
		sbgreen.setBlockIncrement(20);
		sbblue.setUnitIncrement(5);
		sbblue.setBlockIncrement(20);

		Phead = new Panel();
		Phead.add(new Label("Color Changing Form"));
		P = new Panel();
		P.setLayout(new GridLayout(6,2,90,90));
	
		
		P.add(new Label());
		P.add(new Label());
		P.add(lbred);
		P.add(sbred);
		P.add(lbgreen);
		P.add(sbgreen);
		P.add(lbblue);
		P.add(sbblue);
		P.add(lbnew);
		P.add(color);
		P.add(new Label());
		P.add(new Label());
		
		setLayout(new BorderLayout());
		
		add(Phead,BorderLayout.NORTH);
		add(P,BorderLayout.CENTER);
		
		
		lbred.setForeground(Color.red);
		lbgreen.setForeground(Color.green);
		lbblue.setForeground(Color.blue);
		
		Font f1 = new Font("comic sans",Font.BOLD+Font.ITALIC,30);
		super.setFont(f1);

		sbred.addAdjustmentListener(this);
		sbgreen.addAdjustmentListener(this);
		sbblue.addAdjustmentListener(this);
	}



	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
		
		Color r = new Color(sbred.getValue(),0,0);
		Color g = new Color(0, sbgreen.getValue(), 0);
		Color b = new Color(0, 0, sbblue.getValue());
		
		sbred.setBackground(r);
		sbgreen.setBackground(g);
		sbblue.setBackground(b);
		
		Color c1 = new Color(sbred.getValue(), sbgreen.getValue(), sbblue.getValue());
		color.setBackground(c1);
		lbnew.setForeground(c1);
		
		showStatus("rr: "+sbred.getValue()+",gg: "+sbgreen.getValue()+",bb: "+sbblue.getValue());
	}
}
