package Recursion;
import java.util.Scanner;

public class FseriesRecursion {
	
	static void fib(int a,int b,int l)
	{
		if(l==0)
			return ;
		System.out.print(a+"\t");
		fib(b,a+b,l-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n");
		int n = sc.nextInt();
		System.out.println("fibonacci series");
		fib(0,1,n);

	}

}
