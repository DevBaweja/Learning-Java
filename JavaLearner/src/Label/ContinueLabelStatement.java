package Label;
// Reading only numbers that are +ve prime 
// else do read any further numbers
import java.util.Scanner;
public class ContinueLabelStatement {

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
				continue;  // directly outside
			}
			for(int j=2;j<=num/2;j++)
			{
				if(num%j==0)
				{
					System.out.println("number must be prime");
					continue label; // if only continue then it again do inner loop  
						   // in order to make it outer loop then we must use continue label;
				}	
			}
			// if it do not go to label meaning it is prime
			System.out.println(num+" is prime");
		}

		
		
	}

}