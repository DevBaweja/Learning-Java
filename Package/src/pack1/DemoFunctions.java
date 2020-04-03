package pack1;

import java.util.Scanner;

public class DemoFunctions {

	public static void main(String[] args) {
		
		Fun R = new Fun();
		R.pub_fun();
		
		
		Scanner sc = new Scanner(System.in);
		// as they are static so it should be called by class name itself
		System.out.println(Functions.Factorial(5));
		
		int n = sc.nextInt();
	Functions F = new Functions();
	if(F.IsPrime(n))
		System.out.println("prime");
	else 
		System.out.println("non prime");
		

	}

}
