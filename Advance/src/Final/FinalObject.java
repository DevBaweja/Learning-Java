package Final;

public class FinalObject {
}

class Demo {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		final FinalObject a = new FinalObject();
		FinalObject b = new FinalObject();
				
		// a = b; will give error		
//		You cannot change the value of the reference (which is an address pointing to the object). So once you declare a reference as final, 
//		you cannot reassign it to another object. So declaring a variable as final is like making it a constant. 
//		Note that the object can be modified even if the reference is final.
		
		// variables , methods , class , object can also be declared as final
	}
}
