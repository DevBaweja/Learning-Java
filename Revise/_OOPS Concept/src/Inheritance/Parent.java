package Inheritance;

public class Parent {

	private int a,b;
	
	Parent()
	{
		a=b=0;
	}
	Parent(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void display()
	{
		System.out.println(a+"\t"+b);
	}
}
