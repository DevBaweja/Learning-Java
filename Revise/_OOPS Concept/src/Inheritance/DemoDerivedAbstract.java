package Inheritance;

public class DemoDerivedAbstract {
	
	public static void main(String[] args)
	{
	Base1 Bref = new Derived1();
	
	
	
	// base ref and derived object
	// cannot call derived methods 
	// only call base methods 
	Bref.show();
	//and common methods(which will be of derived)(Dynamic dispatch)
	Bref.display();
	// calling derived method which is not present in base
	// then declare its prototype in base call also
	// by making its abstract method 
	// if we make abstract method then class must be made abstract 
	// if class is abstract then its object cannot be made
	// it means it can only be used to create ref
	// so there is always abstract base class as no objects and not abstract derived class 
	// as derived are supposed to make objects
	
	Bref.welcome(); // will be of derived by base ref 
	
	}
}
