package Recursion;
import java.util.Scanner;

public class FseriesRec {
	
	static void fib(int l)
	{
		int a=0,b=1;
		System.out.print(a+"\t"+b);
		for(int i=3;i<=l;i++)
		{
			int c = a+b;
			System.out.print("\t"+c);
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n");
		int n = sc.nextInt();
		fib(n);

	}

}
