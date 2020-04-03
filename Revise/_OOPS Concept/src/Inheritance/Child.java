package Inheritance;

public class Child extends Parent{
	private float x,y;
	
	Child()
	{
		x=y=0.0f;
	}
	
	Child(int a,int b,float x,float y)
	{
		super(a,b);
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		super.display();
		System.out.println(x+"\t"+y);
	}
}
