package pack1;


// default visibility FRIENDLY ACCESS ie to same level or same package access
public class Functions {
	

	public boolean  IsPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			return false;
		}
		return true;
		
	}
	
	static int Sum (int a,int b) 
	{
		return (a+b);
	}
	// use of static so that it can be called by class name 
	// we dont have to create objects of it
	public static int Factorial(int n)
	{
		int fac=1;
		for(int i=n;i>0;i--)
			fac *= i;
		return fac;
	}
	
	static float AreaFun (float r)
	{
		return (3.14f*r*r);
	}

}
