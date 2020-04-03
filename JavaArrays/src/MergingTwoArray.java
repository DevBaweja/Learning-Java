// merging two unsorted array into unsorted array
import java.util.Scanner;

public class MergingTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of one array");
		int n1 = sc.nextInt();
		int []A = new int[n1];
		
		for(int i=0; i<A.length ; i++)
		{
			System.out.println("enter "+i+" element");
			A[i] = sc.nextInt();
		}
		
		System.out.println("enter size of second array");
		int n2 = sc.nextInt();
		int []B = new int [n2];
		
		for(int i=0; i<B.length ; i++)
		{
			System.out.println("enter "+i+" element");
			B[i] = sc.nextInt();
		}
		
		int []C = new int [(A.length + B.length)] ; // new array
		int k=0; // index for new array
		// copying directly from first array
		for(int i=0;i<A.length; )
			C[k++] = A[i++];
		// from another array 
		for(int j=0 ;j<B.length; )// starting from that index
			C[k++] = B[j++];
		
		for(int i=0;i< C.length;i++)
			System.out.println(i+" index "+C[i]);
	}
}