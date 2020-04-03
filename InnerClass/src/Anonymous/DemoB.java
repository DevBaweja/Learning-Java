package Anonymous;

public class DemoB {

	public static void main(String[] args) {
		
		// As B is an interface in order to use its functions 
		// we have to first implement it in one class to declare its functions
		// then we can use maybe that interface ref and create objects of any class those have implemented that interface
		// But how ever with anonymous class we can declare it right away
		
		// B obj = new B();  will give error as B is an interface is its methods have not been implemented
		
		// Anonymous class
		B obj = new B()
				{

					@Override
					public void show() {
						// TODO Auto-generated method stub
						System.out.println("Call,Sms,Audio");
					}
			
				};
				
				obj.show();
	}
}
