package Inheritance;

public class DemoDynamicDispatchMethod {

	public static void main(String[] args) {
		
		Base Bref = new Derived();
		// Run time linking
		Bref.display(); // derived calling
		// but in c++ base call
		
		Bref.show(); // Base
		
		// Bref.welcome(); 
		// as it is only defined in derived
		
		

	}

}
