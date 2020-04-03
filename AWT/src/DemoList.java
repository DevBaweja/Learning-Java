

import java.applet.Applet;
import java.awt.List;

public class DemoList extends Applet {

	
	List lscourse;
	public void init()
	{
		lscourse = new List();
		lscourse.add("C");
		lscourse.add("C++");
		lscourse.add("Java");
		lscourse.add("Python");
		
		add(lscourse);
	}
}
