
public class DivideByZeroExplicit {

	public static void main(String[] args) {
		
		int a = 8; 
		int b = 0;
		
		// single try single catch
		
		try {
			if(b==0)
				throw new ArithmeticException("Second Argument Must Be Non-Zero");
		}
		catch( ArithmeticException e ) // Exception is super class
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("final");
		}
		
		
		
		
		/*
		 * java.lang.ArithmeticException: Second Argument Must Be Nno-Zero
		 * at DivideByZeroExplicit.main(DivideByZeroExplicit.java:13)
		 * 
		 */
	}

}
