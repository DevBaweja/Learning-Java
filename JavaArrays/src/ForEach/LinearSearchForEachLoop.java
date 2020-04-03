package ForEach;
import java.util.Scanner;

public class LinearSearchForEachLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		
		int []A = new int[n];
		for(int i=0;i<A.length;i++)
		{
			System.out.println("enter "+i+" element");
			A[i] = sc.nextInt();
		} 
		for(int i=0;i<A.length;i++)
		System.out.println(i+" index "+A[i]);

		while( true )
		{
		System.out.println("enter searching number");
		int search = sc.nextInt();
		boolean status = false; // assuming that number is not present
		int index=0; 
		for( int num : A )
		{
			if(num == search)
			{
				status = true ;
				break;
			}
			index++;
						
		}
		 if(status)
			 System.out.println("found at "+index);
		 else 
			 System.out.println("not found");
		}
	
	}

}
