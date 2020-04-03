package KeyListener;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DemoKeyListener extends Applet implements KeyListener {

	TextField tx;
	
	public void init()
	{
		tx = new TextField(20);
		
		// tx.setSize(new Dimension(100, 40));
		// tx.setPreferredSize(new Dimension(100, 40));
		
		add(tx);
		
		tx.addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	//	System.out.println(e.getKeyChar());
	//	System.out.println(e.getKeyCode()); // will not work
		
	//	System.out.println(e.getKeyText( e.getKeyCode() ));
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	//	System.out.println(e.getKeyChar());
	//	System.out.println(e.getKeyCode());
		
		System.out.println(e.getKeyText( e.getKeyCode() ));
	
		int code = e.getKeyCode();
	
		
		if( !(code >= KeyEvent.VK_A && code <= KeyEvent.VK_Z) && code != KeyEvent.VK_SPACE  && code != KeyEvent.VK_BACK_SPACE && code!= KeyEvent.VK_PAGE_UP && code != KeyEvent.VK_PAGE_DOWN && code != KeyEvent.VK_LEFT && code != KeyEvent.VK_RIGHT && code != KeyEvent.VK_DELETE )
		{
			e.consume(); // It will consume the character other than alphabets
			System.out.println("consume");
		}
		
		// space
		// backspace
		//delete,arrow keys
		
		 // e.getKeyText( code of the any key ); 
		// will be give it original value
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	//	System.out.println(e.getKeyChar());
//	System.out.println(e.getKeyCode()); // will not work
		
	//	System.out.println(e.getKeyText( e.getKeyCode() ));
		
	}

}
