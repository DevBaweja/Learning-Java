import java.util.Scanner;
public class ArmstrongNumbers {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt(),count=0,res=0;
		for(int temp=n;temp>0;temp/=10,count++) ; // null loop
		// it will calculate total digits
		for(int temp=n;temp>0;temp/=10)
			res += Math.pow(temp%10, count);
		String k = "Number "+n+" is ";
		k += (res==n)?"Armstrong":"Non-Armstrong";
		System.out.println(k);
	}
}
