import java.util.Scanner;
public class CountingDigitNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt(),count=0;
		for(int i=n;i>0;i /= 10,count++);
		System.out.println("Digits "+count);
	}

}
