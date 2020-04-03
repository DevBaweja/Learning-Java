// split into two arrays of prime and non prime arrays 
// directly making size of given array size
// 2 space   using 2n to store n elements
// save time for counting of prime and non prime in  the array

import java.util.Scanner;

public class SplitingIntoTwoArrays1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();

		// declaration of array
		int[] A = new int[n];
 
	for (int i = 0; i < A.length; i++)
		{
			System.out.println("enter " + i + " element");
			A[i] = sc.nextInt();
		}
		
		System.out.println("given array");
		for(int i=0;i<A.length;i++)
			System.out.print(A[i]+"\t");
		System.out.println();
		
		int []nonprime = new int [A.length];
		int []prime = new int [A.length];
		
		int p=0,np=0;
	label:	for (int i = 0; i < A.length; i++)
		{
			for(int j=2; j<=A[i]/2 ;j++) 
			{
				if(A[i]%j==0)
				{
					nonprime[np++] = A[i];
					continue label ;
				}
			}
			prime[p++]=A[i];
		}
		
		System.out.println("non prime array");
		for(int i=0; i<nonprime.length ;i++)
		System.out.print( nonprime[i]+"\t");
		
		System.out.println();
		
		System.out.println("prime array");
		for(int i=0; i<prime.length ;i++)
		System.out.print( prime[i]+"\t");
		

	}

}
