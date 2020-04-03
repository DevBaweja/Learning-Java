package Initialization;

public class AboutStatic {

	public static void main(String[] args) {
		
		Child.show();
		// Child.i;
	}
}
// static methods are inheritance by Derived class 
// static variables are not inheritance by Derived class
class Parent
{
	static int i = 10;
	public static void show() {
		// TODO Auto-generated method stub
		System.out.println("Inherited");
	}
}

class Child extends Parent
{

	
}

// Also override static methods of Base class in Derived class is called Method Hiding
// But in case of non-static methods it is called as Method Overriding
