
public class DivideByZeroImplicit {

	public static void main(String[] args) {
		
		int a = 8; 
		int b = 0;
		
		try {
			System.out.println(a/b);
		}
		catch( ArithmeticException e ) // Exception is super class
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("final");
		}
		
		
		
		
		
		/*
		 * java.lang.ArithmeticException: / by zero
		 * at DivideByZeroImplicit.main(DivideByZeroImplicit.java:10)
		 * 
		 */
	}

}
