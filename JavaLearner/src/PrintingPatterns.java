import java.util.Scanner;
public class PrintingPatterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j+" " );  // using print as to do it on same line of code
			
			System.out.println(); // for next line  or System.our.print("\n") ; 
		}
		
	}

}
