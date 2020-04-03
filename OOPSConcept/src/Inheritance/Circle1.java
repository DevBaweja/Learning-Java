package Inheritance;
public class Circle1 implements Shape1 {

	private float r;
	
	Circle1(float r) 
	{
		this.r = r;
	}
	public void display()
	{
		System.out.println("Circle shape");
	}
	public void area()
	{
		display();
		System.out.println("area");
		System.out.println(Shape1.pi*r*r);
		
	}
	public void perimeter()
	{
		display();
		System.out.println("perimeter");
		System.out.println(2*Shape1.pi*r);
		
	}
	public void noOfSides()
	{
		display();
		System.out.println("no sides");
	}
}
