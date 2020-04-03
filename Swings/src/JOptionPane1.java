import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class JOptionPane1 extends JApplet{
	
	
	public void init()
	{
		// JOptionPane.showMessageDialog(null, "Hello");
		// JOptionPane.showMessageDialog(null, "Hello","My Message Box",JOptionPane.QUESTION_MESSAGE);
		// JOptionPane.showMessageDialog(null, "Hello","My Message Box",JOptionPane.ERROR_MESSAGE,new ImageIcon("image11.jpg"));
		
		// String name = JOptionPane.showInputDialog("Enter your name");
		// JOptionPane.showMessageDialog(null, "Hello,"+name);
	//	JOptionPane.showMessageDialog(null, "Both Passwords Must Be Same","Incorrect Password",JOptionPane.ERROR_MESSAGE);
	//	String name = JOptionPane.showInputDialog(null, "Enter name");
		
	 // JOptionPane.showInputDialog("How Are You", "Fine");
	 //	JOptionPane.showInputDialog(null, "Enteryour name", "Anil", JOptionPane.QUESTION_MESSAGE);
		Object[] degreeArray = {"MCA","BCA","Btech","Mtech","MS"}; 		
		Object deg = JOptionPane.showInputDialog(null, "Choose your degree", "Degree Selection", JOptionPane.QUESTION_MESSAGE, null, degreeArray , "Btech");
	
		if(deg!=null)
		JOptionPane.showMessageDialog(null,"You have selected"+deg);
		
	/*	int ans = JOptionPane.showConfirmDialog(null, "U want to delete");
		
		if(ans == JOptionPane.YES_OPTION)
		{
			// delete 
		}
		else if(ans  == JOptionPane.NO_OPTION)
		{
			// message delete
		}
	*/
		
		//JOptionPane.showConfirmDialog(null, "U want to delete", "Delete Box", JOptionPane.OK_CANCEL_OPTION);
		
	
	}
	
}
