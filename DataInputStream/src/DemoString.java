import java.io.DataInputStream;
import java.io.IOException;

public class DemoString {

	public static void main(String[] args) {

		DataInputStream input = new DataInputStream(System.in);
		
		String name = null;
		
		System.out.println("enter your name");
		try {
			name = input.readLine(); // as it is deplicated by Scanner class
		} catch (IOException E) {
			E.printStackTrace(); // printStackTrace() traces all the error
		}
		
		System.out.println("Hello"+name);

	}

}
