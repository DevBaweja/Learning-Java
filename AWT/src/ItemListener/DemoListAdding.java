package ItemListener;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoListAdding extends Applet implements ActionListener{

	Button b;
	List l;
	TextField t;
	
	public void init()
	{
		b = new Button("ADD");
		t = new TextField();
		
		t.setSize(new Dimension(100, 50));
		t.setPreferredSize(new Dimension(100, 50));
		
		
		l = new List();
		
		l.setSize(new Dimension(150,400));
		l.setPreferredSize(new Dimension(150,400));
		
		l.add("milk");
		l.add("oats");
		l.add("butter");
		l.add("eggs");
		
		add(l);
		add(b);
		add(t);
		
		b.addActionListener(this);
	System.out.println(l.getItem(1));
		alphabet();
	}
	
	
	
	public void alphabet() {
		
		for(int i=0;i<l.getItemCount();i++)
			for(int j=i+1;j<l.getItemCount();j++)
			{
					int k = l.getItem(i).compareTo( l.getItem(j));
					// compareTo will give diffference between two Ascii values
					
					if( k > 0 )
					{
						String temp = l.getItem(i); // temp storing i index element
						l.remove(i); // remove index i 
						l.add(l.getItem(j-1) ,i); // taking element from j-1 as i is removed and adding it at i index . add will add not overwrite
						l.remove(j); // remove index j
						l.add(temp,j); // adding i index element in place of j . add will add not overwrite
					}
			}
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
			
	// only one button no need to get source
		
		//Add
		if(t.getText().equals(""))
			return; // removing addition of null
		
			l.add( t.getText() );
			
			alphabet();
	}

}
