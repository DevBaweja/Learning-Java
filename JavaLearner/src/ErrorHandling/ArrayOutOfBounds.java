package ErrorHandling;

import java.util.Scanner;

public class ArrayOutOfBounds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter " + (i + 1) + " element");
			a[i] = sc.nextInt();
		}
		System.out.println("next element is " + a[a.length + 1]);

	}

}
