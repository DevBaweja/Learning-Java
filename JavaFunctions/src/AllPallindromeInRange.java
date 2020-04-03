import java.util.Scanner;

public class AllPallindromeInRange {

	
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
		System.out.println("enter range");
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=n ; i <=m ; i++ )
		{
			if(ispallindrome(i))
				System.out.println(i);
		}
		
	}

}
