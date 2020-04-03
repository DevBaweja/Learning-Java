package Frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WordsAndCharacters extends Frame implements WindowListener,ActionListener{

	Label lbword,lbchar,lblines;
	Button btcount,btrefresh;
	TextArea tx;
	
	public WordsAndCharacters()
	{
		setLayout(new GridLayout(2, 3));
		setVisible(true);
		setSize(400,400);
		
		
		super.setForeground(Color.green);
		Font f = new Font("comic sans", Font.BOLD+Font.ITALIC, 30);
		super.setFont(f);
		
		btcount = new Button("Count");
		btrefresh = new Button("Refresh");

		tx = new TextArea();
		tx.setBackground(Color.cyan);
		tx.setForeground(Color.red);
		Font f1 = new Font("comic sans", Font.BOLD+Font.ITALIC, 45);
		tx.setFont(f1);
		
		lblines = new Label("Lines: 0");
		lbword = new Label("Words: 0");
		lbchar = new Label("Characters: 0");

		
		add(lblines);
		add(lbword);
		add(lbchar);
		add(tx);
		add(btcount);
		add(btrefresh);
		
		btcount.addActionListener(this);
		btrefresh.addActionListener(this);
		this.addWindowListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
		
		if(src == btcount)
		{
			String s = tx.getText();
			String words[] = s.split("\\s");  
			String lines[] = s.split("\\n");
			
			for(int i=0;i<words.length;i++)
			{
				System.out.println(words[i]);
			}
			
			/* this \\s is for space ie backslash space
			 * this \\n is for lines ie backslash n next line
			
			The string "boo:and:foo", for example, yields the followingresults with these expressions 
				Regex
				Result

				:  { "boo", "and", "foo" }} 
				o  { "b", "", ":and:f" }}
				it return array of string doing paritition on the basis of regex
											*/
			
			lblines.setText("Lines: "+lines.length);		
			lbword.setText("Words: "+words.length); // this is array length
			lbchar.setText("Characters :"+s.length());
			// String.length() will guve number og characters of String
			
		}
		else if(src == btrefresh)
		{
			lblines.setText("Lines: 0");		
			lbword.setText("Words: 0");
			lbchar.setText("Characters: 0");
		}
			
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
	System.exit(-1);	
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	// frame need main
	public static void main(String[] args)
	{
		new WordsAndCharacters();
	}


}
