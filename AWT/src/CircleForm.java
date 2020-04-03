import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleForm  extends Applet {
	
	Label lbraduis,lbresult;
	TextField txraduis,txresult;
	Button btarea,btperimeter;
	Button btrefresh,btclose;
	
	public void init()
	{
		super.setBackground(Color.blue);

		lbraduis = new Label("Raduis");
		lbresult = new Label("Result");

		
		txraduis = new TextField(20);
		txresult = new TextField(20);
		txresult.setEnabled(false);
		
		
		btarea = new Button("Area");
		btperimeter = new Button("Perimeter");
		
		
		btrefresh = new Button("Refresh");
		btclose = new Button("Close");
		
		style();
		print();
	}
	
	public void print()
	{
		GridLayout g = new GridLayout(4,2,50,50);
		setLayout(g);
		
		add(lbraduis);
		add(txraduis);
		
		add(lbresult);
		add(txresult);
		
		add(btarea);
		add(btperimeter);
		
		add(btrefresh);
		add(btclose);
	}
	
	public void style()
	{
		// Background color
		lbraduis.setBackground(Color.cyan);
		lbresult.setBackground(Color.gray);
		txraduis.setBackground(Color.pink);
		txresult.setBackground(Color.pink);
		btarea.setBackground(Color.magenta);
		btclose.setBackground(Color.red);
		
		// Font
		Font f1 = new Font("comic sans",Font.BOLD,40);
		lbraduis.setFont(f1);
		lbresult.setFont(f1);
		Font f2 = new Font("tahoma",Font.ITALIC,50);
		btarea.setFont(f2);
		btperimeter.setFont(f2);
		btrefresh.setFont(f2);
		btclose.setFont(f2);
		txraduis.setFont(f2);
		txresult.setFont(f2);
		
		// Foreground color
		Color c1 = new Color(200,210,75);
		lbraduis.setForeground(c1);
		lbresult.setForeground(c1);
		
	}
		
}

