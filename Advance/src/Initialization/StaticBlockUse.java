package Initialization;
public class StaticBlockUse {

	// use of static block
	static String pi = "";
	
	static {
		pi = "3.14";
	}

	public static void main(String[] args) {
		System.out.println("Value of pi is: " + pi);
	}
}
