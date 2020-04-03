package DefaultInterface;

public class ClassOverInterface {

	public static void main(String[] args) {

		C obj = new C();
		obj.show();
		// Third rule
		
		// Class is given more importance that interfaces
	}
}

interface A {

	default void show() {
		System.out.println("A");
	}
}

interface B {
	
	default void show()
	{
		System.out.println("B");
	}
}

class C {
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("C");
	}
}

class D extends C implements A,B
{	
	
}