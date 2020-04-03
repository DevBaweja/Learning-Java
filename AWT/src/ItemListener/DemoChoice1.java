package ItemListener;
import java.applet.Applet;
import java.awt.Choice;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class DemoChoice1 extends Applet implements ItemListener{
	
	Choice cbcourse;
//	Label lb ;
	
	public void init()
	{
			cbcourse = new Choice();
			cbcourse.add("Select Course");
			cbcourse.add(" C ");
			cbcourse.add(" C++ ");
			cbcourse.add(" Java ");
			cbcourse.add(" Python ");
			// lb = new Label();
			
			add(new Label("Course List"));
			add(cbcourse);
			// add(lb);
			
			cbcourse.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
				
		add(new Label("Selected Course is "+cbcourse.getSelectedItem()));
		// add(lb);
		validate(); // will refresh 
	}
}