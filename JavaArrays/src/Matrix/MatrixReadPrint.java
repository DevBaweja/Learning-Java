package Matrix;
// 2-D array matrix reading and printing
import java.util.Scanner;

public class MatrixReadPrint {

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
		for (int i = 0; i < mat.length; i++)
		{
			
				for(int j=0; j<mat[i].length ; j++)
				{	
					System.out.println("enter element of "+(i+1)+" row and "+(j+1)+" column" );
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
		

	}

}
