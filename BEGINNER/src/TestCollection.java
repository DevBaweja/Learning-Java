import java.util.Scanner;

public class TestCollection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int givenmin[] = {1,7,4,2,0}; // for min mapping
		while(t-->0)
		{
			int unit  = sc.nextInt();
			
			int  next = unit%7;
			int remcases = unit/7; 
			
			if(next==1)
			{
				System.out.print("10");
				remcases--;
			}
			
			if(next>=2 && next<6) // cases 2,3,4,5,6
				System.out.print(givenmin[next-2]); // for proper mapping
			
			if(next==6)
				{
					if(remcases==0)
						System.out.print(givenmin[next-2]);
					else 
						System.out.print("6");
				}
			
				
			
			for (;remcases>0;remcases--) 
				System.out.print("8");
			
			System.out.print(" ");
			if(unit%2!=0) // odd
				System.out.print("7");
			
			for (int mincases = unit/2-unit%2; mincases > 0; mincases--)
				System.out.print("1");
			
			System.out.println();
		}
	}
}
