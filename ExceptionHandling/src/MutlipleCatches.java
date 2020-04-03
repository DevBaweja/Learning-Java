import java.util.InputMismatchException;
import java.util.Scanner;

public class MutlipleCatches {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		// single try multi catch
		System.out.println();
		try {
			int a = sc.nextInt();
			int b = sc.nextInt(); // implicit
			
			if(b==0)
				throw new ArithmeticException("Second arg must be non-zero"); // explicit
			System.out.println(a/b);
		}
		catch( ArithmeticException e) // Exception is super class
		{
			e.printStackTrace();
		}
		catch( InputMismatchException e)
		{
			e.printStackTrace();
		}
		
	
	}

}
