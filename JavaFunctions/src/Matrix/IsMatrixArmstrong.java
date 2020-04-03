package Matrix;
// 2-D array matrix reading and printing
import java.util.Scanner;

public class IsMatrixArmstrong {
	
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
	
	static boolean isarmstrong(int num)
	{
		int count=0; 
		for(int temp=num;temp>0;temp /= 10 , count++) ; // null loop
		int sum=0;
		for(int temp=num;temp>0;temp /= 10)
			sum += Math.pow(temp%10,count);
		if(sum==num)
			return true;
		else 
			return false;
	}
	
	static int[] matintoarm(int [][]mat)
	{
		boolean status[][] = new boolean[mat.length][mat[0].length]; // using boolean array to store whether number is prime or not
		// initial all are false for non prime
		int count=0; // it is for prime numbers
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(isarmstrong(mat[i][j]))
				{	
					status[i][j] = true; // true is for armstrong
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
		
		int arm[] = matintoarm(mat);
	
		System.out.println("armstrong array");
		printarray(arm);
	}

}
