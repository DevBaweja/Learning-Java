package pack1;

public class NonSubFun {

	public static void main(String[] args) {
		
		//Non Derived class
		
		Fun F = new Fun();
		
		
		F.pub_fun(); 		
		F.fri_fun(); // friendly access
		F.pro_fun();  
		
		// F.pri_fun();
		// private method
	}

}
