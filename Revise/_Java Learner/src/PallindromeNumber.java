import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt(),rev=0;
		for(int i=n;i>0;i/=10)
			rev = rev*10+(i%10);
		if(rev==n)
			System.out.println("pallindrome");
		else 
			System.out.println("NOT pallindrome");
	}

}
