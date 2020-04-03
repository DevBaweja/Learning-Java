package Inheritance;
public class Rectangle1 implements Shape1{

	private float l , b;
	
	Rectangle1(float l,float b) 
	{
		this.l = l;
		this.b = b;
	}
	public void display()
	{
		System.out.println("Rectangle Shape");
	}
	public void area()
	{
		display();
		System.out.println("area");
		System.out.println(l*b);
		
	}
	public void perimeter()
	{
		display();
		System.out.println("perimeter");
		System.out.println(2*l*b);
		
	}
	public void noOfSides()
	{
		display();
		System.out.println("4 sides");
	}
	
}
