package EmployeeDatabase;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;

public class DemoMenu extends JFrame implements MouseListener{
	// no need of window listener
	JPopupMenu MB;
	JMenuItem MInew,MIopen,MIsave,MIsaveas,MIclose;
	
   public DemoMenu()
	{
		setVisible(true);
		setSize(400,400);
		
		MInew = new JMenuItem("New");
		MIopen = new JMenuItem("Open");
		MIsave = new JMenuItem("Save");
		MIsaveas = new JMenuItem("Save As");
		MIclose = new JMenuItem("Close");
		

		MB = new JPopupMenu();
		
		MB.add(MInew);
		MB.add(MIopen);
		MB.addSeparator();
		MB.add(MIsave);
		MB.add(MIsaveas);
		MB.addSeparator();
		MB.add(MIclose);
	
		// Shortcuts in JMenuItem
		// Shortcuts in JPopupMenu
		add(MB);
		this.addMouseListener(this);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoMenu();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.isPopupTrigger())
		{
			MB.show(this, e.getX(), e.getY());
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
