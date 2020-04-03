package Anonymous;

public class DemoA {

	public static void main(String[] args) {
		
		// Anonymous inner class
		A obj = new A() {
			public void show() {
				System.out.println("Call,Sms,Audio");
			}
		};
		
		obj.show();
	}
}
