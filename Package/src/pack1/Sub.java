package pack1;

public class Sub extends Fun{
	
	void display()
	{
		
		// sub meaning it is derived class. it is in same package
		super.pub_fun();
		super.pro_fun();
		// it can be accessed upon same levels
		
		super.fri_fun();
		// it cann be accesses as it is only of friendly access upto same level or same package
		
		
		 // super.pri_fun();	
	}
	

}
