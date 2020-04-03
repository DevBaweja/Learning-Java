import java.util.Scanner;

public class AsAnClass {

		public static void main (String[] args)
		{
			Scanner sc = new Scanner(System.in);
			/*	
			 * Mostly language
			 * 	Implementing string as character array
			 * string as Object of type String
			 * here other datatype act as datatype only
			 * but string act as String- Wrapper Class
			 * in which we create objects of it and use it
			 */
			// Converting primitive data types into object is called boxing
			// All the Wrapper Classes are included in java.lang package
			// so there is no need of import anything
			System.out.println("enter value");
			int a; // making int as datatype
			a = sc.nextInt();
			
			System.out.println("enter value");
			Integer i = sc.nextInt();
			
			// or we can call parametric constructor of Integer Wrapper Class
			
			Integer j = new Integer(25); // making Integer object
			// mostly we create char,int,float as datatype
			
			// Only way to create string
			String s = new String("fill");
			// Creating object
			System.out.println(s);	
		}
}
