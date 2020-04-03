import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class LoginForm  extends Applet {
	
	Label lbuser,lbpass;
	TextField txuser,txpass;
	Button btsubmit,btcancel;
	
	public void init()
	{
		super.setBackground(Color.blue);

		lbuser = new Label("User");
		lbpass = new Label("Password");

		
		txuser = new TextField(20);
		txpass = new TextField(20);
		txpass.setEchoChar('*');
	
		
		btsubmit = new Button("Submit");
		btcancel = new Button("Cancel");
	
		style();
		
		print();
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
	
}
