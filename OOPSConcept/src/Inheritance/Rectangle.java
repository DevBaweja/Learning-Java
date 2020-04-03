package Inheritance;
public class Rectangle extends Shape{

	private float l , b;
	Rectangle(float l,float b) 
	{
		super("rectangle");
		this.l = l;
		this.b = b;
	}
	void area()
	{
		display();
		System.out.println("area");
		System.out.println(l*b);
		
	}
	void perimeter()
	{
		display();
		System.out.println("perimeter");
		System.out.println(2*l*b);
		
	}
	void noOfSides()
	{
		display();
		System.out.println("4 sides");
	}
	
}
