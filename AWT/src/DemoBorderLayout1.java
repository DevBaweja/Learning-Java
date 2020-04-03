import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;

public class DemoBorderLayout1 extends Applet {

	Label lbn,lbs,lbc,lbw,lbe,lbcc;
	Panel pn,ps,pc,pw,pe;
	
	public void init()
	{
	
		lbn = new Label("North Section");
		lbs = new Label("South Section");
		lbc = new Label("Center Section");
		lbcc = new Label("Center Section");
		lbw = new Label("West Section");
		lbe = new Label("East Section");
		
	
		
		// Adding elements in panel
		pn = new Panel();
		pn.add(lbn);
		ps = new Panel();
		ps.add(lbs);
		pc = new Panel();
		pc.add(lbc);
		pc.add(lbcc);
		pw = new Panel();
		pw.add(lbw);
		pe = new Panel();
		pe.add(lbe);

		lbn.setBackground(Color.cyan);
		lbs.setBackground(Color.black);
		lbc.setBackground(Color.blue);
		lbw.setBackground(Color.darkGray);
		lbe.setBackground(Color.green);
		lbcc.setBackground(Color.green);
		super.setForeground(Color.magenta);
		pc.setBackground(Color.orange);
		
		BorderLayout b = new BorderLayout(); // default Left Align
		setLayout(b);
		
		// adding panels
	// panel default align is center
		// panel default flowlayout
		add(pn,BorderLayout.NORTH);
		add(ps,BorderLayout.SOUTH);
		add(pc,BorderLayout.CENTER);
		add(pw,BorderLayout.WEST);
		add(pe,BorderLayout.EAST);
	}
	
}
