// calculating sum of n numbers using one variable
import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);  // for inputs
	System.out.println("enter total numbers");
	int n= sc.nextInt();
	int sum=0; // it should be declared outside otherwise scope will be only in loop
	for(int i=1;i<=n;i++)
	{
		System.out.println("enter "+i+" number" );
		int num = sc.nextInt();
		sum += num;
	}
	System.out.println("sum is ="+sum);
	}

}


