package CardLayout;
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

public class SwapForm  extends Panel implements ActionListener {
	
	Label lbbefore,lbafter;
	Label lbfirstnumber1,lbsecondnumber1;
	Label lbfirstnumber2,lbsecondnumber2;
	TextField txfirstnumber1,txsecondnumber1;
	TextField txfirstnumber2,txsecondnumber2;
	Button btswap;
	Button btrefresh,btclose;
	Panel P1,P2,P3,P4,P5;
	
	public SwapForm()
	{
		super.setBackground(Color.pink);

		lbfirstnumber1 = new Label("First Number");
		lbsecondnumber1 = new Label("Second Number");
		lbfirstnumber2 = new Label("First Number");
		lbsecondnumber2 = new Label("Second Number");
		lbbefore = new Label("Before Swapping");
		lbafter = new Label("After Swapping");
		


		
		txfirstnumber1 = new TextField(20);
		txsecondnumber1 = new TextField(20);
		txfirstnumber2 = new TextField(20);
		txsecondnumber2 = new TextField(20);
		txfirstnumber2.setEnabled(false);
		txsecondnumber2.setEnabled(false);
		
		btswap = new Button("Swap");
		btrefresh = new Button("Refresh");
		btclose = new Button("Close");

		
		// Creating Panels
		P1 = new Panel();

		P2 = new Panel();
		GridLayout g2 = new GridLayout(2,2,40,40);
		P2.setLayout(g2);
		
		P3 = new Panel();
		
		P4 = new Panel();
		P4.setLayout(g2);
		
		P5 = new Panel();
		GridLayout g5 = new GridLayout(1,3,40,40);
		P5.setLayout(g5);
				
style();

print();

	btswap.addActionListener(this);
	btrefresh.addActionListener(this);
	btclose.addActionListener(this);
		
	}
	
public void print()
{
	
	// Adding elements in Panel
	P1.add(lbbefore);
	
	P2.add(lbfirstnumber1);
	P2.add(txfirstnumber1);
	P2.add(lbsecondnumber1);
	P2.add(txsecondnumber1);
	
	P3.add(lbafter);
	
	P4.add(lbfirstnumber2);
	P4.add(txfirstnumber2);
	P4.add(lbsecondnumber2);
	P4.add(txsecondnumber2);
	
	P5.add(btswap);
	P5.add(btrefresh);
	P5.add(btclose);
	
	// Adding Panel
	setLayout(new GridLayout(5,1));
	add(P1);
	add(P2);
	add(P3);
	add(P4);
	add(P5);
}

public void style()
{
	// background color
	
	lbfirstnumber1.setBackground(Color.cyan);
	lbsecondnumber1.setBackground(Color.gray);
	lbfirstnumber2.setBackground(Color.cyan);
	lbsecondnumber2.setBackground(Color.gray);
	
	txfirstnumber1.setBackground(Color.black);
	txsecondnumber1.setBackground(Color.black);
	txfirstnumber2.setBackground(Color.black);
	txsecondnumber2.setBackground(Color.black);
	
	
	btswap.setBackground(Color.magenta);
	btclose.setBackground(Color.red);
	
	// font 
	
	Font f1 = new Font("comic sans",Font.ITALIC,20);
	lbfirstnumber1.setFont(f1);
	lbsecondnumber1.setFont(f1);
	lbfirstnumber2.setFont(f1);
	lbsecondnumber2.setFont(f1);
	
	btswap.setFont(f1);
	btrefresh.setFont(f1);
	btclose.setFont(f1);
	
	Font f2 = new Font("comic sans",Font.BOLD,30);
	lbbefore.setFont(f2);
	lbafter.setFont(f2);
	txfirstnumber1.setFont(f2);
	txsecondnumber1.setFont(f2);
	txfirstnumber2.setFont(f2);
	txsecondnumber2.setFont(f2);
	
	// foreground color
	Color c1 = new Color(200,210,75);
	lbfirstnumber1.setForeground(c1);
	lbsecondnumber1.setForeground(c1);
	lbfirstnumber2.setForeground(c1);
	lbsecondnumber2.setForeground(c1);
	txfirstnumber1.setForeground(Color.white);
	txsecondnumber1.setForeground(Color.white);
	txfirstnumber2.setForeground(Color.white);
	txsecondnumber2.setForeground(Color.white);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	
	Object src = e.getSource();
	
	int a = Integer.parseInt(txfirstnumber1.getText());
	int b = Integer.parseInt(txsecondnumber1.getText());
	
	if(src == btswap)
	{
		txfirstnumber2.setText(Integer.toString(b));
		txsecondnumber2.setText(Integer.toString(a));
	}
	else if(src == btrefresh)
	{
		txfirstnumber1.setText("");
		txsecondnumber1.setText("");
		txfirstnumber2.setText("");
		txsecondnumber2.setText("");
	}
	else 
	{
		System.exit(-1);
	}
	
}

}
