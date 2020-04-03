package Inheritance;
public class Triangle extends Shape{
	
	private float b,h;
	Triangle(float b,float h) 
	{
		super("Triangle");
		this.b = b;
		this.h = h;
	}
	void area()
	{
		display();
		System.out.println("area");
		System.out.println(0.5*b*h);
		
	}
	void perimeter()
	{
		display();
		System.out.println("perimeter");
		System.out.println(2*b*h);
		
	}
	void noOfSides()
	{
		display();
		System.out.println("3 sides");
	}
	
}
