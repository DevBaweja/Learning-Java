package Menu;

import java.applet.Applet;

public class DemoMyNotepad1 extends Applet{
	
	// Instead of making main we can create applet class 
	// using init method we can call our Frame class Constructor

	
	// but never can parent class in any other parent class
	
	// use applet and init 
	// use frame and main only
	
	public void init() {
		// TODO Auto-generated method stub
		new MyNotepad();
	}
	
	// it will create applet and open another frame also

}
