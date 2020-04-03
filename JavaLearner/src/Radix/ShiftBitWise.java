package Radix;

public class ShiftBitWise {

	public static void main(String[] args) {
		
		int a = 8; // 1 0 0 0
			
		// Left Shift Operator
		int b = a << 2; // 1 0 0 0 0 0
		
		System.out.println(b);
		
		// Right Shift Operator
		int c = a >> 2; // 1 0 
		
		System.out.println(c);
	}
}
