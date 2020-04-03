import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a,b,c");
		
		int a,b,c;
		
		try {
			a = sc.nextInt();
			if(a==0) 
				throw new ArithmeticException(" must be non-zero"); // explicit
			
			b = sc.nextInt();
				// implicit throw
			c = sc.nextInt();
				// implicit throw
			
			float d = (b*b-4*a*c)/(2*a);
			if(d==0)
				throw new ArithmeticException(" imaginary roots");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank You");
		}
	}

}
