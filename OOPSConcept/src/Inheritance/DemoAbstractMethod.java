package Inheritance;
public class DemoAbstractMethod {

	public static void main(String[] args) {
		
		Base1 Bref = new Derived1();
		// Run time linking
		Bref.display();
		// when there is same method name in both base and derived class
		// and creating ref of the base and object of derived
		// calling that method is classed of derived class
		
		Bref.show(); // Base1
		
		
		Bref.welcome();
		// as it is only defined in derived1
		
		
		// Base1 B = new Base1();
		// Abstract classes object cannot be created
		// But  Base Ref can be possible
		// hence main purpose of abstract class is to inheritance it
		
	}

}
