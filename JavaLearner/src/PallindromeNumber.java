// Pallindrome numbers reverse and number are identical
import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int temp; // as it is to be used other than loop
		int rev=0; // for reverse storing
		for(temp=num;temp>0;temp /= 10)
			rev = rev*10 + (temp%10);
		System.out.println(rev);
		if(rev==num)
			System.out.println("pallindrome");
		else 
			System.out.println("NOT pallindrome");
	}

}
