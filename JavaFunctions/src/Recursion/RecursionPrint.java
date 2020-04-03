package Recursion;
import java.util.Scanner;

public class RecursionPrint {
	
	static void print(int i,int n)
	{
		if(i<=n)
		{
			System.out.print(i+"\t");
			print(i+1,n);
		}
	}
	
	static void printrev(int i,int n)
	{
		if(i<=n)
		{
			printrev(i+1,n);
			System.out.print(i+"\t");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("enter n");
		int n = sc.nextInt();
		System.out.println("simple printing");
		print(1,n);
		System.out.println();
		System.out.println("reverse printing");
		printrev(1,n);
	}

}
