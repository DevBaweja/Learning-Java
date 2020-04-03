package pack2;

import pack1.Functions;

public class DemoFactorial {

	public static void main(String[] args) {
		
		System.out.println(Functions.sum(5, 5));
		
	//	System.out.println(Functions.factorial(5));
		// function visibility is friendly access
		// static funtions

		
		Functions F = new Functions();
		
		if(F.isprime(7))
		{
			System.out.println("Prime");
		}
		else System.out.println("Non Prime");
		
	}

}
