import java.util.Scanner;

public class HalfSwapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		
		int []A = new int[n];
		
		for(int i=0; i<A.length ; i++)
		{
			System.out.println("enter "+i+" element");
			A[i] = sc.nextInt();
		}
		// A.length(size) must be even
		
		int mid = A.length/2;
		for(int i=0,j=mid +(A.length%2) ; i<mid && j<A.length ; i++,j++)  // also even odd size checking
		{
			// swap A[i] and A[j]
			int temp = A[i];
			A[i] = A[j];
			A[j] =temp;
		}
		
		System.out.println("after half swapping");
		for(int i=0;i<A.length;i++)
		System.out.println(i+" index "+A[i]);
		
	}

}
