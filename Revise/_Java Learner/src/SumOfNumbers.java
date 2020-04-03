import java.text.DecimalFormat;
import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total numbers");
		int n = sc.nextInt(),sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter "+i+" Number");
			int k = sc.nextInt();
			sum += k;
		}
		float avg = (float)sum/n;
		DecimalFormat df = new DecimalFormat("0.00f");
		avg = Float.parseFloat(df.format(avg));
		System.out.println("Sum :"+sum);
		System.out.println("Average :"+avg);
	}

}
