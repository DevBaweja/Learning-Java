// spliting of array into two different array of prime and non prime
// using boolean status array 
// using isprime function
import java.util.Scanner;

public class IsPrimeN {

	static void readarray(int a[])
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter "+i+" element");
			a[i] = sc.nextInt();
		}
	}
	static void printarray(int a[])
	{
		for(int i=0;i<a.length;i++)
		
		System.out.print(a[i]+"\t");
	System.out.println();
	}
	
	static boolean  isprime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			return false; // it is non prime
		}
		return true; // it is prime
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		// array 
				int []a = new int [n];
				// scan
				readarray(a);
				// print
				System.out.println("given array");
				printarray(a);

				
				boolean status[] = new boolean[a.length]; // using boolean array to store whether number is prime or not
				// initial all are false for non prime
				int count=0; // it is for prime numbers
				for(int i=0;i<a.length;i++)
				{
					if(isprime(a[i]))
					{	
						status[i] = true; // true is for prime
						count++;
					}
				}

				
				// declaring arrays
				int prime[] = new int[count];
				int nonprime[] = new int[a.length-count];
				
				int p=0,np=0;
				for(int i=0;i<a.length ;i++)
				{
					if(status[i])
						prime[p++] = a[i];
					else 
						nonprime[np++] = a[i];
				}
				
				// print
				System.out.println("prime array");
				printarray(prime);
				System.out.println("non prime array");
				printarray(nonprime);
				
	}

}
