package Matrix;
// 2-D array matrix reading and printing
import java.util.Scanner;

public class IsMatrixPallindrome {
	
	static void readmatrix(int mat[][])
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mat.length; i++)
		{
			
				for(int j=0; j<mat[i].length ; j++)
				{	
					System.out.println("enter element of "+(i+1)+" row and "+(j+1)+" column" );
					mat[i][j] = sc.nextInt();
				}
		}
	}

	static void printmatrix(int mat[][])
			{
			for (int i = 0; i < mat.length; i++)
				{	
					for(int j=0; j<mat[i].length ; j++)
						System.out.print(mat[i][j]+"\t");
				
					System.out.println(); // next line		
				}
			}
	
	static void printarray(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		System.out.println();
	}
	
	static boolean ispallindrome(int num) {
		int rev=0; // for reverse storing
		for(int temp=num;temp>0;temp /= 10)
			rev = rev*10 + (temp%10);
		if(rev==num)
			return true;
		else 
			return false;	
	}
	
	static int[] matintopal(int [][]mat)
	{
		boolean status[][] = new boolean[mat.length][mat[0].length]; // using boolean array to store whether number is prime or not
		// initial all are false for non prime
		int count=0; // it is for prime numbers
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(ispallindrome(mat[i][j]))
				{	
					status[i][j] = true; // true is for pallindrome
					count++;
				}
			}
		}
		
		int temp[] = new int[count];
		int t=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(status[i][j]==true)
					temp[t++] = mat[i][j];
			}
		}
		
		return temp;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size row ");
		int r = sc.nextInt();
		System.out.println("enter size column ");
		int c = sc.nextInt();

		// array
		int [][] mat = new int [r][c] ;
		
		System.out.println("enter "+mat.length*mat[0].length+ " elements");
		readmatrix(mat);
		System.out.println("given matrix");
		printmatrix(mat);
		
		int pal[] = matintopal(mat);
	
		System.out.println("pallindrome array");
		printarray(pal);
	}

}
