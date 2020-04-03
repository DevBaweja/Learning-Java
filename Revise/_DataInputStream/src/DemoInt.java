import java.io.DataInputStream;
import java.io.IOException;

public class DemoInt {

	public static void main(String[] args) {
		
		DataInputStream input = new DataInputStream(System.in);
		
		System.out.println("enter age");
		
		
		int age=0;
		try {
			age = Integer.parseInt(input.readLine());
			// Integer is Wrapper Class
			// parseInt is static method of Integer
			// demands string/ and convert it into Integer 
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		// inputing something other than int will will give NumberFormatException
			// Numner Format Exceptions is of lang class
		System.out.println("Age is: "+age);

	}

}
