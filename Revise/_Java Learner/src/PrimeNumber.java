import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		System.out.println("enter n");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag = false ; // initially false
		for (int i = 2; i <= n/2; i++)
		{
			if(n%i==0)
			{
				flag = true;
				break;
			}
		}
		
		if(flag)
			System.out.println(n+" is non-prime number");
		else
			System.out.println(n+" is prime number");
	}
}
