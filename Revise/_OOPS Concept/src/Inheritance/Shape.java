package Inheritance;

abstract public class Shape {
	
	private String name;
	public static final float pi = 3.14f;
	
	abstract void area();
	abstract void perimeter();
	abstract void noofsides();
	
	Shape(String name)
	{
		this.name = name;
	}
	
	void display()
	{
		System.out.println("Shape name is: "+name);
	}

}
