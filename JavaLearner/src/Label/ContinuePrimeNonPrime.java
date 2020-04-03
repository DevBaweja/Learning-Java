package Label;
// Sum of prime number and count of non prime numbers without status 
import java.util.Scanner;
public class ContinuePrimeNonPrime {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total numbers");
		int n = sc.nextInt();
		int count=0;
		int sum=0;
	label:	for(int i=1;i<=n;i++)
		{
			System.out.println("enter "+i+" number");
			int num = sc.nextInt();
			for(int j=2;j<=num/2;j++)
			{
				if(num%j==0)
				{
					System.out.println(num+" is non prime");
					count ++;
					continue label;
				}
			}
			System.out.println(num+" is prime");
			sum += num;
		}
		System.out.println(count+" is count of non prime numbers");
		System.out.println(sum+" is sum of prime numbers");
	}

}
