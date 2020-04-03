package Radix;
import java.util.Scanner;

public class BinaryInto10Radix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Number");
		String s = sc.next();
		
		// it will convert any number of given specified radix into 10(simple integer)
		System.out.println(Integer.parseInt(s,2));
	}

}
