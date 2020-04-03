
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JLabel;




public class DemoJComboBox1 extends JApplet implements ItemListener{
	
	JComboBox cbcourse;
	JLabel lb ;

	
	public void init()
	{
		setLayout(new FlowLayout());
			cbcourse = new JComboBox();
			cbcourse.addItem("Select Course");
			cbcourse.addItem(" C ");
			cbcourse.addItem(" C++ ");
			cbcourse.addItem(" Java ");
			cbcourse.addItem(" Python ");
			lb = new JLabel();
			
			add(new JLabel("Course List"));
			add(cbcourse);
			add(lb);
			cbcourse.addItemListener(this); // only for that cbcourse
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
			
	//	if(cbcourse.getSelectedIndex() == 0 )
		//{
			//lb.setText("");
			//return;
		//}

		lb.setText("Selected Course is "+cbcourse.getSelectedItem().toString());
		validate(); // will refresh 
		
		System.out.println(cbcourse.getSelectedIndex());
		System.out.println(cbcourse.getSelectedItem().toString());
	}
}