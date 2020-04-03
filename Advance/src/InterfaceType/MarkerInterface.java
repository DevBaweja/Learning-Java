package InterfaceType;

public class MarkerInterface {

	// use to check permission
	// Marker inteface dont have any variables or methods defined in it
	//  Cloneable,Remote,Serializable are marker inteface
	public static void main(String[] args) {
		
		
		User1 u1 = new User1();
		if(u1 instanceof P)
			u1.show();
		else
			System.out.println("Permission Denined");
		
		System.out.println();
		
		User2 u2 = new User2();
		if(u2 instanceof P)
			u2.show();
		else
			System.out.println("Permission Denined");
	}
	
	
	
}

interface P {
	
}

class User1 
{
	void show()
	{
		System.out.println("Permission Granted");
	}
}

class User2 implements P 
{
	void show()
	{
		System.out.println("Permission Granted");
		System.out.println("Password: 0000");
	}
}

