package pack1;

import java.io.DataInputStream;
import java.io.IOException;

public class IORead {

	DataInputStream input = new DataInputStream(System.in);
	
	// public access so that we can access it to other package
	// we need to import it in the file we use as it is in other package
	// non static to make it object
	
	public int nextInt()
	{
		int num=0;
		try {
			num= Integer.parseInt(input.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		return(num); 
	}
	
	public float nextFloat()
	{
		float num=0;
		try {
			num = Float.parseFloat(input.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		return (num);
	}
	
	public String next()
	{
		
		String s = null;
		try {
			s = input.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return(s);
	}
	
}
