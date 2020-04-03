package ActionListener;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ALCSmiley extends Applet implements ActionListener {

	Button bthappy,btsad;
	Panel P1;
	int a;
	
	public void init()
	{
		
		a=0;
		
		bthappy = new Button("Happy");
		btsad = new Button("Sad");
		
	 P1 = new Panel();
	 P1.setLayout(new GridLayout(1,2));
	 
	 
	 	P1.add(bthappy);
	 	P1.add(btsad);
	 	
	 	add(P1);
	 	bthappy.addActionListener(this);
	 	btsad.addActionListener(this);
	}
	
	public void paint(Graphics g) 
    { 
  
        // Oval for face outline 
		g.setColor(Color.cyan);
        g.fillOval(80, 70, 150, 150); 
  
        // Arc for the smile
        if(a<0)
        {
            // Ovals for eyes 
            // with black color filled 
            g.setColor(Color.red); 
            g.fillOval(120, 120, 15, 15); 
            g.fillOval(170, 120, 15, 15); 
            
        	// Tears
        	g.drawLine(128, 140, 128, 150);
        	g.drawLine(128, 155, 128, 165);
        	g.drawLine(178, 140, 178, 150);
        	g.drawLine(178, 155, 178, 165);
        	
        	g.setColor(Color.red); // for arc
        }
        else
        	{
            // Ovals for eyes 
            // with blue color filled 
            g.setColor(Color.blue); 
            g.fillOval(120, 120, 15, 15); 
            g.fillOval(170, 120, 15, 15); 
            
        		g.setColor(Color.blue); // for arc
        	}
        g.drawArc(130, 180, 50, 20, 180, a); 
    }
	


	@Override
	public void actionPerformed(ActionEvent AE) {
		
		Object src = AE.getSource();
		
		if(src == bthappy)
			a=180;

		if(src == btsad)
			a=-180;
			
		repaint();
		
	}
}
