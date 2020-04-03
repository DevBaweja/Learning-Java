package DefaultInterface;

public class InterfaceStatic {

	public static void main(String[] args) {
		
		SI.show();
	}
}

interface SI
{
	static void show()
	{
		System.out.println("Static Method");
	}
}
