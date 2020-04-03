package ReadPrintLength;
// using length property for dynamic allocation of matrix
import java.util.Scanner;

public class _2D_Arrays {
	
	static void readmat(int [][]mat)
	{
		// scan
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i <mat.length;i++)
		{
			for(int j=0 ; j<mat[i].length ;j++) // using mat[i].length
			{
				System.out.println("enter "+mat[i].length+" element for "+(i+1)+" row");
				mat[i][j] = sc.nextInt();
			}
		}
		
	}
	
	static void printmat(int [][]mat)
	{
		// print
		for(int i=0 ; i <mat.length;i++)
		{
			for(int j=0 ; j<mat[i].length ;j++) // using mat[i].length
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row");
		int r = sc.nextInt();

		// declaration of matrix
		int[][] mat = new int[r][]; // not fixed column

		// Memory allocation for dynamics allocation 
		
		for (int i = 0; i < mat.length; i++)
		{
			System.out.println("enter column for "+(i+1)+" row");
				int c = sc.nextInt();
				mat[i] = new int[c]; // making c column for i row
		}
		readmat(mat);
		printmat(mat);
		
	}

}
