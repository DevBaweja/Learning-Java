package ObjectClass;

import java.applet.Applet;
import java.awt.TextField;
import java.io.DataInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import javax.swing.JTextField;

public class getClass {

	public static void main(String[] args) {
		
		// Actually getClass() in method of Object Class in java.lang package
		
		/*
		*  Every class in Java is directly or indirectly derived from the Object class. 
		* If a Class does not extend any other class then it is direct child class of Object 
		* and if extends other class then it is an indirectly derived.
		*  Hence Object Class is root of inheritance hierarchy.
		*/
		
		String s = new String();
		System.out.println(s.getClass());
		
		DataInputStream input = new DataInputStream(System.in);
		System.out.println(input.getClass());
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.getClass());
		
		Applet a = new Applet(); // this is extends Applet  
		System.out.println(a.getClass());
		
		TextField tx = new TextField();
		System.out.println(tx.getClass());
		
		JTextField jtx = new JTextField();
		System.out.println(jtx.getClass());
		
		URL u = null;
		try {
			u = new URL("https://myurl");
		} catch (MalformedURLException e) {
			
		}
		System.out.println(u.getClass());
		
		// Any self-defined class
		Person P = new Person();
		System.out.println(P.getClass());
	}
}
