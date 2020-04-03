import java.util.Scanner;
public class SumOfDigitCubes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt(),sum=0;
		for(int i=n;i>0;i/=10)
			sum += Math.pow((i%10),3);
		System.out.println("sum: "+sum);
	}

}
