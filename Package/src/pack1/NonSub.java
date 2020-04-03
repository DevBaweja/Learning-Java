package pack1;

public class NonSub {

	public static void main(String[] args) {

		// Nonsub means it is not derived class 
		// in same package
		
		Fun F = new Fun();
		F.fri_fun(); // friendly access
		F.pub_fun(); // public access 
		F.pro_fun(); // protected access
	// 	F.pri_fun();
		
	}

}
