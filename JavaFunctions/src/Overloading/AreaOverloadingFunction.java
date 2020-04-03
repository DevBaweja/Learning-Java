package Overloading;
import java.util.Scanner;

public class AreaOverloadingFunction {
	
	static float area(float a)
	{
		return (a*a);
	}
	static float area(float a , float b)
	{
		return (a*b);
	}
	static double area(double a, double b)
	{
		return ((double)(.5)*a*b);
	}
	static double area(double a)
	{
		return ((double)3.14*a*a);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// square
		System.out.println("area of square");
		System.out.println("enter side");
		float s = sc.nextFloat();
		System.out.println("area is: "+area(s));
		// rectangle
		System.out.println("area of rectangle");
		System.out.println("enter length and breadth");
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println("area is: "+area(l,b));
		//triangle 
		System.out.println("area of triangle");
		System.out.println("enter base and height");
		double k = sc.nextDouble();
		double h = sc.nextDouble();
		System.out.println("area is: "+area(k,h));
		// circle
		System.out.println("area of circle");
		System.out.println("enter raduis");
		double r = sc.nextDouble();
		System.out.println("area is: "+area(r));
	}

}
