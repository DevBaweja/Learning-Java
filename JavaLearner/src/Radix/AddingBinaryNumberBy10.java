package Radix;
import java.util.Scanner;

public class AddingBinaryNumberBy10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int res = 0;
		for (int i = 1; i <= n; i++) 
		{
			String s = sc.next();
			int a[] = new int[s.length()];
			for (int j = 0; j < s.length(); j++) 
				a[i] = Character.getNumericValue(s.charAt(i));
			
			int current = 0;
			for (int j = 0; j < a.length; j++) 
			
		}
	}

}
