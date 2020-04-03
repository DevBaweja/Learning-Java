import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;

import javax.swing.border.Border;

public class MyWebPage extends Applet {

	// For north panel
	Choice chpuzzle,chlang;
	Button btalgo,btquiz;
	
	Label lbname;
	Panel pn,pn1,pn2;
	
	// For South 
	TextArea txfeed;
	Panel ps,ps1,ps2;
	Checkbox chyes,chno;
	CheckboxGroup like;
	
	Panel pc,pw,pe;
	
	public void init()
	{
		
		pc = new Panel();
		pw = new Panel();
		pe = new Panel();
		
		BorderLayout b = new BorderLayout();
		setLayout(b); // Body Border Layout
		
		
	panelnorth(); // Panel north
	panelsouth(); // Panel South
	add(pc,BorderLayout.CENTER);
	add(pw,BorderLayout.WEST);
	add(pe,BorderLayout.EAST);

	}
	
	public void panelnorth()
	{
	
		btalgo = new Button("Algorithms");
		btquiz = new Button("Quiz");
	
		chlang = new Choice();
		chlang.add("Choice Language");
		chlang.add(" C ");
		chlang.add(" C++ ");
		chlang.add(" Java ");
		chlang.add(" Python ");
		
		chpuzzle = new Choice();
		chpuzzle.add("Choice Puzzle Topic");
		chpuzzle.add("General Ques");
		chpuzzle.add("Theory");
		chpuzzle.add("Explaining");
		chpuzzle.add("Another Topics");
	
		lbname = new Label("GeeksForGeeks");
		
		
		
		// creating panel
		pn1 = new Panel();
		pn2 = new Panel();
		GridLayout gnb = new GridLayout(1,4);
		pn2.setLayout(gnb);
		
		//Adding Elements in sub-panel
		pn1.add(lbname);
		pn2.add(chlang);
		pn2.add(btalgo);
		pn2.add(chpuzzle);
		pn2.add(btquiz);
		
		
		// Adding sub-Panel into Panel
		pn = new Panel();
		GridLayout gn = new GridLayout(2,1);
		pn.setLayout(gn);
		
		pn.add(pn1);
		pn.add(pn2);
		

		// add this north panel
		add(pn,BorderLayout.NORTH);
	}
	
	public void panelsouth()
	{
	
		txfeed = new TextArea(10,10);
		
		like = new CheckboxGroup();
		chyes = new Checkbox("YES",like, true);
		chno = new Checkbox("NO",like,false);
		
		
		// creating panel
		ps1 = new Panel();
		GridLayout gs1 = new GridLayout(1,2);
		ps2 = new Panel();
		GridLayout gs2 = new GridLayout(1,3);
		ps2.setLayout(gs2);
		
		//Adding Elements in sub-panel
		ps1.add(new Label("FeedBacks:"));
		ps1.add(txfeed);
		ps2.add(new Label("Do You Like This WebSite"));
		ps2.add(chyes);
		ps2.add(chno);
		
		
		// Adding sub-Panel into Panel
		ps = new Panel();
		BorderLayout bs = new BorderLayout();
		ps.setLayout(bs);
		
		ps.add(ps1,BorderLayout.WEST);
		ps.add(ps2,BorderLayout.NORTH);
		

		// add this north panel
		add(ps,BorderLayout.SOUTH);
	}
	
}
