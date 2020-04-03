import java.util.Scanner;

public class FactorialOfAllElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		
		int []A = new int[n] ; 
		for(int i=0;i<A.length;i++)
		{
			System.out.println("enter "+i+" number");
			A[i] = sc.nextInt();
		}
		
		for(int i=0;i<A.length;i++)
		{
			int fact = 1; 
			for(int j=A[i] ; j>0 ;j--)
				fact *= j;
			
		System.out.println(i+" index " +A[i]+ " element " +fact);
		}
		
	}

}
