package Panel;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class PetrolPumpBill extends Applet{

	Panel P1,P2,P3,P4,P5,P6; 
	Label lb,lbitem,lbrate,lbqty,lbamount;
	Choice  chitems;
	TextField txrate,txqty,txamount;
	Button btcal,btbill,btrefresh,btclose;
	
	public void init()
	{
		
		super.setBackground(Color.pink);
		btcal = new Button("Calculate");
		btbill = new Button("Bill");
		btrefresh = new Button("Refresh");
		btclose = new Button("Close");
		
		lb = new Label("Petrol Pump Bill");
		lbitem = new Label("Items");
		lbrate = new Label("Rate");
		lbqty = new Label("Quantity");
		lbamount = new Label("Amount");
		
		chitems = new Choice();
		chitems.add("Select Items");
		chitems.add("Petrol");
		chitems.add("Diesel");
		
		txrate = new TextField();
		txqty = new TextField();
		txamount = new TextField();

	
		print();
		
		style();
	}
	
	public void print()
	{
		
		Panel P1 = new Panel();
		P1.add(lb);
		
		Panel P2 = new Panel();
		P2.setLayout(new GridLayout(1,1));
		P2.add(lbitem);
		P2.add(chitems);	

		
		Panel P3 = new Panel();
		P3.setLayout(new GridLayout(1,1));
		P3.add(lbrate);
		P3.add(txrate);

		
		Panel P4  = new Panel();
		P4.setLayout(new GridLayout(1,2));	
		P4.add(lbqty);
		P4.add(txqty);
		
		Panel P5  = new Panel();
		P5.setLayout(new GridLayout(1,2));	
		P5.add(lbamount);
		P5.add(txamount);
		
		Panel P6 = new Panel();
		P6.setLayout(new GridLayout(1,4));	
		P6.add(btcal);
		P6.add(btbill);
		P6.add(btrefresh);
		P6.add(btclose);
		
		
		super.setLayout(new GridLayout(6,1,50,50));
		add(P1);
		add(P2);
		add(P3);
		add(P4);
		add(P5);
		add(P6);
	}
	
	public void style()
	{
		// Background Color
		lb.setBackground(Color.cyan);
		lbitem.setBackground(Color.gray);
		lbrate.setBackground(Color.green);
		lbqty.setBackground(Color.orange);
		lbamount.setBackground(Color.blue);
	
		chitems.setBackground(Color.lightGray);
		txrate.setBackground(Color.lightGray);
		txqty.setBackground(Color.lightGray);
		txamount.setBackground(Color.lightGray);
		
		btcal.setBackground(Color.magenta);
		btbill.setBackground(Color.magenta);
		btclose.setBackground(Color.red);
	
		
		// Font
		Font f1 = new Font("comic sans",Font.ITALIC,30);
		super.setFont(f1);
		Font f2 = new Font("comic sans",Font.ITALIC,15);
		chitems.setFont(f2);

		
		Color c1 = new Color(200,210,75);
		lb.setForeground(c1);
		lbitem.setForeground(c1);
		lbrate.setForeground(c1);
		lbqty.setForeground(c1);
		lbamount.setForeground(c1);
		
		chitems.setForeground(Color.white);
		txrate.setForeground(Color.white);
		txqty.setForeground(Color.white);
		txamount.setForeground(Color.white);
	}
}
