
// 2-D array matrix reading and printing
import java.util.Scanner;

public class RowMaximumOfMatrix1 {
	
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
		System.out.println("given array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	
	
	static void maxrow(int [][]mat,int max[])
			{
				for(int i=0;i<mat.length;i++)
				{
					int jmax = 0;
					for(int j=0;j<mat[i].length;j++)
					{
						if(mat[i][jmax] < mat[i][j])
							jmax = j;
					}
					max[i] = mat[i][jmax];
				}
			}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size row ");
		int r = sc.nextInt();
		System.out.println("enter size column ");
		int c = sc.nextInt();

		// declaration of array
		int [][] mat = new int [r][c] ;
		
 /*
  * using n = mat.length
  * using m = mat[i].length
  * 
  */
		System.out.println("enter "+mat.length*mat[0].length+ " elements");
		// reading
		readmatrix(mat);
		// printing
		printmatrix(mat);
		
		int maxarr[] = new int[mat.length]; // memory is allocated here
		
		maxrow(mat,maxarr); // calling function here and passing arrays and matrix
		
		printarray(maxarr);
		
	
	}

}
