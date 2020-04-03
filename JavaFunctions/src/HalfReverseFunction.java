import java.util.Scanner;

public class HalfReverseFunction {
	
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
		 {
			 System.out.print(a[i]+"\t");
		 }
		 System.out.println();
	}
	
	static void reverse(int a[])
	{
		int mid = a.length/2;
		// first half
		for(int i=0,j=mid-1 ; i<j ; i++,j--)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
 		}
		// second half
		for(int i=mid,j=a.length-1; i<j ; i++,j--)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		
		// array
		int a[] = new int[n];
		
		readarray(a);
		System.out.println("before sorting");
		printarray(a);
		
		reverse(a);
		System.out.println("after sorting");
		printarray(a);

	}

}
