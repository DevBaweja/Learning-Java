package ItemListener;
import java.applet.Applet;
import java.awt.Choice;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;




public class DemoChoice extends Applet implements ItemListener{
	
	Choice cbcourse;
	Label lb ;
	
	public void init()
	{
			cbcourse = new Choice();
			cbcourse.add("Select Course");
			cbcourse.add(" C ");
			cbcourse.add(" C++ ");
			cbcourse.add(" Java ");
			cbcourse.add(" Python ");
			lb = new Label();
			
			add(new Label("Course List"));
			add(cbcourse);
			add(lb);
			cbcourse.addItemListener(this); // only for that cbcourse
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
			
		if(cbcourse.getSelectedIndex() == 0 )
		{
			lb.setText("");
			return;
		}

		lb.setText("Selected Course is "+cbcourse.getSelectedItem());
		validate(); // will refresh 
		
		System.out.println(cbcourse.getSelectedIndex());
		System.out.println(cbcourse.getSelectedItem());
	}
}