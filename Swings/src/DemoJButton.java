import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;

public class DemoJButton extends JApplet implements ActionListener{

	JButton b1,b2,b3,b4;
	
	public void init()
	{
		
		super.setLayout(new GridLayout(2, 2));
		
		b1 = new JButton(new ImageIcon("image.jpg"));
		b2 = new JButton(new ImageIcon("image10.jpg"));
		b3 = new JButton(new ImageIcon("image2.jpg"));
		b4 = new JButton(new ImageIcon("image3.jpg"));
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		b1.setRolloverIcon(new ImageIcon("image11.jpg"));
		
		b2.addActionListener(this);
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == b2)
		{
			b3.setEnabled(false);
			b3.setDisabledIcon(new ImageIcon("image12.jpg"));
		}
		else if(src == b1)
		{
		
			b4.setSelected(true);
			b4.setSelectedIcon(new ImageIcon("image19.jpg"));
		}	
	}
	
	
}
