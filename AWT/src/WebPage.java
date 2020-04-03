import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class WebPage extends Applet {

	Button b[];
	Label lbname;
	Panel pn,pn1,pn2;
	
	public void init()
	{
		
		
		BorderLayout b = new BorderLayout();
		setLayout(b); // Body Border Layout
		
		
	panelnorth(); // Panel north

	}
	
	public void panelnorth()
	{
		b = new Button[4] ; // 4 ref 
		String []name = {"Puzzles","Algorithm","Languages","Quizzes"};
		for(int i=0;i<name.length;i++)
			b[i] = new Button(name[i]);

	
		lbname = new Label("GeeksForGeeks");
		
		// creating panel
		pn1 = new Panel();
		pn2 = new Panel();
		GridLayout g = new GridLayout(1,4);
		pn2.setLayout(g);
		
		//Adding Elements in sub-panel
		pn1.add(lbname);
		for(int i=0;i<b.length;i++)
			pn2.add(b[i]);
				
		
		// Adding sub-Panel into Panel
		
		pn = new Panel();
		GridLayout gn = new GridLayout(2,1);
		pn.setLayout(gn);
		pn.add(pn1);
		pn.add(pn2);
		

		// add this north panel
		add(pn,BorderLayout.NORTH);
	}
	
}
