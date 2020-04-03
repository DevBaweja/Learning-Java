package Inheritance;

public class Circle extends Shape{

	float raduis;
	
	Circle(float raduis)
	{
		super("circle"); // constructor of shape	
		this.raduis = raduis;
	}

	@Override
	void area() {
		display();
		System.out.println("area is: "+(Shape.pi*raduis*raduis));	
	}

	@Override
	void perimeter() {
		display();
		System.out.println("perimeter is: "+(2*Shape.pi*raduis));
	}
	
	@Override
	void noofsides() {
		display();
		System.out.println("No Sides");
		
	}
	
	

}
