import java.io.DataInputStream;
import java.io.IOException;

public class DemoFloat {

	private static float salary; // auto intialise to zero

	public static void main(String[] args) {

		DataInputStream input = new DataInputStream(System.in);
		
		System.out.println("enter your salary");
		
			try {
				salary = Float.parseFloat(input.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		System.out.println("Hello"+salary);

	}

}
