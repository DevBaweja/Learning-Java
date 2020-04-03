package ReadPrintLength;
// arrays in java are dynamically allocated
import java.util.Scanner;


public class ArrayReadPrint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		int arr[]; // it will generate null pointer int *array;
		arr = new int[n]; // memory allocation 
		// array = (int *) malloc (n*sizeof(int));
		
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++)
	// n is replaced by arrayname.length
			{
			System.out.println("enter "+i+" element");
			arr[i] = sc.nextInt();  // scanning
			}
		 
		System.out.println("array elements are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+" index: "+arr[i]);
			
		}
		
	}

}
