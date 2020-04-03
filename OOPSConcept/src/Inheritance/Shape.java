package Inheritance;

abstract class Shape {
	
	public static final float pi = (float) 3.14;
	
	private String name ;
	
	abstract void area();
	abstract void perimeter();
	abstract void noOfSides();
	
	Shape(String name) 
	{
		this.name = name;
	}
	
	void display()
	{
		System.out.println("Shape name is : "+name);
	}

}
