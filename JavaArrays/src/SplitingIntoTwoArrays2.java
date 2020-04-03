// split into two arrays of prime and non prime arrays 
// Counting total number of prime and non prime then creating it of different size
// and making boolean array to save that counting process
// 2 times loop  1. counting 2. using boolean aaray save time
// save space using n to store n elements

import java.util.Scanner;

public class SplitingIntoTwoArrays2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();

		// declaration of array
		int[] A = new int[n];
		// declare boolean array
		boolean[] status = new boolean[A.length] ;
		// initial all are false (non prime)
 // scanning and counting for non prime
		// and making boolean array
		int count = 0;
	label:	for (int i = 0; i < A.length; i++)
		{
			System.out.println("enter " + i + " element");
			A[i] = sc.nextInt();
			for(int j=2; j<=A[i]/2 ;j++) 
			{
				if(A[i]%j==0)
				{
					count ++;
					continue label ;
				}
			}
			// if it comes here then it is prime
			status [i] =true ; // makiing it prime
		}
		
		System.out.println("given array");
		for(int i=0;i<A.length;i++)
			System.out.print(A[i]+"\t");
		System.out.println();
		// count is for total numbers of non prime
		int []nonprime = new int [count];
		int []prime = new int [(A.length-count)];
		
		// here we will not check again about the prime and non prime directly using boolean array to check it
		int p=0,np=0;
		for (int i = 0; i < A.length; i++)
		{
			if( status[i] == false )
					nonprime[np++] = A[i];
			else 
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
