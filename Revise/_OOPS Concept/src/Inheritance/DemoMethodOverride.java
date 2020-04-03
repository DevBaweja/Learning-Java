package Inheritance;

public class DemoMethodOverride {

	public static void main(String[] args) {
		
		Base B = new Base();
		// only two function 
		B.display();
		B.show();
		
		Derived D = new Derived();
		// four function
		// two of base and two of derived
		D.show(); // only in base
		D.welcome(); // only in derived
		
		
		D.display(); // Both in derived and base
		// common method in both derived and base
		// derived method override the base method
		// then Method OverRiding 
		
		
		
		Derived A = new Derived();
		A.display(); // is of Derived but to call for base display
		// one method is that we use super.display() in derived class display()
		
		Base C = new Base();
		C=A; // object slicing
		C.display(); // will be of base
	}

}
