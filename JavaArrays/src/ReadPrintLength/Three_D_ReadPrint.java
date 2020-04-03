package ReadPrintLength;
// 2-D array matrix reading and printing
import java.util.Scanner;

public class Three_D_ReadPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter page numbers");
		int p = sc.nextInt();
		System.out.println("enter size row ");
		int r = sc.nextInt();
		System.out.println("enter size column ");
		int c = sc.nextInt();

		// declaration of array
		int [][][] mat = new int [p][r][c] ;
		
 /*
  * using p = mat.length
  * using r = mat[k].length
  * using c = mat[k][i].length
  */
		System.out.println("enter "+mat.length*mat[0].length*mat[0][0].length+ " elements");
		// reading
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

}