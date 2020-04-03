
public class DemoZeroFinally {

	public static void main(String[] args) {
		
		int a = 8; 
		int b = 0;
		
		try {
		System.out.println(a/b);
		}
		finally
		{
			System.out.println("Thanks"); // will executed
		}
		
		System.out.println("Welcome"); // not will be executed
	}

}
