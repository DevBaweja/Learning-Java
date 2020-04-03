package Member;

public class DemoA {

	public static void main(String[] args) {
		
		A obja = new A();
		obja.i = 10;
		
		// here i cannot directly access members of inner class B
		// Making object of b can not be made in this case as it is inner class
		// Making obj of class 
		
		A.B objb = obja.new B(); 
		// ie this class in member of A
		objb.j = 20;
	
		
	}
}
