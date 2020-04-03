package FocusListener;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JOptionPane;

public class LoginForm  extends Applet implements ActionListener,FocusListener {
	
	Label lbuser,lbpass;
	TextField txuser,txpass;
	Button btsubmit,btcancel;
	
	public void init()
	{
		super.setBackground(Color.blue);
		
		super.setSize(new Dimension(400, 400));
		super.setPreferredSize(new Dimension(400, 400));
		lbuser = new Label("User");
		lbpass = new Label("Password");

		
		txuser = new TextField(20);
		txpass = new TextField(20);
		txpass.setEchoChar('*');
	
		
		btsubmit = new Button("Submit");
		btcancel = new Button("Cancel");
	
		style();
		
		print();
		
		btsubmit.addActionListener(this);
		btcancel.addActionListener(this);
		
		txuser.addFocusListener(this);
		txpass.addFocusListener(this);
		
	}
	
	public void style()
	{
		// layout
		GridLayout g = new GridLayout(3,2,50,50); 
		setLayout(g);
		// Default is FlowLayout with center align
		
		// background color
		lbuser.setBackground(Color.cyan);
		lbpass.setBackground(Color.gray);
		
		txuser.setBackground(Color.pink);
		txpass.setBackground(Color.pink);
		
		btsubmit.setBackground(Color.magenta);
		btcancel.setBackground(Color.red);
		
		//Foreground color
		
		// Font
		Font f1 = new Font("Comic Sans MS",Font.BOLD+Font.ITALIC,25);
		super.setFont(f1);
		
	}
	
	public void print()
	{
		add(lbuser);
		add(txuser);
		
		add(lbpass);
		add(txpass);
		
		add(btsubmit);
		add(btcancel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		
		if(src == btsubmit)
		{
			String username = txuser.getText();
			String password = txpass.getText();
			
		}
		else 
		{
			System.exit(-1); 
			// super.destroy();
		}
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		
		Object src = e.getSource();
		
		if(src == txpass)
		{
			txpass.setBackground(Color.orange);
		}
		
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		
		Object src = e.getSource();
		
		if(src == txuser)
		{
			txuser.setBackground(Color.white);
			txuser.setText((txuser.getText()).toUpperCase());
		}
		else if(src == txpass)
		{
			if((txuser.getText()).equalsIgnoreCase( txpass.getText()))
					JOptionPane.showMessageDialog(null, "Must be Different");
			else 
				JOptionPane.showMessageDialog(null, "Welcome");
				
		}
		
	}
	
}
