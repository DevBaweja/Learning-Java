package Inheritance;

public class Rectangle extends Shape{

	private float l,b;
	
	
	Rectangle(float l,float b)
	{
		super("Rectangle");
		this.l = l;
		this.b = b;
	}

	@Override
	void area() {
		display();
		System.out.println("Area is: "+(l*b));
	}

	@Override
	void perimeter() {
		display();
		System.out.println("Perimeter is: "+(2*l*b));
	}

	@Override
	void noofsides() {
		display();
		System.out.println("4 sides");
	}

}
