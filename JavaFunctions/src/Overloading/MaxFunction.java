package Overloading;
import java.util.Scanner;

public class MaxFunction {
	
	static int max2 (int a,int b)
	{
		if(a>b) 
			return a ;
			else		
			return b ;

	}
	
	static int max3 (int a,int b,int c)
	{
		if(a>b && a>c)
			return a;
		else
			if(b>c)
				return b;
			else 
				return c;
	}
	
	static int max4 (int a,int b,int c,int d)
	{
		if(a>b && a>c && a>d)
			return a;
		else 
			if(b>c && b>d)
				return b;
			else 
				if(c>d)
					return c;
				else return d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Max of two number: "+max2(a,b));
		
		System.out.println("enter one more numbers");
		int c = sc.nextInt();
		System.out.println("Max of three number: "+max3(a,b,c));  // max2( max2(a,b), c );

		System.out.println("enter one more numbers");
		int d = sc.nextInt();
		System.out.println("Max of four number: "+max4(a,b,c,d));  
		
		
		// max2 ( max2 ( max2 ( a , b ) ,c) , d);
		
		// max2 ( max2(a,b) , max2(c,d) )
			    
		// max2 ( max3(a,b,c) , d ) 

	}

}
