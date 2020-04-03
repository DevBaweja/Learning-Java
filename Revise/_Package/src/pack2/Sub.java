package pack2;

import pack1.Fun;

public class Sub extends Fun{

	Sub()
	{
		
		// in other package public and protected travels if it is derived class 
		
		super.pub_fun();
	//	super.fri_fun();
		
		super.pro_fun();
		
	// 	super.pri_fun();
	
	}
	
	// instead of this constructor we make 
	/*
	  void display()
	  {
	  		super.pub_fun();
		super.fri_fun();
		super.pro_fun();
		
	// 	super.pri_fun();
	  
	 } 
	 */
	
	// in main
}
