// sum of (digit)^3 using Math.pow();
import java.util.Scanner;
public class SumOfDigitCubes {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int num = sc.nextInt();
	int sum =0;
	for(int temp=num;temp>0;temp /= 10)
		sum += (int) Math.pow((temp%10),3); // math function
	System.out.println("sum :"+sum);
	}

}
