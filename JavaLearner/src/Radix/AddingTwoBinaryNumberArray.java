package Radix;

// will convert given value into arrays and finding its value i
import java.util.Scanner;

public class AddingTwoBinaryNumberArray {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Test Case");

		label: for (int k = sc.nextInt(); k > 0; k--) {

			System.out.println("Test Case: "+k);
			
			System.out.println("Enter First Number");
			String s1 = sc.next();
		
			System.out.println("Enter Second Number");
			String s2 = sc.next();
		
			int l = Integer.max(s1.length(),s2.length());
			int diff = Integer.max(s1.length(), s2.length()) - Integer.min(s1.length(), s2.length());
			
			int a[];
			a = new int[l];
			int ix;
			if(s1.length()>s2.length())
			{
				ix=0;
			}
			else
			{
				ix=diff;
				for(int j=0;j<diff;j++)
					a[j] = 0;
			}
			for (; ix < a.length; ix++) 
			{
				int x;
				if(s1.length()>s2.length())
					 x = Character.getNumericValue(s1.charAt(ix));
				else
					x = Character.getNumericValue(s1.charAt(ix-diff));

				
				if (x == 1 || x == 0)
					a[ix] = x;
				else 
				{
					System.out.println("Invalid binary number");
					continue label;
				}
			}
			
			int b[];
			b = new int[l];
			int iy;
			if(s1.length()<s2.length())
			{
				iy=0;
			}
			else
			{
				for(int j=0;j<diff;j++)
					b[j] = 0;
				iy=diff;
			}
			for (; iy < b.length; iy++) 
			{
				int x;
				if(s1.length()<s2.length())
					 x = Character.getNumericValue(s2.charAt(iy));
				else
					x = Character.getNumericValue(s2.charAt(iy-diff));

				
				if (x == 1 || x == 0)
					b[iy] = x;
				else 
				{
					System.out.println("Invalid binary number");
					continue label;
				}
			}
		
			
			// make calling by function 
			
		
			
			int c[] = new int[a.length+1]; 
			// initially all false
	
			
			int ans[] = new int[a.length+1];
			for (int i = a.length-1; i >= 0; i--)
			{
				
				ans[i] = a[i]+b[i];
				if(ans[i]==2)
						ans[i] = 0;
					
			}
			for (int i = 0; i < c.length; i++) 
				System.out.print(c[i]);
			System.out.println();
			for (int i = 0; i < a.length; i++) 
				System.out.print(a[i]);
			System.out.println();
			for (int i = 0; i < b.length; i++) 
				System.out.print(b[i]);
			System.out.println();
			for (int i = 0; i < ans.length; i++) 
				System.out.print(ans[i]);
			System.out.println();
		}
	}

}
