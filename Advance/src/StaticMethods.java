

public class StaticMethods {

	@SuppressWarnings({ "static-access" })
	public static void main(String[] args) {
		MyMath obj = new MyMath();
		obj.name();
	}
}

class MyMath{
	
	public static void name() {
		System.out.println("Static Method called from Instance");
	}
}
