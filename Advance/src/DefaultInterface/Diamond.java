package DefaultInterface;

public class Diamond {

	public static void main(String[] args) {
		
		DiC obj = new DiC();
		obj.show();
	}
}


interface DiA 
{
	default void show()
	{
		System.out.println("DiA Show");
	}
}

interface DiB
{
	default void show()
	{
		System.out.println("DiB Show");
	}
}

class DiC implements DiA,DiB
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Need to declare it here");
		System.out.println("Otherwise diamond problem will occur");
	}
	
}
