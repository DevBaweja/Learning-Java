import java.io.DataInputStream;
import java.io.IOException;

public class DemoInt {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		DataInputStream input = new DataInputStream(System.in);
		
		System.out.println();
		int num=0;
		
			num = Integer.parseInt(input.readLine());
		
	
		System.out.println("num is: "+num);

	}

}
