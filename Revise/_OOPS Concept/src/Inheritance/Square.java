package Inheritance;

public class Square extends Shape{

	private float s;
	
	Square(float  s) {
		super("Square");
		this.s = s;
		
	}

	@Override
	void area() {
		System.out.println("Area is: "+(s*s));
		
	}

	@Override
	void perimeter() {
		System.out.println("Perimeter is: "+(4*s));
		
	}

	@Override
	void noofsides() {
		
		System.out.println("3 Sides");
	}

}
