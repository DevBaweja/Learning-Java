import javax.swing.JApplet;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DemoJTable extends JApplet{

	
	JTable tb;
	JScrollPane jsp;
	
	public void init()
	{
		Object [] col = {"Roll no","Name","College"};
		
		Object [][] row = { { 1,"Anil","xyz"},{2,"Rahul","xyz"} };
		
		tb = new JTable(row, col);
		jsp = new JScrollPane(tb);		
			
		add(jsp);
		
	}
	
}
