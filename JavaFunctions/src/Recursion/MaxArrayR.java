package Recursion;

import java.util.Scanner;

public class MaxArrayR {
	
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
		System.out.println("given array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	
	static int arraymax(int a[],int i)
	{
		int imax=0;
		// basic condition
		if(i == a.length-1) return a[imax]; // last element
		if(a[imax]<a[i])
			imax = i;
		arraymax(a,i+1);
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		int array[] = new int[n];
		readarray(array);
		printarray(array);
		
		System.out.println("max : " + arraymax(array,0));
	}

}
