package Panel;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class MinMaxPanel  extends Applet {
	
	Label lbfirstnumber,lbsecondnumber,lbthirdnumber,lbresult;
	TextField txfirstnumber,txsecondnumber,txthirdnumber,txresult;
	Button btmax,btmin;
	Button btrefresh,btclose;
	Panel P1,P2;
	
	public void init()
	{
		super.setBackground(Color.pink); // absolute background color

		lbfirstnumber = new Label("First Number");
		lbsecondnumber = new Label("Second Number");
		lbthirdnumber = new Label("Third Number");
		lbresult = new Label("Result");

		
		txfirstnumber = new TextField(20);
		txsecondnumber = new TextField(20);
		txthirdnumber = new TextField(20);
		
		btmax = new Button("Max");
		btmin = new Button("Min");
		
		btrefresh = new Button("Refresh");
		btclose = new Button("Close");
	
		// 
		P1 = new Panel();
		GridLayout g1 = new GridLayout(3,3,40,40);
		P1.setLayout(g1);
		
		P2 = new Panel();
		GridLayout g2 = new GridLayout(1,4,200,200);
		P2.setLayout(g2);
		
style();
print();
	}
	
	public void print()
	{
		// Adding elements in Panel
		P1.add(lbfirstnumber); 
		P1.add(txfirstnumber);
		P1.add(lbsecondnumber);
		P1.add(txsecondnumber);
		P1.add(lbthirdnumber);
		P1.add(txthirdnumber);
		
		
		P2.add(btmax);
		P2.add(btmin);
		P2.add(btrefresh);
		P2.add(btclose);
		
		
		// Adding Panel
		GridLayout g = new GridLayout(2,1,50,50);
		super.setLayout(g);
		add(P1);
		add(P2);

	}
	
	public void style()
	{
		
		// Background Color
		lbfirstnumber.setBackground(Color.cyan);
		lbsecondnumber.setBackground(Color.gray);
		lbthirdnumber.setBackground(Color.green);
	
		txfirstnumber.setBackground(Color.lightGray);
		txsecondnumber.setBackground(Color.lightGray);
		txthirdnumber.setBackground(Color.lightGray);
		
		
		btmax.setBackground(Color.magenta);
		btmin.setBackground(Color.magenta);
		btclose.setBackground(Color.red);
		
		// Font
		Font f1 = new Font("comic sans",Font.ITALIC,30);
		super.setFont(f1);
		/* lbfirstnumber.setFont(f1);
		lbsecondnumber.setFont(f1);
		lbthirdnumber.setFont(f1);
		
		btmax.setFont(f1);
		btmin.setFont(f1);
		btrefresh.setFont(f1);
		btclose.setFont(f1); */
		
		// Foreground color
		
		Color c1 = new Color(200,210,75);
		lbfirstnumber.setForeground(c1);
		lbsecondnumber.setForeground(c1);
		lbthirdnumber.setForeground(c1);
	}
	
	
}
