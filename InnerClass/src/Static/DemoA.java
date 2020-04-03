package Static;

public class DemoA {

	// now we dont need obj of A to access member of B class
	// as it is static class
	public static void main(String[] args) {

		A.i = 10;
		A.B obj = new A.B();
		obj.j = 20;
	}
	
	
}
