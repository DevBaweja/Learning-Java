//import java.util.Scanner;
//
//public class Fit_Squares_in_Triangle {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0)
//		{
//			int b = sc.nextInt(); // size 2X2
//			int n = (b/2)-1;
//			if(n<=0)
//				System.out.println("0");
//			else 
//				System.out.println(((n*(n+1))/2));
//		}
//	}
//}

import java.util.Scanner;

public class Fit_Squares_in_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int b = sc.nextInt(); // size 2X2
			System.out.println(((b/2)*((b/2)-1))/2);
		}
	}
}
