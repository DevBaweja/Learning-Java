// Armstrong numbers sum of (digit)^number of digits when is itself equal to given number
import java.util.Scanner;
public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		// count digit
		int count=0; 
		for(int temp=num;temp>0;temp /= 10 , count++) ; // null loop
		int sum=0;
		for(int temp=num;temp>0;temp /= 10)
			sum += Math.pow(temp%10,count);
		if(sum==num)
			System.out.println("armstrong number");
		else 
			System.out.println("NOT armstrong number");
	}

}
