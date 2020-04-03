package Inheritance;
public class Triangle1 implements Shape1{
	
	private float b,h;
	
	Triangle1(float b,float h) 
	{
		this.b = b;
		this.h = h;
	}
	public void display()
	{
		System.out.println("Rectangle shape");
	}
	public void area()
	{
		display();
		System.out.println("area");
		System.out.println(0.5*b*h);
		
	}
	public void perimeter()
	{
		display();
		System.out.println("perimeter");
		System.out.println(2*b*h);
		
	}
	public void noOfSides()
	{
		display();
		System.out.println("3 sides");
	}
	
}
