package ActionListener;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AOPForm extends Applet implements ActionListener{

	Panel P1,P2,P3,P4,P5; 
	Label lb,lb1,lb2,lbres;
	TextField tx1,tx2,txresult;
	Button btadd,btsub,btmul,btdiv,btmod;
	Button btrefresh,btclose;
	
	public void init()
	{
		
		super.setBackground(Color.pink);
		btadd = new Button("+");
		btsub = new Button("-");
		btmul = new Button("*");
		btdiv = new Button("/");
		btmod = new Button("%");
		btrefresh = new Button("Refresh");
		btclose = new Button("Close");
		
		lb = new Label("AOP FORM");
		lb1 = new Label("First Number");
		lb2 = new Label("Second Number");
		lbres = new Label("Result");
		
		tx1 = new TextField();
		tx2 = new TextField();
		txresult = new TextField();
		txresult.setEnabled(false);
	
		print();
		
		style();
		
		btadd.addActionListener(this);
		btsub.addActionListener(this);
		btmul.addActionListener(this);
		btdiv.addActionListener(this);
		btmod.addActionListener(this);
		btrefresh.addActionListener(this);
		btclose.addActionListener(this);
		
	}
	
	public void print()
	{
		
		Panel P1 = new Panel();
		P1.add(lb);
		
		Panel P2 = new Panel();
		P2.setLayout(new GridLayout(2,2));
		P2.add(lb1);
		P2.add(tx1);	
		P2.add(lb2);
		P2.add(tx2);
		
		Panel P3 = new Panel();
		P3.setLayout(new GridLayout(1,2));
		P3.add(lbres);
		P3.add(txresult);
		
		Panel P4  = new Panel();
		P4.setLayout(new GridLayout(1,5));		
		P4.add(btadd);
		P4.add(btsub);
		P4.add(btmul);
		P4.add(btdiv);
		P4.add(btmod);
		
		Panel P5 = new Panel();
		P5.setLayout(new GridLayout(1,2));		
		P5.add(btrefresh);
		P5.add(btclose);
		
		
		super.setLayout(new GridLayout(5,1,100,50));
		add(P1);
		add(P2);
		add(P3);
		add(P4);
		add(P5);
	}
	
	public void style()
	{
		// Background Color
		lb.setBackground(Color.cyan);
		lb1.setBackground(Color.gray);
		lb2.setBackground(Color.green);
	
		tx1.setBackground(Color.lightGray);
		tx2.setBackground(Color.lightGray);
		txresult.setBackground(Color.lightGray);
		
		btadd.setBackground(Color.magenta);
		btsub.setBackground(Color.magenta);
		btmul.setBackground(Color.magenta);
		btdiv.setBackground(Color.magenta);
		btmod.setBackground(Color.magenta);
		btclose.setBackground(Color.red);
	
		
		// Font
		Font f1 = new Font("comic sans",Font.ITALIC,30);
		super.setFont(f1);

		
		Color c1 = new Color(200,210,75);
		lb.setForeground(c1);
		lb1.setForeground(c1);
		lb2.setForeground(c1);
		tx1.setForeground(Color.white);
		tx2.setForeground(Color.white);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		Object src = e.getSource();
		float a = Float.parseFloat(tx1.getText());
		float b = Float.parseFloat(tx2.getText());
		float c;
		if(src == btadd)
		{
			c = a+b;
			txresult.setText(Float.toString(c));
		}
		else if(src == btsub)
		{
			c = a-b;
			txresult.setText(Float.toString(c));	
		}
		else if(src == btmul)
		{
			c = a*b;
			txresult.setText(Float.toString(c));
		}
		else if(src == btdiv)
		{
			c = a/b;
			txresult.setText(Float.toString(c));
		}
		else if(src == btmod)
		{
			c = a%b;
			txresult.setText(Float.toString(c));
		}
		else if(src == btrefresh)
		{
			tx1.setText("");
			tx2.setText("");
			txresult.setText("");
		}
		else if(src == btclose)
		{
			System.exit(-1);
		}
		
	}
}
