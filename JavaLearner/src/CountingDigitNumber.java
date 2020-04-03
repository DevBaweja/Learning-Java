import java.util.Scanner;
public class CountingDigitNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int count =0;
		for(int temp=num;temp>0;temp /=10,count++) ; // ie null loop
		System.out.println("total digits :"+count);
	}

}
