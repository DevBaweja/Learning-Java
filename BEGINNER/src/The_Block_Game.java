import java.util.Scanner;

 public class The_Block_Game{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String num = sc.next();
			boolean flag = true; // Assume Pallindrome
			for (int i = 0; i < num.length(); i++) 
			{
				if(num.charAt(i)!=num.charAt((num.length()-i)-1))
						{
							flag=false;
							break;
						}
			}
			System.out.println(flag?"wins":"losses");
		}
	}
 }
//public class The_Block_Game {
//
//	static boolean ispallindrome(int num) {
//		int rev=0; // for reverse storing
//		for(int temp=num;temp>0;temp /= 10)
//			rev = rev*10 + (temp%10);
//		if(rev==num)
//			return true;
//		else 
//			return false;	
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0) {
//			
//		int num = sc.nextInt();
//	if(ispallindrome(num))
//		System.out.println("wins");
//	else 
//		System.out.println("losses");
//		
//		}
//	}
//}


//import java.io.*;
//class Solution
//{
//	public static void main(String[] args)throws IOException
//	{
//		BufferedReader st=new BufferedReader(new InputStreamReader(System.in));
//		int T=Integer.parseInt(st.readLine());
//		while(T-->0)
//		{
//			boolean flag=true;
//			String str=st.readLine();
//			for(int i=0;i<(str.length()+1)/2;i++)
//				if(str.charAt(i)!=str.charAt(str.length()-1-i))
//				{
//					flag=false;
//					break;
//				}
//			if(flag)
//				System.out.println("wins");
//			else
//				System.out.println("losses");
//		}
//	}
//}