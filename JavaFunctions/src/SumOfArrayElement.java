// reading and printi
import java.util.Scanner;

public class SumOfArrayElement {
	
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
	
	static int sum(int a[],int b)
	{
		int ans = 0;
		int i = a.length;
		 if(i > 0 )
		 {
			 ans += sum(a,a[--i]);
		 }
		 return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		int array[] = new int[n];

		readarray(array);
		printarray(array);
		
		System.out.println("sum :" + sum(array,array[array.length-1]));
		
	}

}
