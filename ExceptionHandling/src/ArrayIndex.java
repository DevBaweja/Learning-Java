import java.util.InputMismatchException;
import java.util.Scanner;

import javax.imageio.IIOException;

public class ArrayIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter array size");
		
		int n;
		int a[];
		try {
			n = sc.nextInt();
				// implicit throw as if condition will be like if(!int)  
			a = new int[n];
			
			for(int i=0;i<a.length;i++)
			{
				a[i] = sc.nextInt();
			}
			System.out.println("Enter index you want to access");
			int k = sc.nextInt();
					// implicit throw as if condition will be like if(!int)  
			
			if(k>a.length)
				throw new ArrayIndexOutOfBoundsException("No you Cann't");
				// System.out.println("here it is"+a[k]);
			else 
			{
				System.out.println("here it "+a[k]);
			}
			
		}
		catch( InputMismatchException e)
		{
			System.out.println("Input Error"); // instead of explicit throw 
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException A)
		{
			System.out.println(A.getMessage());
		}
		finally
		{
			System.out.println("Thank You");
		}


	}

}
