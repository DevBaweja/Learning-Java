package pack2;

import pack1.Fun;

// import pack1.Fun;
// when compiled by command prompt we cannot access pack1

public class NonSub {

	public static void main(String[] args) {

		// Nonsub means it is not derived class 
		// in different package
		Fun F = new Fun();
		
		F.pub_fun(); // public access
		
		// F.fri_fun(); 
		// friendly access is only upto same level or same package
		
		
		
		//F.pro_fun();
		// protected access can be accessed in same package but it canot be access in defferent level if it is not derived class
		
	// 	F.pri_fun();
		
	}

}
