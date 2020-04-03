package Sorting;

// Merging two already sorted array into sorted array Mergesort merge function 
import java.util.Scanner;

public class MergingTwoSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of one array");
		int n1 = sc.nextInt();
		int []A = new int [n1];
		
		for(int i=0; i<A.length ; i++)
		{
			System.out.println("enter "+i+" sorted element");
			A[i] = sc.nextInt();
		}
		
		System.out.println("enter size of second array");
		int n2 = sc.nextInt();
		int []B = new int [n2];
		
		for(int i=0; i<B.length ; i++)
		{
			System.out.println("enter "+i+" sorted element");
			B[i] = sc.nextInt();
		}
		
		int []C = new int [(A.length + B.length)] ;
		
		int i,j,k; // as we need them outside of loop
		for(i=0,j=0,k=0 ; i<A.length && j<B.length ; ) // if any of the array size exceed then loop will break
		{
			if(A[i] < B[j])
				C[k++] = A[i++];
				else 
				C[k++] = B[j++];
		}
		// remaining elements
		while(i<A.length)
			C[k++] = A[i++];
		while(j<B.length)
			C[k++]=B[j++];
		
		System.out.println("After Merging");
		for(int m=0; m < C.length ;m++ )
		{
			System.out.println(m+" index "+C[m]);
		}
			
		
		
	}

}
