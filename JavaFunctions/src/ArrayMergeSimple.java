import java.util.Scanner;

public class ArrayMergeSimple 
{
	static void arr_read(int []arr)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter "+ arr.length + " elements");
		
		for(int i=0 ; i<arr.length ; i++)
			arr[i] = sc.nextInt();
	}
	
	static void arr_print(int[]arr)
	{
		System.out.println("Array elements are");
		for(int i=0 ; i<arr.length ; i++)
			System.out.print(arr[i]+"   ");
			System.out.println();
	}
	
	static int[] arr_merge(int[]a , int[]b )
	{
		int []c = new int [a.length + b.length];
				
			/* for(int i = 0 ; i < a.length + b.length ; i++)
				{
					if(i<a.length)
							c[i]=a[i];
						else
							c[i]= b[ i - a.length ];
									
				}
					*/
			int k=0;
			for(int i=0;i<a.length;i++)
			{
				c[k++] = a[i];
			}
			for(int i=0;i<b.length;i++)
			{
				c[k++] = b[i];
			}
			
		return c;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Array size");
		int n = sc.nextInt();
		
		int[]A= new int[n];
		
		arr_read(A);
		arr_print(A);
		
		System.out.println("Array size");
		int m = sc.nextInt();
		int[]B= new int [m];
		
		arr_read(B);
		arr_print(B);
		
		int []c = arr_merge(A,B);
		
		System.out.println("array of merged elements of both matrix is is");
		
		arr_print(c);
	}

}
