package ForEach;

import java.util.Scanner;

// using for each loop for array
// for is mostly used to access elements of the array
// For sequential approch we use foreach loop 
public class ForEachLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array");
		int a[] = new int[5];
		for(int num : a)
			num = sc.nextInt(); // here it will not be able to scan anything
		// as for scanning we need index
	}

}
