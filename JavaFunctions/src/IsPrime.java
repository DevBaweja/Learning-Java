// function to check number is prime or not
import java.util.Scanner;

public class IsPrime {

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
		System.out.println("enter number");
		int num = sc.nextInt();
		
		if(isprime(num))
		System.out.println(num+" is prime");
		else 
			System.out.println(num+" is not prime");

	}

}
