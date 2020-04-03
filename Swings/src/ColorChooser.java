import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColorChooser extends JFrame implements ActionListener{

	// no need of window listener 
	JButton bt1;
	Color c1;
	public ColorChooser()
	{
		setLayout(new FlowLayout());
		setSize(400, 400);
		setVisible(true);
		
		bt1 = new JButton("Change bk color");
		add(bt1);
		bt1.addActionListener(this);
		validate();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorChooser();
	}

	public void paint(Graphics g)
	{
		this.getContentPane().setBackground(c1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
	
		if(src == bt1)
		{	
			JColorChooser jcc = new JColorChooser();
			c1 = jcc.showDialog(null, "Color", Color.red);
			System.out.println(c1);
			//bt1.setBackground(c1);
			repaint();
		}
	}

}
