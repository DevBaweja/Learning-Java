import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame1 extends JFrame implements ActionListener{

	// no need of window listener 
	JButton bt1,bt2;
	JDialog d;
	public JFrame1()
	{
		setLayout(new FlowLayout());
		setSize(400, 400);
		setVisible(true);
		
		bt1 = new JButton("Open");
		bt2 = new JButton("Close");
		add(bt1);
		add(bt2);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		validate();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrame1();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
		

		
		if(src == bt1)
		{		if(d!=null)
			d.dispose();
			d = new JDialog(); // without any owner
			d.setVisible(true);
			d.setSize(100, 100);
			d.add(new JLabel("I am Dialog"));
			
		}
		else if(src == bt2)
		{
			d.dispose();
		}
	}

}
