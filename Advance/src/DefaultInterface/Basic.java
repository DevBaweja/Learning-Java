package DefaultInterface;

public class Basic {

	// Once Interface is defined it is not possible to add some more method as per updates
	// As user also manully have to add all the methods to all class that user have implement in any of class
	
	
	// So we use default keyword to define method in interface
	
	// Stream Class have method stream() which is defined in one of its interface List
	public static void main(String[] args) {
		
		DI obj = new DA();
		obj.add();
		
		obj.show();
	}

	
}

interface DI
{
	void add();
	default void show() 
	{
		System.out.println("Show");
	}
}

class DA implements DI
{
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Add");
	}
	
}