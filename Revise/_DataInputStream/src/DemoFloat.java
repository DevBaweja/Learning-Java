import java.io.DataInputStream;
import java.io.IOException;

public class DemoFloat {

	public static void main(String[] args) {
		
		DataInputStream input = new DataInputStream(System.in);
		
		System.out.println("enter salary");
		
		
		float salary=0;
		try {
			salary = Float.parseFloat(input.readLine());
			// Float is Wrapper Class
			// parseFloat is static method of Float
			// demands string and convert it into Float 
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		// inputing something other than float will will give NumberFormatException

		System.out.println("Age is: "+salary);
	}

}
