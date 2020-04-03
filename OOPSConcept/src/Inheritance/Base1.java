package Inheritance;

 abstract class Base1 {

	void display()
	{
		System.out.println("Base display");
	}
	
	void show()
	{
		System.out.println("Base show");
	}
	
	abstract void welcome();
	// to use the method of derived class where ref is of base and object is of derived class
	// we need to give prototype of that method in base class by giving abstract to that method
	// and if any of the method is abstract then we have to make that class abstract
	// and if class is made abstract then we cannot create its object
	// hence it can only be used as ref . and not as object
	// so there is always abstract base class
	// there is no point of abstract derived class
	// as its object cannot be create only ref can be used
	}
