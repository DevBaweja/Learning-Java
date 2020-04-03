
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPetrolPumpBill extends JApplet implements ActionListener,ItemListener{

	JPanel P1,P2,P3,P4,P5,P6; 
	JLabel lb,lbitem,lbrate,lbqty,lbamount;
	JComboBox  chitems;
	JTextField txrate,txqty,txamount;
	JButton btcal,btbill,btrefresh,btclose;
	
	public void init()
	{
		
		super.setBackground(Color.pink);
		btcal = new JButton("Calculate");
		btbill = new JButton("Bill");
		btrefresh = new JButton("Refresh");
		btclose = new JButton("Close");
		
		lb = new JLabel("Petrol Pump Bill");
		lbitem = new JLabel("Items");
		lbrate = new JLabel("Rate");
		lbqty = new JLabel("Quantity");
		lbamount = new JLabel("Amount");
		
		chitems = new JComboBox();
		chitems.addItem("Select Items");
		chitems.addItem("Petrol");
		chitems.addItem("Diesel");
		
		txrate = new JTextField();
		txrate.setEnabled(false);
		txqty = new JTextField();
		txamount = new JTextField();
		txamount.setEnabled(false);

	
		print();
		
		style();
		
		btcal.addActionListener(this);
		btbill.addActionListener(this);
		btrefresh.addActionListener(this);
		btclose.addActionListener(this);
		
		chitems.addItemListener(this);
	}
	
	public void print()
	{
		
		JPanel P1 = new JPanel();
		P1.add(lb);
		
		JPanel P2 = new JPanel();
		P2.setLayout(new GridLayout(1,1));
		P2.add(lbitem);
		P2.add(chitems);	

		
		JPanel P3 = new JPanel();
		P3.setLayout(new GridLayout(1,1));
		P3.add(lbrate);
		P3.add(txrate);

		
		JPanel P4  = new JPanel();
		P4.setLayout(new GridLayout(1,2));	
		P4.add(lbqty);
		P4.add(txqty);
		
		JPanel P5  = new JPanel();
		P5.setLayout(new GridLayout(1,2));	
		P5.add(lbamount);
		P5.add(txamount);
		
		
		JPanel P6 = new JPanel();
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

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Object src = ae.getSource();
		
		if(src == btcal || src == btbill)
		{
			float a = Float.parseFloat(txrate.getText());
			float b = Float.parseFloat(txqty.getText());
			
			float c = a*b;
			txamount.setText(c+"");
		}
		else
		if(src == btrefresh)
		{
			txqty.setText(" ");
			txamount.setText(" ");
			txrate.setText(" ");
			chitems.setSelectedIndex(0);;
		}
		else
		{
			System.exit(-1);
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		
		// no need of source as only one can do it
		
		
	/*	int index = chitems.getSelectedIndex(); // will give index
		float rate = 0.0f;
		
		
		switch(index)
		{
			case 1: rate = 72.5f; break;
			case 2: rate = 52.4f; break;
		}
		txrate.setText(rate+"");
		*/
		
		
		String items = chitems.getSelectedItem().toString(); // will give item name
		float rate = 0.0f;
		
		if(items.equalsIgnoreCase("Petrol"))
			rate = 72.5f;
		else if(items.equalsIgnoreCase("Diesel"))
			rate = 52.4f;
		
		txrate.setText(rate+"");
		
		txqty.requestFocus();
		
	}
}
