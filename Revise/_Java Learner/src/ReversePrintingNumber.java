import java.util.Scanner;
public class ReversePrintingNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		for(int i=n;i>0;System.out.print(i%10),i/=10);
	}
}
