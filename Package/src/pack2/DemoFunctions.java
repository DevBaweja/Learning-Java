package pack2;

import java.util.Scanner;

import pack1.Functions; // importing that class

public class DemoFunctions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// as they are static so it should be called by class name itself
		// and no need to create object
		// to access it function must be of public access modifires
		System.out.println(Functions.Factorial(5));
		
		int n = sc.nextInt();
	Functions F = new Functions();
	// 
	if(F.IsPrime(n))
		System.out.println("prime");
	else 
		System.out.println("non prime");
		

	}

}
