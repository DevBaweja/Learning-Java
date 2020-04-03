package pack2;

import pack1.Fun;

public class NonSubFun {

	public static void main(String[] args) {
		
		//Non Derived class
		
		Fun F = new Fun();
		
		// in other package only public travels if it is not derived class
		
		F.pub_fun(); 		
	//	F.fri_fun(); // friendly access
	//	F.pro_fun();  
		
		// F.pri_fun();
		// private method
	}

}
