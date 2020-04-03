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

public class NumberForm extends Applet implements ActionListener{

	Panel P1,P2,P3,P4; 
	Label lb,lb1,lbres;
	TextField tx1,txresult;
	Button btfact,btprime;
	Button btrefresh,btclose;
	
	public void init()
	{
		
		super.setBackground(Color.pink);
		btfact = new Button("Factorial");
		btprime = new Button("Prime");
		btrefresh = new Button("Refresh");
		btclose = new Button("Close");
		
		lb = new Label("Number FORM");
		lb1 = new Label("First Number");
		lbres = new Label("Result");
		
		tx1 = new TextField();
		txresult = new TextField();
		txresult.setEnabled(false);
	
		print();
		style();
		btfact.addActionListener(this);
		btprime.addActionListener(this);
		btrefresh.addActionListener(this);
		btclose.addActionListener(this);
	}
	
	public void print()
	{
		
		Panel P1 = new Panel();
		P1.add(lb);
		
		Panel P2 = new Panel();
		P2.setLayout(new GridLayout(1,1));
		P2.add(lb1);
		P2.add(tx1);	
		
		Panel P3 = new Panel();
		P3.setLayout(new GridLayout(1,1));
		P3.add(lbres);
		P3.add(txresult);
		
		Panel P4  = new Panel();
		P4.setLayout(new GridLayout(1,4));		
		P4.add(btfact);
		P4.add(btprime);
		P4.add(btrefresh);
		P4.add(btclose);
	
	
		super.setLayout(new GridLayout(5,1,100,50));
		add(P1);
		add(P2);
		add(P3);
		add(P4);
	}
	
	public void style()
	{
		// Background Color
		lb.setBackground(Color.cyan);
		lb1.setBackground(Color.gray);
	
		tx1.setBackground(Color.lightGray);
		txresult.setBackground(Color.lightGray);
		
		btfact.setBackground(Color.magenta);
		btprime.setBackground(Color.magenta);
		btclose.setBackground(Color.red);
	
		
		// Font
		Font f1 = new Font("comic sans",Font.ITALIC,30);
		super.setFont(f1);

		
		Color c1 = new Color(200,210,75);
		lb.setForeground(c1);
		lb1.setForeground(c1);
		tx1.setForeground(Color.white);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		int a = Integer.parseInt(tx1.getText());
		
		if(src == btprime)
		{
			Boolean status=true;
			for(int num=a,i=2;i<=num/2;i++)
			{
		
				if(num%i==0)
				{
					status=false;
					break;
				}
			}
			if(status)
				txresult.setText(a+" is prime");
			else 
				txresult.setText(a+" is non-prime");
			
		}
		else if(src == btfact)
		{
			int fact=1;
			for(int i=a;i>=1;i--)
			{
				fact *= i;
			}
			txresult.setText(Integer.toString(fact));
			
		}
		else if(src == btrefresh)
		{
			tx1.setText("");
			txresult.setText("");
		}
		else 
		{
			System.exit(-1);	
		}
				
		
	}
}
