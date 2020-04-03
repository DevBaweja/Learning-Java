// Reverse copying of one array into another array
import java.util.Scanner;

public class CopyingArrayIntoAnotherArray {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size of array");
	int n = sc.nextInt();
	// array formation
	int []A = new int[n];  
	for(int i=0;i<A.length;i++)
	{
		System.out.println("enter "+i+" element");
		A[i] = sc.nextInt();
	}
	
	int []B = new int [A.length];
	   /*	for(int i=0; i<B.length ; i++)
		*	B[i] = A[(A.length-1)-i]; 
		*                           		*/           
	// using multi loop
	for(int i=0,j=A.length-1 ; j>=0 || i<A.length ;j--,i++)
		B[i] = A[j]; 
		
	System.out.println("elements of B array");
	for(int i=0; i<B.length ;i++)
		System.out.println(B[i]);

	}

}
