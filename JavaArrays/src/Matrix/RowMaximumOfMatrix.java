package Matrix;
// 2-D array matrix finding max in each row and storing it into 1-d array
// here in finding maximum we use index 
// we can also use element of the matrix stored in them variable 

import java.util.Scanner;

public class RowMaximumOfMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size row ");
		int n = sc.nextInt();
		System.out.println("enter size column ");
		int m = sc.nextInt();

		// declaration of array
		int [][] mat = new int [n][m] ;
		System.out.println("enter "+n*m+ " elements");
		// reading
		for (int i = 0; i < mat.length; i++)
		{
			
				for(int j=0; j<mat[i].length ; j++)
				{	
					System.out.println("enter element of "+i+" row and "+j+" column" );
					mat[i][j] = sc.nextInt();
				}
		}
		// printing
		for (int i = 0; i < mat.length; i++)
		{	
				for(int j=0; j<mat[i].length ; j++)
				System.out.print(mat[i][j]+"\t");
				
		System.out.println(); // next line		
		}
		// finding max in each row
		int []A = new int[mat.length] ; // size should be number of rows
		for(int i=0; i<mat.length ;i++)
		{
			int jmax = 0; // assume 0 index is maximum
			for(int j=1; j<mat[i].length ;j++)
			{
				if( mat[i][jmax] < mat[i][j] )
					jmax = j; // finding maximum
			}
			A[i] = mat [i][jmax];
		}
			
		for(int i=0;i<A.length;i++)
		System.out.println(i+" index "+A[i]);
		

	}

}

