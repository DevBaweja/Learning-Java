package Overloading;
// overloading of functions
import java.util.Scanner;

public class MaxOverloading {
	
	static int max (int a,int b)
	{
		if(a>b) 
			return a ;
			else		
			return b ;

	}
	
	static int max (int a,int b,int c)
	{
		if(a>b && a>c)
			return a;
		else
			if(b>c)
				return b;
			else 
				return c;
	}
	
	static int max (int a,int b,int c,int d)
	{
		if(a>b && a>c && a>d)
			return a;
		else 
			if(b>c && b>d)
				return b;
			else 
				if(c>d)
					return c;
				else
						return d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Max of two number: "+max(a,b));
		
		System.out.println("enter one more numbers");
		int c = sc.nextInt();
		System.out.println("Max of three number: "+max(a,b,c)); 

		System.out.println("enter one more numbers");
		int d = sc.nextInt();
		System.out.println("Max of four number: "+max(a,b,c,d)); 
		
		
		// max ( max ( max(a,b) ,c ) , d);
		
		// max ( max (a,b) , max(c,d) )
			    
		// max ( max (a,b,c) , d ) 


	}

}
