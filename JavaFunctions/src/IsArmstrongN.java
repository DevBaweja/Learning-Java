// spliting of array into two different array of armstrong and non armstrong
// using boolean status array 
// using isarmstrong function
import java.util.Scanner;
public class IsArmstrongN {

	static void readarray(int a[])
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter "+i+" element");
			a[i] = sc.nextInt();
		}
	}
	
	static void printarray(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		System.out.println();
	}
	
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
		System.out.println("enter size");
		int n = sc.nextInt();
		
		// array 
				int a[] = new int[n];
				readarray(a);
		// print
				System.out.println("given array");
				printarray(a);
				
				boolean []status = new boolean[a.length];
				int armcount = 0 ;
				for(int i=0;i<a.length;i++)
				{
					if(isarmstrong(a[i]))
					{
						status[i] = true;
						armcount++;
					}
				}
				
				
				// arrays 
				int []arm = new int[armcount];
				int []nonarm = new int[a.length-armcount];
				int p=0;
				int q=0;
				for(int i=0;i<a.length;i++)
				{
				if(status[i])
					arm[p++] = a[i];
				else 
					nonarm[q++] = a[i];	
				}	
				
				// print
				System.out.println("armstrong array");
				printarray(arm);
				System.out.println("non armstrong array");
				printarray(nonarm);
					

	}

}




