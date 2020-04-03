package ErrorHandling;

import java.util.Scanner;

public class ArrayOutOfBounds {

	public static void main(String[] args) {
		// Run Time Error while accessing 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter " + (i + 1) + " Number");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length + 1; i++)
			try {
				System.out.println("Array: " + (i + 1) + " element " + a[i]);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Inside Catch Block");
			}
	}

}
