import java.util.Scanner;
public class FactorialCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total digits");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter "+i+" Number");
			int k = sc.nextInt();
			int fact=1;
			for(int j=k;j>0;j--)
				fact *= j; 
			System.out.println("Factorial is: "+fact);
		}
	}

}
