// Reverse copying of one array into that same array
import java.util.Scanner;
public class ReverseIntoSameArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		// array declaration
		int []A = new int[n];
		for(int i=0 ; i<A.length ; i++)
		{
			System.out.println("enter "+i+" element");
			A[i] = sc.nextInt();
		}
	
		// reverse into same array
		
	/*
	*	for(int i=0; i<A.length/2 ;i++) // only half loop 
	*	{
	*		// swap A[i] with A[(A.length-1)-i];
	*		int temp = A[i];
	*		A[i] = A[(A.length-1)-i];
	*		A[(A.length-1)-i] = temp;
	*	}
	* 											*/
		
		
		// Multi loop
		for(int i=0,j=A.length-1 ; i < j ; i++,j--)
		{
			// swap A[i] with A[j]
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
		}
		
		for(int i=0; i< A.length ;i++)
			System.out.println(A[i]);
	}

}
