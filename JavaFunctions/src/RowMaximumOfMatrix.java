
// 2-D array matrix reading and printing
import java.util.Scanner;

public class RowMaximumOfMatrix {
	
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
	
	
	static int[] maxrow(int [][]mat)
			{
				int []temp = new int[mat.length]; // here memory is allocated
				for(int i=0;i<mat.length;i++)
				{
					int jmax = 0; // max index
					for(int j=1;j<mat[i].length;j++)
					{
						if(mat[i][jmax] < mat[i][j])
							jmax = j;
					}
					temp[i] = mat[i][jmax];
				}
				return temp;
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
		
		// memory is not allocated here
		
			int maxarr[] = null;
 			maxarr = maxrow(mat); // returning array
 			
 			// int maxarr[] = maxrow(mat); 
		
		printarray(maxarr);
		
	
	}

}
