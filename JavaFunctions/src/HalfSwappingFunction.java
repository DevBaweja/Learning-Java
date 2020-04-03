import java.util.Scanner;

public class HalfSwappingFunction {

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
	
	static void swapping(int a[])
	{
		int mid = a.length/2;
		 for(int i=0,j= mid +(a.length%2) ; i<mid ;i++,j++)
		 {
			 int temp = a[i];
			 a[i] = a[j];
			 a[j] = temp;
		}
	}
	
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter size");
		 int n = sc.nextInt();
		 
		// array
		 int a[] = new int[n];
		 readarray(a);
		 System.out.println("before swapping");
		 printarray(a);
		 
		 swapping(a);
		 
		 System.out.println("after swapping");
		 printarray(a);
	}

}
