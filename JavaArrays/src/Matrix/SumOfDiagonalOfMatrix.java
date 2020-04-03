package Matrix;
// trace of diagonal matrix
import java.util.Scanner;

public class SumOfDiagonalOfMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of square matrix");
		int n = sc.nextInt();

		// declaration of array
		int [][] mat = new int [n][n]; // diagonal matrix
		System.out.println("enter "+mat.length*mat.length+" elements");

		for (int i = 0 ; i < mat.length ; i++)
		{
				for(int j=0 ; j < mat[i].length ; j++)
				{
					System.out.println("enter element of "+i+" row and "+j+" column");
					mat [i][j] = sc.nextInt();
				}		
		}
		
		for (int i = 0; i < mat.length; i++)
		{	
				for(int j=0; j<mat[i].length ; j++)
				System.out.print(mat[i][j]+"\t");
				
		System.out.println(); // next line		
		}
		
		int trace =0; // need trace outside of loop
		for (int i = 0 ; i < mat.length ; i++)
		{
				for(int j=0 ; j < mat[i].length ; j++)
				{
					if(i==j)
					{
						trace += mat[i][j];
					}
							
				}		
		}
		System.out.println("trace :"+trace);

	}

}
