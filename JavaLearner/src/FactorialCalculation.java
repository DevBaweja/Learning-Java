// calculating factorial of n numbers
import java.util.Scanner;
public class FactorialCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total numbers");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter "+i+" digit" );
			int num= sc.nextInt();
			int fac=1; // for every number
			for(int j=num;j>0;j--)
				fac *= j;
		System.out.println("fac of " +num+ " =" +fac);
		}

	}

}
