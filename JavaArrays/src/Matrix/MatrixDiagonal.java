package Matrix;

// 2-D array matrix reading and printing diagonal
import java.util.Scanner;

public class MatrixDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		// declaration of array
		int [][] mat = new int [n][n] ;
		
		System.out.println("enter "+(mat.length*mat.length)+ " elements");
		// reading
		for (int i = 0; i < mat.length; i++)
		{
			
				for(int j=0; j<mat[i].length ; j++)
				{	
					System.out.println("enter element of "+(i+1)+" row and "+(j+1)+" column" );
					mat[i][j] = sc.nextInt();
				}
		}
		// printing
		System.out.println("matrix");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("diagonal matrix");
		for (int i = 0; i < mat.length; i++)
		{	
				for(int j=0; j<mat[i].length ; j++)
				{
					if((i==j) || (i+j==mat.length-1))
						System.out.print(mat[i][j]+"\t");
					else 
						System.out.print("\t");
				}
				
		System.out.println(); // next line		
		}
		

	}

}
