package Radix;
import java.util.Scanner;

public class AddingBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter First Number");
			String s1 = sc.next();
	
			int a[] = new int[s1.length()];
			
			for (int i = 0; i < a.length; i++) 
				a[i] = Character.getNumericValue(s1.charAt(i));
			
			
			System.out.println("Enter Second Number");
			String s2 = sc.next();
		
			int b[] = new int[s2.length()];
			
			for (int i = 0; i < b.length; i++) 
				b[i] = Character.getNumericValue(s2.charAt(i));
			
			// Carry array
				int c[] = new int[a.length+1];
			
			int ans[] = new int[c.length];
			for (int i = ans.length-2; i >= 0; i--)
					{
						ans[i] = a[i]+b[i]+c[i];
						if(ans[i]==2)
						{
							ans[i]=0;
							c[i-1]=1;
						}
						if(ans[i]==3)
						{
							ans[i]=1;
							c[i-1]=1;
						}
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
	}

}
