package Inheritance;

public class DemoMethodOveride {

	public static void main(String[] args) {
		
		Base B = new Base();
		B.show();
		B.display(); 
		// contain only two methods
		
		Derived D = new Derived();
		 // containing Four methods 
		// Two method of Base
		// Two method of Derived
		
		D.show(); // of base
		D.welcome(); // of derived
		
		D.display(); // METHOD OVERRIDING 
		// TWO SAME METHOD IN BOTH DERIVED AND BASE
		// OF DERIVED same in C++
	/*
	 * Same signature methods in both base and derived class 
	 * calling through Derived object
	 * then Derived method will be called Means
	 * Derived method overrides the base method	*/
	
	
	}

}
