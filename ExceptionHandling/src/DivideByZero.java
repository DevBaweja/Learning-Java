
public class DivideByZero {

	public static void main(String[] args) {
		
		int a = 8; 
		int b = 0;
		
		System.out.println(a/b);
		/*
		 *  Exception in thread "main" java.lang.ArithmeticException: / by zero
		 *	at DivideByZero.main(DivideByZero.java:9)
		 */
		
		System.out.println("Thanks");
	}

}
