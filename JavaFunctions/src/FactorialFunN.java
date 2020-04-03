import java.util.Scanner;

public class FactorialFunN {
	
	static int fac(int n)
	{
		int fac=1;
		for(int i=n;i>0;i--)
			fac *= i;
		return fac;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total numbers");
		int n = sc.nextInt();
		for(int i=1 ; i<=n ;i++)  
		{
			System.out.println("enter "+i+" number");
			int num = sc.nextInt();
			System.out.println("factorial is : " + fac(num));
		}

	}

}
