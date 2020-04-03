package ReadPrintLength;
import java.util.Scanner;

public class _3D_Arrays {
	
	static void readmat(int [][][]mat)
	{
		Scanner sc = new Scanner(System.in);
		for(int k=0 ; k < mat.length ; k++)
		{
			for (int i=0; i < mat[k].length; i++)
			{
			
				for(int j=0; j<mat[k][i].length ; j++)
				{	
					System.out.println("enter element of "+(k+1)+" page "+(i+1)+" row and "+(j+1)+" column" );
					mat[k][i][j] = sc.nextInt();
				}
			}
		}
	}
	
	static void printmat(int [][][]mat)
	{
		// print
				for(int k=0 ; k < mat.length ; k++)
				{
					for (int i=0; i < mat[k].length; i++)
					{
					
						for(int j=0; j<mat[k][i].length ; j++)
						{	
							System.out.print(mat[k][i][j]+"\t");
						}
					System.out.println();
					}
					System.out.println();
					System.out.println();
				}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter page");
		int p = sc.nextInt();

		// declaration of array
		int [][][]mat = new int[p][][]; // giving only pages	
		
		
		// pages = mat.length 
		// row = mat[k].length
		
		// memory allocation
		for(int k=0;k<mat.length;k++)
		{
			System.out.println("enter rows of "+(k+1)+" pages");
			int r = sc.nextInt();
			mat[k] = new int[r][]; // defined rows but not columns
			for(int i=0;i<mat[k].length;i++)
			{
				System.out.println("enter column of "+(i+1)+" rows "+(k+1)+" page");
				int c = sc.nextInt();
				mat[k][i] = new int[c]; // defined columns
			}
		}
			
			readmat(mat);
			printmat(mat);
	}

}
