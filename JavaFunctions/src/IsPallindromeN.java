import java.util.Scanner;

// spliting of array into two different array of pallindrome and non pallindrome
// using boolean status array 
// using ispallindrome function

public class IsPallindromeN {
	
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
	
	static boolean ispallindrome(int num) {
		int rev=0; // for reverse storing
		for(int temp=num;temp>0;temp /= 10)
			rev = rev*10 + (temp%10);
		if(rev==num)
			return true;
		else 
			return false;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		// array 
				int []a = new int [n];
				// scan
				readarray(a);
				// print
				System.out.println("given array");
				printarray(a);
				
				boolean status[] = new boolean[a.length];
				int count = 0; // for counting pallindrome numbers
				for(int i=0;i<a.length;i++)
				{
					if(ispallindrome(a[i]))
					{
						status[i] = true ; // true is for pallindrome
						count++;
					}
				}
				
				// arrays
				int pal[] = new int[count];
				int nonpal[] = new int[a.length-count];
				
				int p=0,q=0;
				for(int i=0;i<a.length;i++)
				{
					if(status[i])
						pal[p++] = a[i];
					else
						nonpal[q++] = a[i];
				}
				
				System.out.println("pallindrome array");
				printarray(pal);
				System.out.println("non pallindrome arra");
				printarray(nonpal);
				
	}

}
