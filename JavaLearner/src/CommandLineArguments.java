
public class CommandLineArguments {
	
	public static void main(String[] args) {
		
		System.out.println(args.length);
		String [][] argCopy = new String[2][2];
		argCopy[0] = args;
		int x;
	        x = argCopy[0].length;
	        for (int y = 0; y < x; y++) 
	        {
	            System.out.print(" " + argCopy[0][y]);
	        }
	 
	}
}
