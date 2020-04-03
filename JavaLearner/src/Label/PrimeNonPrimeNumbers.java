package Label;
// sum of prime numbers and count of non prime numbers
import java.util.Scanner;
public class PrimeNonPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total numbers");
		int n = sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter "+i+" number");
			int num = sc.nextInt();
			boolean status =true; // similar as flag
			for(int j=2;j<=num/2;j++)
			{
				if(num%j==0)
				{
					status=false;
					break;
				}
			}
			if(status==true) {
				System.out.println( num+" is prime number");
				sum += num;
			}
			else {
				System.out.println( num+" is non prime");
				count++;
			}
		}
	
	System.out.println(count+ " is count of non prime numbers");
	System.out.println(sum+ " is sum of all prime numbers");
		
	}

}
