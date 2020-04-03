package Inheritance;

public class ObjectSlicing {

	public static void main(String[] args) {

		Child c1 = new Child(10,20,4.5f,5.5f);
		c1.display(); // is of derived
		
		Parent P1 = new Parent();
		P1.display(); // direct calling of base
		
		Parent P2 = new Parent();
		P2 = c1; // Object Slicing
		// and then calling of base
		P2.display();

	}

}
