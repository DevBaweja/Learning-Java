import java.util.Scanner;

public class ReversePrintingOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of element");
		int n = sc.nextInt();
		
		int []A; // null reference 
		A = new int[n]; // memory allocation 
		for(int i=0; i<A.length ; i++)
		{
			System.out.println("enter "+i+" element");
			A[i]= sc.nextInt();
		}
		for(int i=A.length-1;i>=0;i--)
			System.out.println(A[i]);
		// when we use i=A.length then it will compile and execute when output is there it give boundness error
		

	}

}
