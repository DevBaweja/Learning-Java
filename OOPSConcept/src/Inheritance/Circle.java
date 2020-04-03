package Inheritance;
public class Circle extends Shape {

	private float r;
	
	Circle(float r) 
	{
		super("circle");
		this.r = r;
	}
	void area()
	{
		display();
		System.out.println("area");
		System.out.println(pi*r*r);
	}
	void perimeter()
	{
		display();
		System.out.println("perimeter");
		System.out.println(2*pi*r);
		
	}
	void noOfSides()
	{
		display();
		System.out.println("no sides");
	}
}
