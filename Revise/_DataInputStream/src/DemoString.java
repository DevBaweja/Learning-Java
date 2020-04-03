import java.io.DataInputStream;
import java.io.IOException;

public class DemoString {

	public static void main(String[] args) {
		
		DataInputStream input = new DataInputStream(System.in);
		
		System.out.println("Enter your name");
		
		String name = null;
		try {
			name = input.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Name is: "+name);

	}

}
