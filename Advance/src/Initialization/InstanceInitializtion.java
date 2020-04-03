package Initialization;

public class InstanceInitializtion {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test t2 = new Test();
	}
}

class Test
{
	private int x;
	
	{
		System.out.println("Initialization Block "+x);
		x = 5 ;
	}
	
	public Test() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor "+x);
	}
}
