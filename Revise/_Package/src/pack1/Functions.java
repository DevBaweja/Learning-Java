package pack1;

public class Functions {

	
	// default friendly access
	public static int sum(int a,int b) // static called by class name
	{
		return a+b;
	}
	
	
	 public boolean isprime(int n) // called by objects
	{
		 for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				return false;
			}
			return true;
	}
	
	 
	 static int factorial(int n) // called by class and friendly access
	{
		int fac=1;
		for(int i=n;i>0;i--)
			fac *= i;
		return fac;
	}
}
