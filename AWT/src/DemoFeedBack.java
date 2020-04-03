import java.applet.Applet;
import java.awt.Label;
import java.awt.TextArea;



public class DemoFeedBack extends Applet {
	
	TextArea tx;
	
	public void init()
	{
			tx = new TextArea(5,20);
			add(new Label("FeedBack"));
			add(tx);
	}
}