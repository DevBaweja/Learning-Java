import java.util.Scanner;
public class AllArmstrongInRange {

	
	static boolean isarmstrong(int num)
	{
		int count=0; 
		for(int temp=num;temp>0;temp /= 10 , count++) ; // null loop
		int sum=0;
		for(int temp=num;temp>0;temp /= 10)
			sum += Math.pow(temp%10,count);
		if(sum==num)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range");
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i =n;i<=m;i++)
		{
		if(isarmstrong(i))
			System.out.println(i);
		}
		
	}

}


