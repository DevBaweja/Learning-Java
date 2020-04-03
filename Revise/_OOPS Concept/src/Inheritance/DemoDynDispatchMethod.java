package Inheritance;

public class DemoDynDispatchMethod {

	public static void main(String[] args) {
		
		Base Bref = new Derived();
		
		Bref.show(); // only in base
		
		
		// Dynamic dispatch method
		Bref.display(); //  derived class calling from base ref
		
		
		// Bref.welcome(); as it is only present in Derived

	}

}
