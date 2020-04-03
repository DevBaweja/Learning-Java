package Label;
// Reading only numbers that are +ve prime 
// else do not read any further numbers
import java.util.Scanner;
public class BreakLabelStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total numbers");
		int n = sc.nextInt(); 
label:		for(int i=1;i<=n;i++)
		{
			System.out.println("enter "+i+" number");
			int  num = sc.nextInt();
			if(num<=0)
			{
				System.out.println("number must be positive");
				System.out.println("end");
				break;  // directly outside
			}
			// whenever we use break statement no need to put else 
			// break is itself acting as an else block
			for(int j=2;j<=num/2;j++)
			{
				if(num%j==0)
				{
					System.out.println("number must be prime");
					break label; // if only break then it again do outer loop , it will break only inner loop 
						   // in order to make it no read number then we must use break label;
				}	
			}
			System.out.println(num+" is prime");
		}

		
		
	}

}
