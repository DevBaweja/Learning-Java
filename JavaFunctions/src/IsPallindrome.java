// Pallindrome numbers reverse and number are identical
import java.util.Scanner;

public class IsPallindrome {

	
	static boolean ispallindrome(int num) {
		int rev=0; // for reverse storing
		for(int temp=num;temp>0;temp /= 10)
			rev = rev*10 + (temp%10);
		if(rev==num)
			return true;
		else 
			return false;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
	if(ispallindrome(num))
		System.out.println(num+" is pallindome");
	else 
		System.out.println(num+" is not pallindrome");
		
		
	}

}
