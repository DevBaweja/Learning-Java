public class StaticBlock {
	static {
		System.out.println("In static block 1");
	}
	// special thing about static block is that it is called even after main
	// when class is loaded in JVM

	static {
		System.out.println("In static block 2");
	}

	public static void main(String[] args) {

		System.out.println("Hello World");
		// but here i want is to not write anything in main
		// so we have to make another class and function that may be static or
		// non-static
		// but i also dont want to do anything like this
		// so we can use static block
	}
}
