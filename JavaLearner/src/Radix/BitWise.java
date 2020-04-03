package Radix;

public class BitWise {
	
	public static void main(String[] args) {
		
		int a = 25; // 1 1 0 0 1
		int b = 15; // 0 1 1 1 1
		
		// Performing bitwise operation
		
		int c = a & b;
		int d = a | b;
		
		// 1 1 0 0 1
		// 0 1 1 1 1
		 
//c=	// 0 1 0 0 1
		
//d= 	// 1 1 1 1 1		
		
		System.out.println(c);	
		System.out.println(d);
	}
}
