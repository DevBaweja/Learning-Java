import java.util.Scanner;

public class AllPrimeInRange {

	static boolean  isprime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			return false;
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range");
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i =n;i<=m;i++)
		{
		if(isprime(i))
		System.out.println(i);
		}
	}

}
