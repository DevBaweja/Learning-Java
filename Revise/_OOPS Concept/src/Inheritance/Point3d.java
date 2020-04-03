package Inheritance;
import java.util.Scanner;

public class Point3d extends Point2d {

	private float z;
	
	void readPoint()
	{
		Scanner sc = new Scanner(System.in);
		super.readPoint();
		System.out.println("enter z");
		z = sc.nextFloat();
	}
	
	void showPoint()
	{
		super.showPoint();
		System.out.println(","+z+")");
	}
	
	
	
	Point3d ()
	{
		z=00;
	}
	
	Point3d (float x,float y,float z)
	{
		super(x,y);
		this.z = z;
	}
	
	
	Point3d(Point3d P)
	{
		super(P);
		z = P.z;
	}
	
	static float distance(Point3d P,Point3d Q)  // calling wihtout object so static method it is called by class name
	{
		return (float) Math.sqrt((Math.pow(P.getx()-Q.getx(),2)+Math.pow(P.gety()-Q.gety(),2) +Math.pow(P.z-Q.z,2)));
		// visibility of x and y is destroyed 
	}  
	
	
}
