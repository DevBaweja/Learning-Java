import java.util.Scanner;

public class HalfReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		
		int []A = new int [n];
		for(int i=0; i<A.length ;i++)
		{
			System.out.println("enter "+i+" element");
			A[i] = sc.nextInt();
		}
		int mid = A.length/2;
		
		for(int i=0,j=mid-1 ; i< j ;i++,j--) // first half then for reverse we use only half loop
		{ 
			// swap A[i] and A[j]
			int temp = A[i];
			A[i] = A[j];
			A[j] =temp;
		}
		
		for(int i=mid +(A.length%2) ,j=A.length-1 ; i< j; i++,j--)  // second half the for reverse we use only half loop
			// A.length is used to resolve odd even problem
		{			
			// swap A[i] and A[j]
			int temp = A[i];
			A[i] = A[j];
			A[j] =temp;
			
		}
		
		System.out.println("after half reversing");
		for(int i=0;i<A.length;i++)
			System.out.println(i+" index "+ A[i]);
	}

}
