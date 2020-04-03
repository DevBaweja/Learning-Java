package pack1;

import java.io.DataInputStream;
import java.io.IOException;

public class IORead {
	
	DataInputStream input = new DataInputStream(System.in);
	
	public int readInt() // default Friendly access
	// we have to access it to another package
	{
		
		int num=0;
		try {
			num = Integer.parseInt(input.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return(num);
		
	}
	
	public float readFloat()
	{
		
		float f=0;
		try {
			f = Float.parseFloat(input.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return(f);
		
	}

	public String readString()
	{
		
		String s=null;
		try {
			 s = input.readLine(); // as it is deplicated by Scanner class
		} catch (IOException E) {
			E.printStackTrace(); // printStackTrace() traces all the error
		}
		return(s);
	}

}
