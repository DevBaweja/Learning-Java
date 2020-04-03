package Inheritance;
import java.util.Scanner;

public class Point2d {

	private float x,y;
	// It allow for Derived class
	
	void readPoint()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x");
		x = sc.nextFloat();
		System.out.println("enter y");
		y = sc.nextFloat();
	}
	
	void showPoint()
	{
		System.out.print("("+x+","+y);
	}
	
	
	
	Point2d()
	{
		x=y=00;
	}
	
	Point2d(float x,float y)
	{
		this.x = x;
		this.y = y;
	}
	
	
	Point2d(Point2d P)
	{
		x = P.x;
		y = P.y;
	}
	
	static float distance( Point2d A, Point2d B) // as it is not called through object we are calling it through object
	{
		return (float) Math.sqrt(Math.pow((A.x-B.x),2)+Math.pow((A.y-B.y),2)); 
	}
	
	float getx()
	{
		return x;
	}
	
	float gety()
	{
		return y;
	}
	
}
