package Recursion;
import java.util.Scanner;

public class RecursionFac {
	
		static int fac(int num)
		{
			if(num==1 || num==0)
				return 1;
			
				return (num*fac(num-1));
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int  num = sc.nextInt();
		System.out.println("fac is: "+fac(num)); 
	}

}
