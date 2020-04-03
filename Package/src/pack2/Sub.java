package pack2;

import pack1.Fun;

public class Sub extends Fun{
	
	void display()
	{
		
		// sub meaning it is derived class. it is different package
		super.pub_fun();
		super.pro_fun();
		// When we extends it protected can be accessed in different package
		// ie why name is sub (meaning w=it is derived class)
		
		
		// super.fri_fun();
		// it cannot be accesses as it is only of friendly access upto same level or same package
		
		// super.pri_fun();	
		// as it is private it cannot be access
	}
	

}
