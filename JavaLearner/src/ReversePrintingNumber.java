import java.util.Scanner;
public class ReversePrintingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		for(int temp=num;temp>0;temp /= 10) 
			System.out.print(temp%10); // remainder is printed
	}

}
